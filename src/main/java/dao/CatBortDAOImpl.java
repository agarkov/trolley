package dao;

// Generated 11.06.2014 10:36:26 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.CatBort;

/**
 * Home object for domain model class CatBort.
 * @see dao.CatBort
 * @author Hibernate Tools
 */
@Stateless
public class CatBortDAOImpl {

	private static final Log log = LogFactory.getLog(CatBortDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CatBort transientInstance) {
		log.debug("persisting CatBort instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CatBort persistentInstance) {
		log.debug("removing CatBort instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CatBort merge(CatBort detachedInstance) {
		log.debug("merging CatBort instance");
		try {
			CatBort result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CatBort findById(Integer id) {
		log.debug("getting CatBort instance with id: " + id);
		try {
			CatBort instance = entityManager.find(CatBort.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
