package dao;

// Generated 11.06.2014 10:36:26 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.ViewObject;

/**
 * Home object for domain model class ViewObject.
 * @see dao.ViewObject
 * @author Hibernate Tools
 */
@Stateless
public class ViewObjectDAOImpl {

	private static final Log log = LogFactory.getLog(ViewObjectDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ViewObject transientInstance) {
		log.debug("persisting ViewObject instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ViewObject persistentInstance) {
		log.debug("removing ViewObject instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ViewObject merge(ViewObject detachedInstance) {
		log.debug("merging ViewObject instance");
		try {
			ViewObject result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ViewObject findById(ViewObject id) {
		log.debug("getting ViewObject instance with id: " + id);
		try {
			ViewObject instance = entityManager.find(ViewObject.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
