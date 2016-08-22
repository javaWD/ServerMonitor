package cn.com.esrichina.ServerMonitor.dao;

// Generated 2016-8-18 15:05:18 by Hibernate Tools 4.0.0

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import cn.com.esrichina.ServerMonitor.domain.MaintenancesHosts;

/**
 * Home object for domain model class MaintenancesHosts.
 * @see cn.com.esrichina.ServerMonitor.dao.MaintenancesHosts
 * @author Hibernate Tools
 */
public class MaintenancesHostsHome {

	private static final Log log = LogFactory
			.getLog(MaintenancesHostsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(MaintenancesHosts transientInstance) {
		log.debug("persisting MaintenancesHosts instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(MaintenancesHosts instance) {
		log.debug("attaching dirty MaintenancesHosts instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MaintenancesHosts instance) {
		log.debug("attaching clean MaintenancesHosts instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(MaintenancesHosts persistentInstance) {
		log.debug("deleting MaintenancesHosts instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MaintenancesHosts merge(MaintenancesHosts detachedInstance) {
		log.debug("merging MaintenancesHosts instance");
		try {
			MaintenancesHosts result = (MaintenancesHosts) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MaintenancesHosts findById(long id) {
		log.debug("getting MaintenancesHosts instance with id: " + id);
		try {
			MaintenancesHosts instance = (MaintenancesHosts) sessionFactory
					.getCurrentSession()
					.get("cn.com.esrichina.ServerMonitor.dao.MaintenancesHosts",
							id);
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

	public List findByExample(MaintenancesHosts instance) {
		log.debug("finding MaintenancesHosts instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"cn.com.esrichina.ServerMonitor.dao.MaintenancesHosts")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
