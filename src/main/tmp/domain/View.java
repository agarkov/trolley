package domain;

// Generated 17.06.2014 16:40:12 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
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

/**
 * View generated by hbm2java
 */
@Entity
@Table(name = "view", catalog = "trolley")
public class View implements java.io.Serializable {

	private Integer id;
	private Catvaccess catvaccess;
	private Catvowner catvowner;
	private Catvtype catvtype;
	private String path;
	private String color;
	private String text;
	private Integer day;
	private Integer month;
	private Date year;
	private Set viewobjects = new HashSet(0);

	public View() {
	}

	public View(Catvaccess catvaccess, Catvowner catvowner, Catvtype catvtype,
			String path, String color, String text) {
		this.catvaccess = catvaccess;
		this.catvowner = catvowner;
		this.catvtype = catvtype;
		this.path = path;
		this.color = color;
		this.text = text;
	}

	public View(Catvaccess catvaccess, Catvowner catvowner, Catvtype catvtype,
			String path, String color, String text, Integer day, Integer month,
			Date year, Set viewobjects) {
		this.catvaccess = catvaccess;
		this.catvowner = catvowner;
		this.catvtype = catvtype;
		this.path = path;
		this.color = color;
		this.text = text;
		this.day = day;
		this.month = month;
		this.year = year;
		this.viewobjects = viewobjects;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "access", nullable = false)
	public Catvaccess getCatvaccess() {
		return this.catvaccess;
	}

	public void setCatvaccess(Catvaccess catvaccess) {
		this.catvaccess = catvaccess;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner", nullable = false)
	public Catvowner getCatvowner() {
		return this.catvowner;
	}

	public void setCatvowner(Catvowner catvowner) {
		this.catvowner = catvowner;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "type", nullable = false)
	public Catvtype getCatvtype() {
		return this.catvtype;
	}

	public void setCatvtype(Catvtype catvtype) {
		this.catvtype = catvtype;
	}

	@Column(name = "path", nullable = false, length = 50)
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Column(name = "color", nullable = false, length = 50)
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Column(name = "text", nullable = false, length = 65535)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Column(name = "day")
	public Integer getDay() {
		return this.day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	@Column(name = "month")
	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "year", length = 0)
	public Date getYear() {
		return this.year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "view")
	public Set getViewobjects() {
		return this.viewobjects;
	}

	public void setViewobjects(Set viewobjects) {
		this.viewobjects = viewobjects;
	}

}