package dao;

// Generated 11.06.2014 10:36:26 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.CatMaker;

/**
 * Home object for domain model class CatMaker.
 * @see dao.CatMaker
 * @author Hibernate Tools
 */
@Stateless
public class CatMakerDAOImpl {

	private static final Log log = LogFactory.getLog(CatMakerDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CatMaker transientInstance) {
		log.debug("persisting CatMaker instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CatMaker persistentInstance) {
		log.debug("removing CatMaker instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CatMaker merge(CatMaker detachedInstance) {
		log.debug("merging CatMaker instance");
		try {
			CatMaker result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CatMaker findById(Integer id) {
		log.debug("getting CatMaker instance with id: " + id);
		try {
			CatMaker instance = entityManager.find(CatMaker.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
