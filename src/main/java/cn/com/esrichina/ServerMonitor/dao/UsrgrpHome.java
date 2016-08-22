package cn.com.esrichina.ServerMonitor.dao;

// Generated 2016-8-18 15:05:18 by Hibernate Tools 4.0.0

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import cn.com.esrichina.ServerMonitor.domain.Usrgrp;

/**
 * Home object for domain model class Usrgrp.
 * @see cn.com.esrichina.ServerMonitor.dao.Usrgrp
 * @author Hibernate Tools
 */
public class UsrgrpHome {

	private static final Log log = LogFactory.getLog(UsrgrpHome.class);

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

	public void persist(Usrgrp transientInstance) {
		log.debug("persisting Usrgrp instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Usrgrp instance) {
		log.debug("attaching dirty Usrgrp instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Usrgrp instance) {
		log.debug("attaching clean Usrgrp instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Usrgrp persistentInstance) {
		log.debug("deleting Usrgrp instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Usrgrp merge(Usrgrp detachedInstance) {
		log.debug("merging Usrgrp instance");
		try {
			Usrgrp result = (Usrgrp) sessionFactory.getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Usrgrp findById(long id) {
		log.debug("getting Usrgrp instance with id: " + id);
		try {
			Usrgrp instance = (Usrgrp) sessionFactory.getCurrentSession().get(
					"cn.com.esrichina.ServerMonitor.dao.Usrgrp", id);
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

	public List findByExample(Usrgrp instance) {
		log.debug("finding Usrgrp instance by example");
		try {
			List results = sessionFactory
					.getCurrentSession()
					.createCriteria("cn.com.esrichina.ServerMonitor.dao.Usrgrp")
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
