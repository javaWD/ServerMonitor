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

import cn.com.esrichina.ServerMonitor.domain.Items;
import cn.com.esrichina.genericdao.search.Search;
import cn.com.esrichina.genericdao.search.SearchResult;

/**
 * Home object for domain model class Items.
 * @see cn.com.esrichina.ServerMonitor.dao.Items
 * @author Hibernate Tools
 */
public class ItemsHome {

	private static final Log log = LogFactory.getLog(ItemsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();
	
	private Session session;
	
	protected SessionFactory getSessionFactory() {
		try {
//			return (SessionFactory) new InitialContext()
//					.lookup("SessionFactory");
			return  new Configuration()
            .configure() // configures settings from hibernate.cfg.xml
            .buildSessionFactory();
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Items transientInstance) {
		log.debug("persisting Items instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Items instance) {
		log.debug("attaching dirty Items instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Items instance) {
		log.debug("attaching clean Items instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Items persistentInstance) {
		log.debug("deleting Items instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Items merge(Items detachedInstance) {
		log.debug("merging Items instance");
		try {
			Items result = (Items) sessionFactory.getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/***
	 * 通过itemsId查询该Items
	 * @param id
	 * @return Items
	 */
	public Items findById(long id) {
		log.debug("getting Items instance with id: " + id);
		try {
			session=sessionFactory.openSession();
			Items instance = (Items) session.get(
					"cn.com.esrichina.ServerMonitor.domain.Items", id);
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
			session.close();
		}
	}

	public List findByExample(Items instance) {
		log.debug("finding Items instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("cn.com.esrichina.ServerMonitor.dao.Items")
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
	 * 通过hostId 
	 * 获取该host都有哪些监控项
	 * @param hostId
	 */
	public List<Items> getItemsByHostId(Long hostId) {
		log.debug("getting Items instance with id: " + hostId);
		try {
			session=sessionFactory.openSession();
//			List<Items> instance = (List<Items>) session.get(
//					"cn.com.esrichina.ServerMonitor.domain.Items", hostId);
			String hql="from Items as items where items.hosts.hostid=:hostId";
			Query query=session.createQuery(hql).setParameter("hostId", hostId);
			List<Items> instance=query.list();
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
			session.close();
		}
		
	}
	/***
	 * 通过itemsId
	 * 获取该Item信息
	 * @param itemsId
	 * @return
	 */
	public Items getItemsByItemsId(Long itemsId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Items> searchAndCount(Search search) {
		
		return null;
	}
}
