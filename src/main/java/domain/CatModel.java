/*
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

	private CatMaker catMaker;
	private Collection<Bus> Buses = new HashSet<Bus>();

	//##### Constructors
	public CatModel() {}
	public CatModel(CatMaker catMaker, String text, String textAlt, Collection<Bus> Buses) {
		this.catMaker = catMaker;
		this.text = text;
		this.textAlt = textAlt;
		this.Buses = Buses;
	}

	//##### Receive records from "catmaker" for ".makerId"
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "makerId", nullable = false)
	public CatMaker getCatMaker() {
		return this.catMaker;
	}

	public void setCatMaker(CatMaker catMaker) {
		this.catMaker = catMaker;
	}

	//##### Transmit records to "bus.modelId"
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catModel")
	public Collection<Bus> Buses() {
		return this.Buses;
	}

	public void setBuses(Collection<Bus> Buses) {
		this.Buses = Buses;
	}

}

