package dao;

// Generated 11.06.2014 10:36:26 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.CatBustype;

/**
 * Home object for domain model class CatBustype.
 * @see dao.CatBustype
 * @author Hibernate Tools
 */
@Stateless
public class CatBustypeDAOImpl {

	private static final Log log = LogFactory.getLog(CatBustypeDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CatBustype transientInstance) {
		log.debug("persisting CatBustype instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CatBustype persistentInstance) {
		log.debug("removing CatBustype instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CatBustype merge(CatBustype detachedInstance) {
		log.debug("merging CatBustype instance");
		try {
			CatBustype result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CatBustype findById(Integer id) {
		log.debug("getting CatBustype instance with id: " + id);
		try {
			CatBustype instance = entityManager.find(CatBustype.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
