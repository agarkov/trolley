package dao;

// Generated 11.06.2014 10:36:26 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.BusChanges;

/**
 * Home object for domain model class BusChange.
 * @see dao.BusChange
 * @author Hibernate Tools
 */
@Stateless
public class BusChangesDAOImpl {

	private static final Log log = LogFactory.getLog(BusChangesDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BusChanges transientInstance) {
		log.debug("persisting BusChange instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BusChanges persistentInstance) {
		log.debug("removing BusChange instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BusChanges merge(BusChanges detachedInstance) {
		log.debug("merging BusChange instance");
		try {
			BusChanges result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BusChanges findById(Integer id) {
		log.debug("getting BusChange instance with id: " + id);
		try {
			BusChanges instance = entityManager.find(BusChanges.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
