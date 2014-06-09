package dao;

// Generated 09.06.2014 23:04:34 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.CatEvent;

/**
 * Home object for domain model class CatEvent.
 * @see dao.CatEvent
 * @author Hibernate Tools
 */
@Stateless
public class CatEventDAO {

	private static final Log log = LogFactory.getLog(CatEventDAO.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CatEvent transientInstance) {
		log.debug("persisting CatEvent instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CatEvent persistentInstance) {
		log.debug("removing CatEvent instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CatEvent merge(CatEvent detachedInstance) {
		log.debug("merging CatEvent instance");
		try {
			CatEvent result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CatEvent findById(Integer id) {
		log.debug("getting CatEvent instance with id: " + id);
		try {
			CatEvent instance = entityManager.find(CatEvent.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
