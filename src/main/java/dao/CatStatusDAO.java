package dao;

// Generated 09.06.2014 23:04:34 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.CatStatus;

/**
 * Home object for domain model class CatStatus.
 * @see dao.CatStatus
 * @author Hibernate Tools
 */
@Stateless
public class CatStatusDAO {

	private static final Log log = LogFactory.getLog(CatStatusDAO.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CatStatus transientInstance) {
		log.debug("persisting CatStatus instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CatStatus persistentInstance) {
		log.debug("removing CatStatus instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CatStatus merge(CatStatus detachedInstance) {
		log.debug("merging CatStatus instance");
		try {
			CatStatus result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CatStatus findById(Integer id) {
		log.debug("getting CatStatus instance with id: " + id);
		try {
			CatStatus instance = entityManager.find(CatStatus.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
