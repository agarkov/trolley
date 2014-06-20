package up.voteme.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import up.voteme.domain.Country;
import up.voteme.service.CountryService;

public class CountryController {
	
	@Autowired
	CountryService countryService;
	
	public List<Country> getCountriesInJSON() {   
	        List<Country> countries = countryService.findAll();
	return countries; 
	}
}
