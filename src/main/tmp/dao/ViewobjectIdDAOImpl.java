package dao;

// Generated 17.06.2014 16:06:22 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.ViewobjectId;

/**
 * Home object for domain model class ViewobjectId.
 * @see dao.ViewobjectId
 * @author Hibernate Tools
 */
@Stateless
public class ViewobjectIdDAOImpl {

	private static final Log log = LogFactory.getLog(ViewobjectIdDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ViewobjectId transientInstance) {
		log.debug("persisting ViewobjectId instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ViewobjectId persistentInstance) {
		log.debug("removing ViewobjectId instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ViewobjectId merge(ViewobjectId detachedInstance) {
		log.debug("merging ViewobjectId instance");
		try {
			ViewobjectId result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

}
