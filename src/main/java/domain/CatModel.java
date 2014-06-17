/**
 * Mapping table "catmodel" to entity
 */

package domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.Collection;
import java.util.HashSet;

@Entity
@Table(name = "catmodel", catalog = "trolley")
public class CatModel extends BaseEntityTriple {

	private CatMaker catMakers;
	private Collection<Bus> listOfBuses = new HashSet<Bus>();

	//-----Constructors
	public CatModel() {
	}

	public CatModel(CatMaker catMakers, String text, String textAlt, Collection<Bus> listOfBuses) {
		this.catMakers = catMakers;
		this.text = text;
		this.textAlt = textAlt;
		//this.listOfBuses = listOfBuses;
	}

	//-----Receive "makerID" from "catmaker"
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "makerId", nullable = false)
	public CatMaker getCatMakers() {
		return this.catMakers;
	}

	public void setCatMakers(CatMaker catMakers) {
		this.catMakers = catMakers;
	}

	//-----Transmit itself to "bus"
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catModel")
	public Collection<Bus> getBuses() {
		return this.listOfBuses;
	}

	public void setBuses(Collection<Bus> listOfBuses) {
		this.listOfBuses = listOfBuses;
	}

}
