/*
 * Mapping table "catevent" to entity
 */

package domain;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "catevent", catalog = "trolley")
public class CatEvent extends BaseEntityDouble {

	private Collection<Event> event = new HashSet<Event>();	

	//##### Constructors
	public CatEvent() {	}
	public CatEvent(String text, Collection<Event> event) {
		this.text = text;
		this.event = event;
	}

	//##### Transmit records to "event.typeId"	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catEvent")
	public Collection<Event> getEvent() {
		return this.event;
	}

	public void setEvent(Collection<Event> event) {
		this.event = event;
	}

}
