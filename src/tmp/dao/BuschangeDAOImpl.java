package dao;

// Generated 17.06.2014 16:06:22 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.Buschange;

/**
 * Home object for domain model class Buschange.
 * @see dao.Buschange
 * @author Hibernate Tools
 */
@Stateless
public class BuschangeDAOImpl {

	private static final Log log = LogFactory.getLog(BuschangeDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Buschange transientInstance) {
		log.debug("persisting Buschange instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Buschange persistentInstance) {
		log.debug("removing Buschange instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Buschange merge(Buschange detachedInstance) {
		log.debug("merging Buschange instance");
		try {
			Buschange result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Buschange findById(Integer id) {
		log.debug("getting Buschange instance with id: " + id);
		try {
			Buschange instance = entityManager.find(Buschange.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
