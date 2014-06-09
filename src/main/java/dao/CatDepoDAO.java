package dao;

// Generated 09.06.2014 23:04:34 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.CatDepo;

/**
 * Home object for domain model class CatDepo.
 * @see dao.CatDepo
 * @author Hibernate Tools
 */
@Stateless
public class CatDepoDAO {

	private static final Log log = LogFactory.getLog(CatDepoDAO.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CatDepo transientInstance) {
		log.debug("persisting CatDepo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CatDepo persistentInstance) {
		log.debug("removing CatDepo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CatDepo merge(CatDepo detachedInstance) {
		log.debug("merging CatDepo instance");
		try {
			CatDepo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CatDepo findById(Integer id) {
		log.debug("getting CatDepo instance with id: " + id);
		try {
			CatDepo instance = entityManager.find(CatDepo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
