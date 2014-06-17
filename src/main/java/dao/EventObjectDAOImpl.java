package dao;

// Generated 11.06.2014 10:36:26 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.EventObject;

/**
 * Home object for domain model class EventObject.
 * @see dao.EventObject
 * @author Hibernate Tools
 */
@Stateless
public class EventObjectDAOImpl {

	private static final Log log = LogFactory.getLog(EventObjectDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(EventObject transientInstance) {
		log.debug("persisting EventObject instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(EventObject persistentInstance) {
		log.debug("removing EventObject instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public EventObject merge(EventObject detachedInstance) {
		log.debug("merging EventObject instance");
		try {
			EventObject result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EventObject findById(EventObject id) {
		log.debug("getting EventObject instance with id: " + id);
		try {
			EventObject instance = entityManager.find(EventObject.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
