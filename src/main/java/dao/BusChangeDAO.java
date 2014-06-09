package dao;

// Generated 09.06.2014 23:04:34 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.BusChange;

/**
 * Home object for domain model class BusChange.
 * @see dao.BusChange
 * @author Hibernate Tools
 */
@Stateless
public class BusChangeDAO {

	private static final Log log = LogFactory.getLog(BusChangeDAO.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BusChange transientInstance) {
		log.debug("persisting BusChange instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BusChange persistentInstance) {
		log.debug("removing BusChange instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BusChange merge(BusChange detachedInstance) {
		log.debug("merging BusChange instance");
		try {
			BusChange result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BusChange findById(Integer id) {
		log.debug("getting BusChange instance with id: " + id);
		try {
			BusChange instance = entityManager.find(BusChange.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
