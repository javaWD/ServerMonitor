package cn.com.esrichina.ServerMonitor.dao;

// Generated 2016-8-18 15:05:18 by Hibernate Tools 4.0.0

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import cn.com.esrichina.ServerMonitor.domain.OpmessageUsr;

/**
 * Home object for domain model class OpmessageUsr.
 * @see cn.com.esrichina.ServerMonitor.dao.OpmessageUsr
 * @author Hibernate Tools
 */
public class OpmessageUsrHome {

	private static final Log log = LogFactory.getLog(OpmessageUsrHome.class);

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

	public void persist(OpmessageUsr transientInstance) {
		log.debug("persisting OpmessageUsr instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(OpmessageUsr instance) {
		log.debug("attaching dirty OpmessageUsr instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OpmessageUsr instance) {
		log.debug("attaching clean OpmessageUsr instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(OpmessageUsr persistentInstance) {
		log.debug("deleting OpmessageUsr instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OpmessageUsr merge(OpmessageUsr detachedInstance) {
		log.debug("merging OpmessageUsr instance");
		try {
			OpmessageUsr result = (OpmessageUsr) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OpmessageUsr findById(long id) {
		log.debug("getting OpmessageUsr instance with id: " + id);
		try {
			OpmessageUsr instance = (OpmessageUsr) sessionFactory
					.getCurrentSession().get(
							"cn.com.esrichina.ServerMonitor.dao.OpmessageUsr",
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

	public List findByExample(OpmessageUsr instance) {
		log.debug("finding OpmessageUsr instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"cn.com.esrichina.ServerMonitor.dao.OpmessageUsr")
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
