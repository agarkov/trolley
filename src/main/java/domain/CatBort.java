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
@Table(name = "catbort", catalog = "trolley")
public class CatBort extends BaseEntityDouble {

	private Collection<BusChange> busChange = new HashSet<BusChange>();	

	//##### Constructors
	public CatBort() {}
	public CatBort(String text, Collection<BusChange> busChange	) {
		this.text = text;
		this.busChange = busChange;
	}

	//##### Transmit records to "busсhange.bortId"
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catBort")
	public Collection<BusChange> getBusChange() {
		return this.busChange;
	}

	public void setBusChange(Collection<BusChange> busChange) {
		this.busChange = busChange;
	}

}
