package dao;

// Generated 17.06.2014 16:06:22 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.Viewobject;

/**
 * Home object for domain model class Viewobject.
 * @see dao.Viewobject
 * @author Hibernate Tools
 */
@Stateless
public class ViewobjectDAOImpl {

	private static final Log log = LogFactory.getLog(ViewobjectDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Viewobject transientInstance) {
		log.debug("persisting Viewobject instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Viewobject persistentInstance) {
		log.debug("removing Viewobject instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Viewobject merge(Viewobject detachedInstance) {
		log.debug("merging Viewobject instance");
		try {
			Viewobject result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Viewobject findById(ViewobjectId id) {
		log.debug("getting Viewobject instance with id: " + id);
		try {
			Viewobject instance = entityManager.find(Viewobject.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
