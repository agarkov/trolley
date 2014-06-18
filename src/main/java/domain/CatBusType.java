/*
 * Mapping table "catbustype" to entity
 */

package domain;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "catbustype", catalog = "trolley")
public class CatBusType extends BaseEntityDouble {

	private Collection<BusChange> busChange = new HashSet<BusChange>();

	//##### Constructors
	public CatBusType() {}
	public CatBusType(Collection<BusChange> busChange, String text) {
		this.text = text;
		this.busChange = busChange;
	}

	//##### Transmit records to "buschange.typeId"
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catBusType")
	public Collection<BusChange> getBusChange() {
		return this.busChange;
	}

	public void setBusChange(Collection<BusChange> busChange) {
		this.busChange = busChange;
	}

}
