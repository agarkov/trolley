/*
 * Mapping table "bus" to entity
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
@Table(name = "bus", catalog = "trolley")
public class Bus {

	private Integer id;
	private CatModel catModel;
	private int serial;
	private String serialAlt;
	private Integer manM;
	private Date manY;
	private Integer overM;
	private Date overY;
	private Collection<BusChange> busChange = new HashSet<BusChange>();
	
	//##### Constructors
	public Bus() {}
	public Bus(Collection<BusChange> busChange,	CatModel catModel, int serial, 
			String serialAlt, Integer manM,	Date manY, Integer overM, Date overY) {
		this.busChange = busChange;
		this.catModel = catModel;
		this.serial = serial;
		this.serialAlt = serialAlt;
		this.manM = manM;
		this.manY = manY;
		this.overM = overM;
		this.overY = overY;
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

	//##### Receive records from "catmodel" for ".modelId"	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "modelId", nullable = false)
	public CatModel getCatModel() {
		return this.catModel;
	}

	public void setCatModel(CatModel catModel) {
		this.catModel = catModel;
	}

	//##### Field "serial"
	@Column(name = "serial", nullable = false)
	public int getSerial() {
		return this.serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	//##### Field "serialAlt"	
	@Column(name = "serialAlt")
	public String getSerialAlt() {
		return this.serialAlt;
	}

	public void setSerialAlt(String serialAlt) {
		this.serialAlt = serialAlt;
	}

	//##### Field "manM"
	@Column(name = "manM")
	public Integer getManM() {
		return this.manM;
	}

	public void setManM(Integer manM) {
		this.manM = manM;
	}

	//##### Field "manY"
	@Temporal(TemporalType.DATE)
	@Column(name = "manY", length = 0)
	public Date getManY() {
		return this.manY;
	}

	public void setManY(Date manY) {
		this.manY = manY;
	}

	//##### Field "overM"
	@Column(name = "overM")
	public Integer getOverM() {
		return this.overM;
	}

	public void setOverM(Integer overM) {
		this.overM = overM;
	}

	//##### Field "overY"
	@Temporal(TemporalType.DATE)
	@Column(name = "overY", length = 0)
	public Date getOverY() {
		return this.overY;
	}

	public void setOverY(Date overY) {
		this.overY = overY;
	}

	//##### Transmit records to "buschange.busId"
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bus")
	public Collection<BusChange> getBusChange() {
		return this.busChange;
	}

	public void setBusChange(Collection<BusChange> busChange) {
		this.busChange = busChange;
	}

}
