package dao;

// Generated 09.06.2014 23:04:34 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.CatModel;

/**
 * Home object for domain model class CatModel.
 * @see dao.CatModel
 * @author Hibernate Tools
 */
@Stateless
public class CatModelDAO {

	private static final Log log = LogFactory.getLog(CatModelDAO.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CatModel transientInstance) {
		log.debug("persisting CatModel instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CatModel persistentInstance) {
		log.debug("removing CatModel instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CatModel merge(CatModel detachedInstance) {
		log.debug("merging CatModel instance");
		try {
			CatModel result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CatModel findById(Integer id) {
		log.debug("getting CatModel instance with id: " + id);
		try {
			CatModel instance = entityManager.find(CatModel.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
