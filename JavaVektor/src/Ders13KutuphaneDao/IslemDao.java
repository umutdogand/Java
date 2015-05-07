package Ders13KutuphaneDao;


import Ders13KutuphaneCfg.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class IslemDao {

    public void insert(Object o) {
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

    public void update(Object o) {
        Session sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = sesion.beginTransaction();
        sesion.update(o);
        t.commit();
    }
    
}
