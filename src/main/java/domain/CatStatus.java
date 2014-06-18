/*
 * Mapping table "catstatus" to entity
 */

package domain;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "catstatus", catalog = "trolley")
public class CatStatus extends BaseEntityDouble {

	private Collection<BusChange> busChange = new HashSet<BusChange>();

	//##### Constructors	
	public CatStatus() {}
	public CatStatus(Collection<BusChange> busChange, String text) {
		this.text = text;
		this.busChange = busChange;
	}

	//##### Transmit records to "buschange.statusId"
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catStatus")
	public Collection<BusChange> getBusChange() {
		return this.busChange;
	}

	public void setBusChange(Collection<BusChange> busChange) {
		this.busChange = busChange;
	}
}
