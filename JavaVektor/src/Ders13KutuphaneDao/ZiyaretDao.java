package Ders13KutuphaneDao;

import Ders13KutupHanePojo.ZiyaretPojo;
import Ders13KutuphaneCfg.NewHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class ZiyaretDao {
    
    public List<ZiyaretPojo> getAll(){
        
           Session session =NewHibernateUtil.getSessionFactory().openSession();
           Criteria crit=session.createCriteria(ZiyaretPojo.class);
           List result=crit.list();
           return result;
    }
    public List<ZiyaretPojo> getZiyaret(String kolon,String deger){
    
           Session session =NewHibernateUtil.getSessionFactory().openSession();
           Criteria crit=session.createCriteria(ZiyaretPojo.class);
           crit.add(Restrictions.ilike(kolon, "%"+deger+"%"));
           List result=crit.list();
           return result;
    }
}
