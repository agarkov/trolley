package dao;

// Generated 11.06.2014 10:36:26 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.Bus;

/**
 * Home object for domain model class Bus.
 * @see dao.Bus
 * @author Hibernate Tools
 */
@Stateless
public class BusDAOImpl {

	private static final Log log = LogFactory.getLog(BusDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Bus transientInstance) {
		log.debug("persisting Bus instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Bus persistentInstance) {
		log.debug("removing Bus instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Bus merge(Bus detachedInstance) {
		log.debug("merging Bus instance");
		try {
			Bus result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Bus findById(Integer id) {
		log.debug("getting Bus instance with id: " + id);
		try {
			Bus instance = entityManager.find(Bus.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
