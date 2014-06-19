package dao;

// Generated 17.06.2014 16:06:22 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.Catvtype;

/**
 * Home object for domain model class Catvtype.
 * @see dao.Catvtype
 * @author Hibernate Tools
 */
@Stateless
public class CatvtypeDAOImpl {

	private static final Log log = LogFactory.getLog(CatvtypeDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Catvtype transientInstance) {
		log.debug("persisting Catvtype instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Catvtype persistentInstance) {
		log.debug("removing Catvtype instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Catvtype merge(Catvtype detachedInstance) {
		log.debug("merging Catvtype instance");
		try {
			Catvtype result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Catvtype findById(Integer id) {
		log.debug("getting Catvtype instance with id: " + id);
		try {
			Catvtype instance = entityManager.find(Catvtype.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
