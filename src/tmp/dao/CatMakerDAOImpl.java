package dao;

// Generated 17.06.2014 16:06:22 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.Catmaker;

/**
 * Home object for domain model class Catmaker.
 * @see dao.Catmaker
 * @author Hibernate Tools
 */
@Stateless
public class CatmakerDAOImpl {

	private static final Log log = LogFactory.getLog(CatmakerDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Catmaker transientInstance) {
		log.debug("persisting Catmaker instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Catmaker persistentInstance) {
		log.debug("removing Catmaker instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Catmaker merge(Catmaker detachedInstance) {
		log.debug("merging Catmaker instance");
		try {
			Catmaker result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Catmaker findById(Integer id) {
		log.debug("getting Catmaker instance with id: " + id);
		try {
			Catmaker instance = entityManager.find(Catmaker.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
