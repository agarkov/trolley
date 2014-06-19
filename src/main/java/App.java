
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.hibernate.Session;

import config.HibernateUtil;
import domain.*;
import dao.*;

public class App {
	private CatDepoDAO CD;
	List<CatDepo> CList = CD.findAll();
		
	public static void main(String[] args) 
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Date timestamp = Calendar.getInstance().getTime();
		String testString = "##### ТЕСТ " + timestamp;
		
/*		//##### Add record to "catmaker"
		CatMaker newCatMaker = new CatMaker();
		newCatMaker.setText(testString);
		newCatMaker.setTextAlt(testString);		
		session.save(newCatMaker);

		//##### Add record to "catmodel"		
		CatModel newCatModel = new CatModel();
		newCatModel.setText(testString);
		newCatModel.setTextAlt(testString);		
		newCatModel.setCatMaker(newCatMaker);
		session.save(newCatModel);

		//##### Add record to "catbort"
		CatBort newCatBort = new CatBort();
		newCatBort.setText(testString);
		session.save(newCatBort);
		
		//##### Add record to "catbustype"		
		CatBusType newCatBusType = new CatBusType();
		newCatBusType.setText(testString);
		session.save(newCatBusType);
		
		//##### Add record to "catdepo"		
		CatDepo newCatDepo = new CatDepo();
		newCatDepo.setText(testString);
		newCatDepo.setTextAlt(testString);		
		session.save(newCatDepo);
		
		//##### Add record to "catevent"		
		CatEvent newCatEvent = new CatEvent();
		newCatEvent.setText(testString);
		session.save(newCatEvent);

		//##### Add record to "catstatus"		
		CatStatus newCatStatus = new CatStatus();
		newCatStatus.setText(testString);
		session.save(newCatStatus);
		
		//###########################################
		//###########################################		

		//##### Add record to "bus"		
		Bus newBus = new Bus();
		newBus.setCatModel(newCatModel);
		newBus.setSerial(1234);		
		newBus.setSerialAlt(testString);
		session.save(newBus);

		//##### Add record to "event"		
		Event newEvent = new Event();
		newEvent.setCatEvent(newCatEvent);
		newEvent.setDay(1);
		newEvent.setMonth(1);
		//newEvent.setYear();
		newEvent.setText(testString);
		session.save(newEvent);

		//##### Add record to "buschange"
		BusChange newBusChange = new BusChange();
		newBusChange.setId(newBus.getId());
		newBusChange.setBus(newBus);		
		newBusChange.setEvent(newEvent);
		newBusChange.setCatBort(newCatBort);
		newBusChange.setCatDepo(newCatDepo);
		newBusChange.setCatDepoMain(newCatDepo);
		newBusChange.setCatBusType(newCatBusType);		
		newBusChange.setCatStatus(newCatStatus);		
		session.save(newBusChange);
*/
		//System.out.println(CatDepoDAOImpl.findAll(depos));

		//Collection<CatDepo> items = new HashSet<CatDepo>();

		
		//CatDepoDAOImpl.findById(1L);		
		session.getTransaction().commit();
	}


}