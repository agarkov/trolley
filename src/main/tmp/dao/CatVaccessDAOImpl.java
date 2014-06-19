package dao;

// Generated 17.06.2014 16:06:22 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.Catvaccess;

/**
 * Home object for domain model class Catvaccess.
 * @see dao.Catvaccess
 * @author Hibernate Tools
 */
@Stateless
public class CatvaccessDAOImpl {

	private static final Log log = LogFactory.getLog(CatvaccessDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Catvaccess transientInstance) {
		log.debug("persisting Catvaccess instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Catvaccess persistentInstance) {
		log.debug("removing Catvaccess instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Catvaccess merge(Catvaccess detachedInstance) {
		log.debug("merging Catvaccess instance");
		try {
			Catvaccess result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Catvaccess findById(Integer id) {
		log.debug("getting Catvaccess instance with id: " + id);
		try {
			Catvaccess instance = entityManager.find(Catvaccess.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
