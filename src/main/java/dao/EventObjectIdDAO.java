package dao;

// Generated 09.06.2014 23:04:34 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.EventObjectId;

/**
 * Home object for domain model class EventObjectId.
 * @see dao.EventObjectId
 * @author Hibernate Tools
 */
@Stateless
public class EventObjectIdDAO {

	private static final Log log = LogFactory.getLog(EventObjectIdDAO.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(EventObjectId transientInstance) {
		log.debug("persisting EventObjectId instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(EventObjectId persistentInstance) {
		log.debug("removing EventObjectId instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public EventObjectId merge(EventObjectId detachedInstance) {
		log.debug("merging EventObjectId instance");
		try {
			EventObjectId result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

}
