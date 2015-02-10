/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavektor;

/**
 *
 * @author vektorel
 */
public class Ders4 {

    public void cokBoyutluDiziler() {
        int[][] diziAraba = new int[4][3];
        diziAraba[0][0] = 50;
        diziAraba[0][1] = 150;
        diziAraba[0][2] = 10;
        diziAraba[1][0] = 60;
        diziAraba[1][1] = 30;
        diziAraba[1][2] = 25;
        diziAraba[2][0] = 100;
        diziAraba[2][1] = 40;
        diziAraba[2][2] = 15;
        diziAraba[3][0] = 5;
        diziAraba[3][1] = 125;
        diziAraba[3][2] = 17;
        int eb=0;
        for (int i = 0; i < diziAraba.length; i++) {
            for (int j = 0; j < diziAraba[0].length; j++) {
               if(eb>diziAraba[i][j])
               {
                   eb= diziAraba[i][j];
               }
            }
        }
 
        System.out.println(eb);
    }
}
