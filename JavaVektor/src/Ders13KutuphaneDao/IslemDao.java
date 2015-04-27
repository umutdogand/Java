package Ders13KutuphaneDao;

import Ders13KutupHanePojo.KitapPojo;
import Ders13KutuphaneCfg.NewHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class IslemDao {

    public void kayit(Object o) {
        try {
            Session sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction t = sesion.beginTransaction();
            sesion.save(o);
            t.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Object o) {
        Session sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = sesion.beginTransaction();
        sesion.delete(o);
        t.commit();
    }

    public void guncelle(Object o) {
        Session sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = sesion.beginTransaction();
        sesion.update(o);
        t.commit();
    }
     public List<KitapPojo> getAll(){
           Session session =NewHibernateUtil.getSessionFactory().openSession();
           Criteria crit=session.createCriteria(KitapPojo.class);
           List result=crit.list();
           return result;
    }
    
}
