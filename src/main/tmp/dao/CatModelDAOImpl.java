package dao;

// Generated 17.06.2014 16:06:22 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.Catmodel;

/**
 * Home object for domain model class Catmodel.
 * @see dao.Catmodel
 * @author Hibernate Tools
 */
@Stateless
public class CatmodelDAOImpl {

	private static final Log log = LogFactory.getLog(CatmodelDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Catmodel transientInstance) {
		log.debug("persisting Catmodel instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Catmodel persistentInstance) {
		log.debug("removing Catmodel instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Catmodel merge(Catmodel detachedInstance) {
		log.debug("merging Catmodel instance");
		try {
			Catmodel result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Catmodel findById(Integer id) {
		log.debug("getting Catmodel instance with id: " + id);
		try {
			Catmodel instance = entityManager.find(Catmodel.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
