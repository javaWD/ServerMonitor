package cn.com.esrichina.ServerMonitor.dao;

// Generated 2016-8-18 15:05:18 by Hibernate Tools 4.0.0

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import cn.com.esrichina.ServerMonitor.domain.SysmapElementUrl;

/**
 * Home object for domain model class SysmapElementUrl.
 * @see cn.com.esrichina.ServerMonitor.dao.SysmapElementUrl
 * @author Hibernate Tools
 */
public class SysmapElementUrlHome {

	private static final Log log = LogFactory
			.getLog(SysmapElementUrlHome.class);

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

	public void persist(SysmapElementUrl transientInstance) {
		log.debug("persisting SysmapElementUrl instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SysmapElementUrl instance) {
		log.debug("attaching dirty SysmapElementUrl instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SysmapElementUrl instance) {
		log.debug("attaching clean SysmapElementUrl instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SysmapElementUrl persistentInstance) {
		log.debug("deleting SysmapElementUrl instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SysmapElementUrl merge(SysmapElementUrl detachedInstance) {
		log.debug("merging SysmapElementUrl instance");
		try {
			SysmapElementUrl result = (SysmapElementUrl) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SysmapElementUrl findById(long id) {
		log.debug("getting SysmapElementUrl instance with id: " + id);
		try {
			SysmapElementUrl instance = (SysmapElementUrl) sessionFactory
					.getCurrentSession()
					.get("cn.com.esrichina.ServerMonitor.dao.SysmapElementUrl",
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

	public List findByExample(SysmapElementUrl instance) {
		log.debug("finding SysmapElementUrl instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"cn.com.esrichina.ServerMonitor.dao.SysmapElementUrl")
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
