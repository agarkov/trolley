package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domain.Catmaker;

@Stateless
public class CatmakerDAOImpl {

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Catmaker transientInstance) {
		entityManager.persist(transientInstance);
	}

	public void remove(Catmaker persistentInstance) {
		entityManager.remove(persistentInstance);
	}

	public Catmaker merge(Catmaker detachedInstance) {
		Catmaker result = entityManager.merge(detachedInstance);
		return result;
	}

	public Catmaker findById(Integer id) {
		Catmaker instance = entityManager.find(Catmaker.class, id);
		return instance;
	}
}
