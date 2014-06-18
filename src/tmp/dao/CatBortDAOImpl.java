package dao;

// Generated 17.06.2014 16:06:22 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.Catbort;

/**
 * Home object for domain model class Catbort.
 * @see dao.Catbort
 * @author Hibernate Tools
 */
@Stateless
public class CatbortDAOImpl {

	private static final Log log = LogFactory.getLog(CatbortDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Catbort transientInstance) {
		log.debug("persisting Catbort instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Catbort persistentInstance) {
		log.debug("removing Catbort instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Catbort merge(Catbort detachedInstance) {
		log.debug("merging Catbort instance");
		try {
			Catbort result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Catbort findById(Integer id) {
		log.debug("getting Catbort instance with id: " + id);
		try {
			Catbort instance = entityManager.find(Catbort.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
