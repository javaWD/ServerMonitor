package cn.com.esrichina.ServerMonitor;

import java.util.List;

import junit.framework.TestCase;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cn.com.esrichina.ServerMonitor.domain.History;
import cn.com.esrichina.ServerMonitor.domain.Items;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

	private SessionFactory sessionFactory;

	@Override
	protected void setUp() throws Exception {
		// A SessionFactory is set up once for an application
        sessionFactory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();
	}
    
    @Test
	public void testItems(){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String hql="from Items";
		Query query=session.createQuery(hql).setFirstResult(0).setMaxResults(5);
		//query.setString("aid","1");
		List<Items> list=query.list();
		for(Items ea:list){
			System.out.println(ea.getItemid()+"---"+ea.getName()+"---"+ea.getDescription());
		}
		 session.getTransaction().commit();
        session.close();
	}
    
    @Test
	public void testHistory(){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String hql="from History";
		Query query=session.createQuery(hql).setFirstResult(0).setMaxResults(5);
		//query.setString("aid","1");
		List<History> list=query.list();
		for(History ea:list){
			System.out.println(ea.getId().getClock());
		}
		 session.getTransaction().commit();
        session.close();
	}
}
