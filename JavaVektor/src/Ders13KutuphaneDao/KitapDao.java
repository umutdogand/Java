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
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author user
 */
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
        crit.add(Restrictions.ilike(kolon, "%"+deger+"%"));
        List result = crit.list();
        return result;
    }
}
