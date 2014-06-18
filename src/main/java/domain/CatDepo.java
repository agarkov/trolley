/*
 * Mapping table "catbort" to entity
 */

package domain;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "catdepo", catalog = "trolley")
public class CatDepo extends BaseEntityTriple {

	private Collection<BusChange> busChangeDepo = new HashSet<BusChange>();	
	private Collection<BusChange> busChangeDepoMain = new HashSet<BusChange>();	

	//##### Constructors
	public CatDepo() {	}
	public CatDepo(Collection<BusChange> busChangeDepo,Collection<BusChange> busChangeDepoMain, 
			String text, String textAlt) {
		this.text = text;
		this.textAlt = textAlt;
		this.busChangeDepo = busChangeDepo;
		this.busChangeDepoMain = busChangeDepoMain;
	}

	//##### Transmit records to "buschange.depoId"
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catDepo")
	public Collection<BusChange> getBusChangeDepo() {
		return this.busChangeDepo;
	}

	public void setBusChangeDepo(Collection<BusChange> busChangeDepo) {
		this.busChangeDepo = busChangeDepo;
	}

	//##### Transmit records to "buschange.depoMain"
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catDepoMain")
	public Collection<BusChange> getBusChangeDepoMain() {
		return this.busChangeDepoMain;
	}

	public void setBusChangeDepoMain(Collection<BusChange> busChangeDepoMain) {
		this.busChangeDepoMain = busChangeDepoMain;
	}

}
