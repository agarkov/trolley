/*
 * Mapping table "buschange" to entity
 */

package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "buschange", catalog = "trolley")
public class BusChange {

	private Integer id;
	private Bus bus;
	private Event event;
	private CatDepo catDepo;
	private CatDepo catDepoMain;
	private CatBusType catBusType;
	private CatBort catBort;
	private CatStatus catStatus;

	//##### Constructors
	public BusChange() {}
	public BusChange(Bus bus, Event event, CatDepo catDepo,	CatDepo catDepoMain, 
					CatBusType catBusType, CatBort catBort,	CatStatus catStatus) {
		this.bus = bus;
		this.event = event;
		this.catDepo = catDepo;
		this.catDepoMain = catDepoMain;
		this.catBusType = catBusType;
		this.catBort = catBort;
		this.catStatus = catStatus;
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

	//##### Receive records from "bus" for ".busId"
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "busId", nullable = false)
	public Bus getBus() {
		return this.bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	//##### Receive records from "event" for ".eventId"
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eventId", nullable = false)
	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	//##### Receive records from "catbort" for ".bortId"
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bortId", nullable = false)
	public CatBort getCatBort() {
		return this.catBort;
	}

	public void setCatBort(CatBort catBort) {
		this.catBort = catBort;
	}

	//##### Receive records from "catdepo" for ".depoId"
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "depoId", nullable = false)
	public CatDepo getCatDepo() {
		return this.catDepo;
	}

	public void setCatDepo(CatDepo catDepo) {
		this.catDepo = catDepo;
	}

	//##### Receive records from "depo" for ".depoMain"
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "depoMain", nullable = false)
	public CatDepo getCatDepoMain() {
		return this.catDepoMain;
	}

	public void setCatDepoMain(CatDepo catDepoMain) {
		this.catDepoMain = catDepoMain;
	}

	//##### Receive records from "catbustype" for ".typeId"
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "typeId", nullable = false)
	public CatBusType getCatBusType() {
		return this.catBusType;
	}

	public void setCatBusType(CatBusType catBusType) {
		this.catBusType = catBusType;
	}

	//##### Receive records from "catstatus" for ".statusId"
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "statusId", nullable = false)
	public CatStatus getCatStatus() {
		return this.catStatus;
	}

	public void setCatStatus(CatStatus catStatus) {
		this.catStatus = catStatus;
	}

}
