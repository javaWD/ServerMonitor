package cn.com.esrichina.ServerMonitor.dao;

// Generated 2016-8-18 15:05:18 by Hibernate Tools 4.0.0

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

import cn.com.esrichina.ServerMonitor.domain.History;
import cn.com.esrichina.ServerMonitor.domain.HistoryId;
import cn.com.esrichina.ServerMonitor.utils.QueryHistoryOption;

/**
 * Home object for domain model class History.
 * @see cn.com.esrichina.ServerMonitor.dao.History
 * @author Hibernate Tools
 */
public class HistoryHome {

	private static final Log log = LogFactory.getLog(HistoryHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();
	private Session session;
	//private static SessionFactory sessionFactory;
//	private static ServiceRegistry serviceRegistry ;
//	private static Configuration configuration;
	
	protected SessionFactory getSessionFactory() {
		try {
			return  new Configuration()
            .configure() // configures settings from hibernate.cfg.xml
            .buildSessionFactory();
			
//			configuration = new Configuration().configure("/hibernate.cfg.xml");
//			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
//			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//			return sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}
	


	public void persist(History transientInstance) {
		log.debug("persisting History instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(History instance) {
		log.debug("attaching dirty History instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(History instance) {
		log.debug("attaching clean History instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(History persistentInstance) {
		log.debug("deleting History instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public History merge(History detachedInstance) {
		log.debug("merging History instance");
		try {
			History result = (History) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public List<History> getTop5(){
		session=sessionFactory.openSession();
		String hql="from History";
		Query query=session.createQuery(hql).setFirstResult(0).setMaxResults(5);
		List<History> list=query.list();
	    session.close();
		return list;
	}
	
	public History findById(HistoryId id) {
		log.debug("getting History instance with id: " + id);
		try {
			History instance = (History) sessionFactory.getCurrentSession()
					.get("cn.com.esrichina.ServerMonitor.domain.History", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			} 
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(History instance) {
		log.debug("finding History instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"cn.com.esrichina.ServerMonitor.domain.History")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}


	/***
	 * 通过查询选项，查询历史监控信息
	 * @param queryHistoryOption
	 */
	public List<History> getHistoryByItemId(QueryHistoryOption queryHistoryOption) {
		// TODO Auto-generated method stub
		Long itemid=queryHistoryOption.getItemId();
		int start=queryHistoryOption.getQueryStart();
		int end=queryHistoryOption.getQueryEnd();
		session=sessionFactory.openSession();
		String hql="from History as history where history.id.itemid=:itemid and history.id.clock>=:start and history.id.clock<=:end order by clock desc";
		Query query=session.createQuery(hql).setParameter("itemid", itemid).setParameter("start", start).setParameter("end", end);
		List<History> list=query.list();
		
		
		session.close();
		return list;
	}
}
