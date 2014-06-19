package dao;

// Generated 17.06.2014 16:06:22 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.Catdepo;

/**
 * Home object for domain model class Catdepo.
 * @see dao.Catdepo
 * @author Hibernate Tools
 */
@Stateless
public class CatdepoDAOImpl {

	private static final Log log = LogFactory.getLog(CatdepoDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Catdepo transientInstance) {
		log.debug("persisting Catdepo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Catdepo persistentInstance) {
		log.debug("removing Catdepo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Catdepo merge(Catdepo detachedInstance) {
		log.debug("merging Catdepo instance");
		try {
			Catdepo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Catdepo findById(Integer id) {
		log.debug("getting Catdepo instance with id: " + id);
		try {
			Catdepo instance = entityManager.find(Catdepo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
