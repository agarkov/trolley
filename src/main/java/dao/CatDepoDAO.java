/*
 * Base DAO class 
 */

package dao;

import java.util.Collection;
import java.util.List;

import domain.CatDepo;

public interface CatDepoDAO //extends BaseDAO<CatDepo> 
{
    
	public abstract List<CatDepo> findAll();
	public abstract String find2(String s);	
}
