package dao;

// Generated 09.06.2014 23:04:34 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.CatObject;

/**
 * Home object for domain model class CatObject.
 * @see dao.CatObject
 * @author Hibernate Tools
 */
@Stateless
public class CatObjectDAO {

	private static final Log log = LogFactory.getLog(CatObjectDAO.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CatObject transientInstance) {
		log.debug("persisting CatObject instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CatObject persistentInstance) {
		log.debug("removing CatObject instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CatObject merge(CatObject detachedInstance) {
		log.debug("merging CatObject instance");
		try {
			CatObject result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CatObject findById(Integer id) {
		log.debug("getting CatObject instance with id: " + id);
		try {
			CatObject instance = entityManager.find(CatObject.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
