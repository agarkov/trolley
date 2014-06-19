package dao;

// Generated 17.06.2014 16:06:22 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.Catevent;

/**
 * Home object for domain model class Catevent.
 * @see dao.Catevent
 * @author Hibernate Tools
 */
@Stateless
public class CateventDAOImpl {

	private static final Log log = LogFactory.getLog(CateventDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Catevent transientInstance) {
		log.debug("persisting Catevent instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Catevent persistentInstance) {
		log.debug("removing Catevent instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Catevent merge(Catevent detachedInstance) {
		log.debug("merging Catevent instance");
		try {
			Catevent result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Catevent findById(Integer id) {
		log.debug("getting Catevent instance with id: " + id);
		try {
			Catevent instance = entityManager.find(Catevent.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
