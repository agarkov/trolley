package up.voteme.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import up.voteme.domain.Country;
import up.voteme.service.CountryService;


@Component
@Scope("session")
public class GuestPageModelImpl implements GuestPageModel  {
	
	@Autowired
	CountryService countryServ;

	private List<Country> countryList;

	@Override
	public  void reset(){ countryList = countryServ.findAll(); }
	
	@Override
	public List<Country> getCountryList() { return countryList; }
	@Override
	public void setCountryList(List<Country> countryList) { this.countryList = countryList; }

	public CountryService getCountryServ() { return countryServ; }
	public void setCountryServ(CountryService countryServ) { this.countryServ = countryServ; }

}