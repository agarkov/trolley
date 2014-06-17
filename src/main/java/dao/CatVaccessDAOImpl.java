package dao;

// Generated 11.06.2014 10:36:26 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.CatVaccess;

/**
 * Home object for domain model class CatVaccess.
 * @see dao.CatVaccess
 * @author Hibernate Tools
 */
@Stateless
public class CatVaccessDAOImpl {

	private static final Log log = LogFactory.getLog(CatVaccessDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CatVaccess transientInstance) {
		log.debug("persisting CatVaccess instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CatVaccess persistentInstance) {
		log.debug("removing CatVaccess instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CatVaccess merge(CatVaccess detachedInstance) {
		log.debug("merging CatVaccess instance");
		try {
			CatVaccess result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CatVaccess findById(Integer id) {
		log.debug("getting CatVaccess instance with id: " + id);
		try {
			CatVaccess instance = entityManager.find(CatVaccess.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
