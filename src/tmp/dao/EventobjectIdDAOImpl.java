package dao;

// Generated 17.06.2014 16:06:22 by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import domain.EventobjectId;

/**
 * Home object for domain model class EventobjectId.
 * @see dao.EventobjectId
 * @author Hibernate Tools
 */
@Stateless
public class EventobjectIdDAOImpl {

	private static final Log log = LogFactory
			.getLog(EventobjectIdDAOImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(EventobjectId transientInstance) {
		log.debug("persisting EventobjectId instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(EventobjectId persistentInstance) {
		log.debug("removing EventobjectId instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public EventobjectId merge(EventobjectId detachedInstance) {
		log.debug("merging EventobjectId instance");
		try {
			EventobjectId result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

}
