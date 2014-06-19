/*
 * Mapping table "event" to entity
 */

package domain;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "event", catalog = "trolley")
public class Event {

	private Integer id;
	private CatEvent catEvent;
	private Integer day;
	private Integer month;
	private Date year;
	private String text;
	//private Collection<EventObject> eventObject = new HashSet<eventObject>();
	private Collection<BusChange> busChange = new HashSet<BusChange>();		

	//##### Constructors
	public Event() {}
	public Event(CatEvent catEvent, Integer day, Integer month, Date year,
			String text, Collection<BusChange> busChange
			//, Collection<EventObject> eventObject
			) {
		this.catEvent = catEvent;
		this.day = day;
		this.month = month;
		this.year = year;
		this.text = text;
		//this.eventObject = eventObject;
		this.busChange = busChange;
	}

	//##### Field "id"
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	//##### Receive records from "catevent" for ".typeId"	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "typeId", nullable = false)
	public CatEvent getCatEvent() {
		return this.catEvent;
	}

	public void setCatEvent(CatEvent catEvent) {
		this.catEvent = catEvent;
	}

	//##### Field "day"
	@Column(name = "day")
	public Integer getDay() {
		return this.day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	//##### Field "month"
	@Column(name = "month")
	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	//##### Field "year"
	@Temporal(TemporalType.DATE)
	@Column(name = "year")
	public Date getYear() {
		return this.year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	//##### Field "text"
	@Column(name = "text", nullable = false)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	//##### Transmit records to "busChange.eventId"
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	public Collection<BusChange> getBusChange() {
		return this.busChange;
	}

	public void setBusChange(Collection<BusChange> busChange) {
		this.busChange = busChange;
	}

	//##### Transmit records to "eventobject.eventId"
	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
	//public Collection<EventObject> getEventObject() {
	//	return this.eventObject;
	//}

	//public void setEventObject(Collection<EventObject> eventObject) {
	//	this.eventObject = eventObject;
	//}


}
