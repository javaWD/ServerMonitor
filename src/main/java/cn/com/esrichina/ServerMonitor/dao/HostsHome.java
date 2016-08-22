package cn.com.esrichina.ServerMonitor.dao;

// Generated 2016-8-18 15:05:18 by Hibernate Tools 4.0.0

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

import cn.com.esrichina.ServerMonitor.domain.Hosts;

/**
 * Home object for domain model class Hosts.
 * @see cn.com.esrichina.ServerMonitor.dao.Hosts
 * @author Hibernate Tools
 */
public class HostsHome {

	private static final Log log = LogFactory.getLog(HostsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	private Session session;
	
	protected SessionFactory getSessionFactory() {
		try {
//			SessionFactory sf=new Configuration()
//          .configure() // configures settings from hibernate.cfg.xml
//          .buildSessionFactory();
//			sf.openSession();
//			return sf;
			return  new Configuration()
            .configure() // configures settings from hibernate.cfg.xml
            .buildSessionFactory();
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Hosts transientInstance) {
		log.debug("persisting Hosts instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Hosts instance) {
		log.debug("attaching dirty Hosts instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Hosts instance) {
		log.debug("attaching clean Hosts instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Hosts persistentInstance) {
		log.debug("deleting Hosts instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Hosts merge(Hosts detachedInstance) {
		log.debug("merging Hosts instance");
		try {
			Hosts result = (Hosts) sessionFactory.getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Hosts findById(long id) {
		log.debug("getting Hosts instance with id: " + id);
		try {
//			Hosts instance = (Hosts) sessionFactory.getCurrentSession().get(
//					"cn.com.esrichina.ServerMonitor.domain.Hosts", id);
//			sessionFactory.getCurrentSession().beginTransaction();
			session=sessionFactory.openSession();
			Hosts instance =(Hosts) session.get("cn.com.esrichina.ServerMonitor.domain.Hosts", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}finally{
			session.clear();
		}
	}

	public List findByExample(Hosts instance) {
		log.debug("finding Hosts instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("cn.com.esrichina.ServerMonitor.domain.Hosts")
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
	 * 获取当前系统所有可用host
	 * @return List<Hosts>
	 */
	public List<Hosts> getAvilableHosts() {
		log.debug("getting Hosts instance with hostsid: " + 1);
		try {
//			Hosts instance = (Hosts) sessionFactory.getCurrentSession().get(
//					"cn.com.esrichina.ServerMonitor.domain.Hosts", id);
//			sessionFactory.getCurrentSession().beginTransaction();
			session=sessionFactory.openSession();
//			List<Hosts> instance =(List<Hosts>) session.get("cn.com.esrichina.ServerMonitor.domain.Hosts", 1);
			String hql="from Hosts as hosts where hosts.available=:available";
			Query query=session.createQuery(hql).setParameter("available", 1);
			List<Hosts> instance=query.list();
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}finally{
			session.clear();
		}
		
	}
	/***
	 * 通过hostId
	 * 获取指定host信息
	 * @param hostId
	 * @return
	 */
	public Hosts getAvailableHostById(Long hostId) {
		// TODO Auto-generated method stub
		return null;
	}
}
