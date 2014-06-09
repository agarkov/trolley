package dao;

// Generated 09.06.2014 23:04:34 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.View;

/**
 * Home object for domain model class View.
 * @see dao.View
 * @author Hibernate Tools
 */
@Stateless
public class ViewDAO {

	private static final Log log = LogFactory.getLog(ViewDAO.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(View transientInstance) {
		log.debug("persisting View instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(View persistentInstance) {
		log.debug("removing View instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public View merge(View detachedInstance) {
		log.debug("merging View instance");
		try {
			View result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public View findById(Integer id) {
		log.debug("getting View instance with id: " + id);
		try {
			View instance = entityManager.find(View.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
