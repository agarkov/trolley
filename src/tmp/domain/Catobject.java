package domain;

// Generated 17.06.2014 16:40:12 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Catobject generated by hbm2java
 */
@Entity
@Table(name = "catobject", catalog = "trolley")
public class Catobject implements java.io.Serializable {

	private Integer id;
	private String text;
	private Set viewobjects = new HashSet(0);
	private Set eventobjects = new HashSet(0);

	public Catobject() {
	}

	public Catobject(String text) {
		this.text = text;
	}

	public Catobject(String text, Set viewobjects, Set eventobjects) {
		this.text = text;
		this.viewobjects = viewobjects;
		this.eventobjects = eventobjects;
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

	@Column(name = "text", nullable = false, length = 50)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catobject")
	public Set getViewobjects() {
		return this.viewobjects;
	}

	public void setViewobjects(Set viewobjects) {
		this.viewobjects = viewobjects;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catobject")
	public Set getEventobjects() {
		return this.eventobjects;
	}

	public void setEventobjects(Set eventobjects) {
		this.eventobjects = eventobjects;
	}

}