/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ders13KutuphaneDao;

import Ders13KutupHanePojo.PersonelPojo;
import Ders13KutuphaneCfg.NewHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author user
 */
public class PersonelDao {
    
    public List<PersonelPojo> getAll(){
           Session session =NewHibernateUtil.getSessionFactory().openSession();
           Criteria crit=session.createCriteria(PersonelPojo.class);
           List result=crit.list();
           return result;
    }
    public List<PersonelPojo> getPersonel(String kolon,String deger){
    
           Session session =NewHibernateUtil.getSessionFactory().openSession();
           Criteria crit=session.createCriteria(PersonelPojo.class);
           crit.add(Restrictions.ilike(deger, kolon));
           List result=crit.list();
           return result;
    
    }
}
