import static org.junit.Assert.*;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;

import dao.*;
import domain.*;


@ContextConfiguration({ "classpath:test-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class) 

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //Sorts test methods in lexicographic order

public class DAOTest {
	@Autowired
	private	CatDepoDAO catDepo;

	@Test
	@Transactional
	public void Test_A_SelectAll() {

		System.out.println("Trying to select all records from table...");

		List<CatDepo> catDepoList = catDepo.findAll();	// Creating list from table CatDepo

		for (int i = 0; i < catDepoList.size(); i++) {
			System.out.println("Record " + i + ": " + catDepoList.get(i));
			}

		System.out.println("Selecting " + catDepoList.size() + " records.");
		assertFalse("No records found.", catDepoList.size() == 0);
	}

	

}