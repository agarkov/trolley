
import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;

import config.HibernateUtil;

import domain.Bus;
import domain.BusChange;
import domain.CatBort;
import domain.CatBusType;
import domain.CatDepo;
import domain.CatMaker; 
import domain.CatModel;
import domain.CatStatus;


public class App {
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Date timestamp = Calendar.getInstance().getTime();
		String testString = "Тест " + timestamp;

		//##### Add record to "catmaker"
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

		//##### Add record to "bus"		
		Bus newBus = new Bus();
		newBus.setCatModel(newCatModel);
		newBus.setSerial(1234);		
		newBus.setSerialAlt(testString);
		session.save(newBus);
		
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
		
		//##### Add record to "catstatus"		
		CatStatus newCatStatus = new CatStatus();
		newCatStatus.setText(testString);
		session.save(newCatStatus);
				
		//##### Add record to "buschange"
		BusChange newBusChange = new BusChange();
		newBusChange.setId(newBus.getId());
		newBusChange.setBus(newBus);		
		//newBusChange.setEvent(newEvent);
		newBusChange.setCatBort(newCatBort);
		newBusChange.setCatDepo(newCatDepo);
		newBusChange.setCatDepoMain(newCatDepo);
		newBusChange.setCatBusType(newCatBusType);		
		newBusChange.setCatStatus(newCatStatus);		
		session.save(newBusChange);
		
		session.getTransaction().commit();
	}
}