/*
 * Base DAO Implementation
 */

package dao;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import domain.CatDepo;
import dao.CatDepoDAO;


@Stateless

public class CatDepoDAOImpl //extends BaseDAOImpl<CatDepo> 
implements CatDepoDAO {
	
    @PersistenceContext
    private EntityManager eMgr;
    
    //private Class<CatDepo> eClass;

    //@Override
	public List<CatDepo> findAll() {
		System.out.println("##### Start FindAll...");		
		TypedQuery<CatDepo> query = eMgr.createQuery("SELECT c FROM CatDepo c", CatDepo.class);
		System.out.println("##### Query " + query);

		List<CatDepo> items = query.getResultList();
		System.out.println("##### Items " + items);		
		return items;
	}

	String s = "##### Finish...";
	public void find2() {
		System.out.println("##### Start Find...");
		
		TypedQuery<CatDepo> query = eMgr.createQuery("SELECT c FROM CatDepo c", CatDepo.class);
		System.out.println("##### Query " + query);

		Collection<CatDepo> items = query.getResultList();
		System.out.println("##### Items " + items);

	}

}
