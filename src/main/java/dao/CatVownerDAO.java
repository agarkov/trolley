package dao;

// Generated 09.06.2014 23:04:34 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.CatVowner;

/**
 * Home object for domain model class CatVowner.
 * @see dao.CatVowner
 * @author Hibernate Tools
 */
@Stateless
public class CatVownerDAO {

	private static final Log log = LogFactory.getLog(CatVownerDAO.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CatVowner transientInstance) {
		log.debug("persisting CatVowner instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CatVowner persistentInstance) {
		log.debug("removing CatVowner instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CatVowner merge(CatVowner detachedInstance) {
		log.debug("merging CatVowner instance");
		try {
			CatVowner result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CatVowner findById(Integer id) {
		log.debug("getting CatVowner instance with id: " + id);
		try {
			CatVowner instance = entityManager.find(CatVowner.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
