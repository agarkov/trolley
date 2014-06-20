import java.util.List;

import org.hibernate.Session;

import config.HibernateUtil;
import domain.*;
import dao.*;

public class App1 {

	CatDepoDAO catDepoDAO;
	public List<CatDepo> catDepoList;

	public static void main(String[] args) 
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		System.out.println("123");
		session.getTransaction().commit();
	}

	public void createDepoList(){
		catDepoList = catDepoDAO.findAll(); 
	}
	
	public List<CatDepo> getCatDepoList() { 
		return catDepoList; 
	}
	
	public void setCatDepoList(List<CatDepo> catDepoList) { 
		this.catDepoList = catDepoList; 
	}

	public CatDepoDAO getCatDepoDAO() { 
		return catDepoDAO; 
	}
	
	public void setCatDepoDAO(CatDepoDAO catDepoDAO) { 
		this.catDepoDAO = catDepoDAO; 
	}
		
}