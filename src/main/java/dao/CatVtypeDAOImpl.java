package dao;

// Generated 11.06.2014 10:36:26 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.CatVtype;

/**
 * Home object for domain model class CatVtype.
 * @see dao.CatVtype
 * @author Hibernate Tools
 */
@Stateless
public class CatVtypeDAOImpl {

	private static final Log log = LogFactory.getLog(CatVtypeDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CatVtype transientInstance) {
		log.debug("persisting CatVtype instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CatVtype persistentInstance) {
		log.debug("removing CatVtype instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CatVtype merge(CatVtype detachedInstance) {
		log.debug("merging CatVtype instance");
		try {
			CatVtype result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CatVtype findById(Integer id) {
		log.debug("getting CatVtype instance with id: " + id);
		try {
			CatVtype instance = entityManager.find(CatVtype.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
