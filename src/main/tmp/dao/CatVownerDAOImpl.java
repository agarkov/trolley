package dao;

// Generated 17.06.2014 16:06:22 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.Catvowner;

/**
 * Home object for domain model class Catvowner.
 * @see dao.Catvowner
 * @author Hibernate Tools
 */
@Stateless
public class CatvownerDAOImpl {

	private static final Log log = LogFactory.getLog(CatvownerDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Catvowner transientInstance) {
		log.debug("persisting Catvowner instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Catvowner persistentInstance) {
		log.debug("removing Catvowner instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Catvowner merge(Catvowner detachedInstance) {
		log.debug("merging Catvowner instance");
		try {
			Catvowner result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Catvowner findById(Integer id) {
		log.debug("getting Catvowner instance with id: " + id);
		try {
			Catvowner instance = entityManager.find(Catvowner.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
