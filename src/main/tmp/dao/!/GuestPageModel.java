package up.voteme.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import up.voteme.domain.Country;

public interface GuestPageModel {

	public abstract void reset();

	public abstract List<Country> getCountryList();
	public abstract void setCountryList(List<Country> countryList);

}