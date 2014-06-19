package dao;

// Generated 17.06.2014 16:06:22 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.Catstatus;

/**
 * Home object for domain model class Catstatus.
 * @see dao.Catstatus
 * @author Hibernate Tools
 */
@Stateless
public class CatstatusDAOImpl {

	private static final Log log = LogFactory.getLog(CatstatusDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Catstatus transientInstance) {
		log.debug("persisting Catstatus instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Catstatus persistentInstance) {
		log.debug("removing Catstatus instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Catstatus merge(Catstatus detachedInstance) {
		log.debug("merging Catstatus instance");
		try {
			Catstatus result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Catstatus findById(Integer id) {
		log.debug("getting Catstatus instance with id: " + id);
		try {
			Catstatus instance = entityManager.find(Catstatus.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
