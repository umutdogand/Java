/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13KutuphaneDao;

import Ders13KutupHanePojo.KitapPojo;
import Ders13KutuphaneCfg.NewHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


public class KitapDao {

    public List<KitapPojo> getAll() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(KitapPojo.class);
        List result = crit.list();
        return result;
    }

    public List<KitapPojo> getKitap(String kolon, String deger) {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(KitapPojo.class);
        crit.add(Restrictions.ilike(kolon, "%" + deger + "%"));
        List result = crit.list();
        return result;
    }

    public List<KitapPojo> getOrKitap(String kolon1, String deger1, String kolon2, String deger2) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(KitapPojo.class);
        Criterion c1 = Restrictions.eq(kolon1, deger1);
        Criterion c2 = Restrictions.lt(kolon2, deger2);
        LogicalExpression orExp = Restrictions.or(c1, c2);
        crit.add(orExp);
        List result = crit.list();
        return result;
    }

    public List<KitapPojo> getDisjunctionKitap() {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(KitapPojo.class);
        Criterion c1 = Restrictions.eq("adi", "");
        Criterion c2 = Restrictions.lt("tarih", "");
        Criterion c3 = Restrictions.between("baski", "", "");

        Disjunction dis = Restrictions.disjunction();
        dis.add(c3);
        dis.add(c2);
        dis.add(c1);
        crit.add(dis);

        List result = crit.list();
        return result;
    }

    public List<KitapPojo> getPagingKitap(int ilkKayitSirasi, int gelenKayitSayisi) {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(KitapPojo.class);
        crit.setFirstResult(ilkKayitSirasi);
        crit.setMaxResults(gelenKayitSayisi);
        List result = crit.list();
        return result;
    }

    public List<KitapPojo> getOrderKitap() {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(KitapPojo.class);
        crit.addOrder(Order.desc("adi"));
        List result = crit.list();
        return result;
    }

    public List getProjectionsKitap() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(KitapPojo.class);
        ProjectionList proList = Projections.projectionList();
        proList.add(Projections.avg("id"));
        proList.add(Projections.max("id"));
        proList.add(Projections.min("id"));
        crit.setProjection(proList);
        List result = crit.list();
        
        return result;
    }

    public List getColumnKitap(String kolon1, String kolon2, String kolon3) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(KitapPojo.class);
        ProjectionList proList = Projections.projectionList();
        proList.add(Projections.property(kolon1));
        proList.add(Projections.property(kolon2));
        proList.add(Projections.property(kolon3));
        List result = crit.list();
        return result;
    }
    
    
    
}
