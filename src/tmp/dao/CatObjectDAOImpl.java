package dao;

// Generated 17.06.2014 16:06:22 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.Catobject;

/**
 * Home object for domain model class Catobject.
 * @see dao.Catobject
 * @author Hibernate Tools
 */
@Stateless
public class CatobjectDAOImpl {

	private static final Log log = LogFactory.getLog(CatobjectDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Catobject transientInstance) {
		log.debug("persisting Catobject instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Catobject persistentInstance) {
		log.debug("removing Catobject instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Catobject merge(Catobject detachedInstance) {
		log.debug("merging Catobject instance");
		try {
			Catobject result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Catobject findById(Integer id) {
		log.debug("getting Catobject instance with id: " + id);
		try {
			Catobject instance = entityManager.find(Catobject.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
