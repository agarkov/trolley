
import org.hibernate.Session;

import config.HibernateUtil;
import domain.CatMaker; 
import domain.CatModel;

public class App {
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		CatMaker newCatMaker = new CatMaker();
		CatModel newCatModel = new CatModel();
		
		newCatMaker.setText("Тест 1");
		newCatMaker.setTextAlt("Тест 1");				
		
		newCatModel.setText("Тест 1");
		newCatModel.setTextAlt("Тест 1");
		newCatModel.setCatMaker(newCatMaker);
		
		session.save(newCatMaker);
		session.save(newCatModel);
		session.getTransaction().commit();
	}
}