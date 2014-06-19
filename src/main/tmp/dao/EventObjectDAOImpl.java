package dao;

// Generated 17.06.2014 16:06:22 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.Eventobject;

/**
 * Home object for domain model class Eventobject.
 * @see dao.Eventobject
 * @author Hibernate Tools
 */
@Stateless
public class EventobjectDAOImpl {

	private static final Log log = LogFactory.getLog(EventobjectDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Eventobject transientInstance) {
		log.debug("persisting Eventobject instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Eventobject persistentInstance) {
		log.debug("removing Eventobject instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Eventobject merge(Eventobject detachedInstance) {
		log.debug("merging Eventobject instance");
		try {
			Eventobject result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Eventobject findById(EventobjectId id) {
		log.debug("getting Eventobject instance with id: " + id);
		try {
			Eventobject instance = entityManager.find(Eventobject.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
