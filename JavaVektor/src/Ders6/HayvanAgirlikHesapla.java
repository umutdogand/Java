package Ders6;

public class HayvanAgirlikHesapla {

    public double hesapla(String hayvanTuru) {
        if (hayvanTuru.equals("kedi")) {
            return kediAgirlik();
        } else if (hayvanTuru.equals("köpek")) {
            return kopekAgirlik();
        } else if (hayvanTuru.equals("fare")) {
            return fareAgirlik();
        }
        return 1.1;
    }

    public double kediAgirlik() {
        return 3.1;
    }
    public double kopekAgirlik() {
        return 12.3;
    }
    public double fareAgirlik() {
        return 1.2;
    }

}
