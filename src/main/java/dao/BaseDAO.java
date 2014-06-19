/*
 * Base DAO class 
 */

package dao;

public interface BaseDAO<T> {
    
	public abstract T findById(long id);

	//public List<T> findByQuery(String jpqlQuery);
    //public List<T> findByParamsQuery(String jpqlQuery, Map<String, Object> params);

}
