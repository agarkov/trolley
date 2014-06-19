/*
 * Base DAO Implementation
 */

package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.BaseDAO;

@Stateless
public class BaseDAOImpl<T> implements BaseDAO<T> {

   @PersistenceContext
    EntityManager eMgr;
    Class<T> eClass;

    public T findById(long id) {
    	return eMgr.find(eClass, id);
		//return eMgr.find(City.class, id);    	
    }
}
