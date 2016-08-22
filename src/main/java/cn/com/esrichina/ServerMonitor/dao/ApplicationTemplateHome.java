package cn.com.esrichina.ServerMonitor.dao;

// Generated 2016-8-18 15:05:18 by Hibernate Tools 4.0.0

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import cn.com.esrichina.ServerMonitor.domain.ApplicationTemplate;

/**
 * Home object for domain model class ApplicationTemplate.
 * @see cn.com.esrichina.ServerMonitor.dao.ApplicationTemplate
 * @author Hibernate Tools
 */
public class ApplicationTemplateHome {

	private static final Log log = LogFactory
			.getLog(ApplicationTemplateHome.class);

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

	public void persist(ApplicationTemplate transientInstance) {
		log.debug("persisting ApplicationTemplate instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ApplicationTemplate instance) {
		log.debug("attaching dirty ApplicationTemplate instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ApplicationTemplate instance) {
		log.debug("attaching clean ApplicationTemplate instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ApplicationTemplate persistentInstance) {
		log.debug("deleting ApplicationTemplate instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ApplicationTemplate merge(ApplicationTemplate detachedInstance) {
		log.debug("merging ApplicationTemplate instance");
		try {
			ApplicationTemplate result = (ApplicationTemplate) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ApplicationTemplate findById(long id) {
		log.debug("getting ApplicationTemplate instance with id: " + id);
		try {
			ApplicationTemplate instance = (ApplicationTemplate) sessionFactory
					.getCurrentSession()
					.get("cn.com.esrichina.ServerMonitor.dao.ApplicationTemplate",
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

	public List findByExample(ApplicationTemplate instance) {
		log.debug("finding ApplicationTemplate instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria(
							"cn.com.esrichina.ServerMonitor.dao.ApplicationTemplate")
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
