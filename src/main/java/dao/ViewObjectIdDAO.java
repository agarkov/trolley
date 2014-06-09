package dao;

// Generated 09.06.2014 23:04:34 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.ViewObjectId;

/**
 * Home object for domain model class ViewObjectId.
 * @see dao.ViewObjectId
 * @author Hibernate Tools
 */
@Stateless
public class ViewObjectIdDAO {

	private static final Log log = LogFactory.getLog(ViewObjectIdDAO.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ViewObjectId transientInstance) {
		log.debug("persisting ViewObjectId instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ViewObjectId persistentInstance) {
		log.debug("removing ViewObjectId instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ViewObjectId merge(ViewObjectId detachedInstance) {
		log.debug("merging ViewObjectId instance");
		try {
			ViewObjectId result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

}
