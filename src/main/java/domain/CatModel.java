package domain;

// Generated 09.06.2014 23:05:54 by Hibernate Tools 3.4.0.CR1

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

/**
 * CatModel generated by hbm2java
 */
@Entity
@Table(name = "cat-model", catalog = "trolley")
public class CatModel implements java.io.Serializable {

	private Integer id;
	private CatMaker catMaker;
	private String text;
	private String textAlt;
	private Set buses = new HashSet(0);

	public CatModel() {
	}

	public CatModel(CatMaker catMaker, String text) {
		this.catMaker = catMaker;
		this.text = text;
	}

	public CatModel(CatMaker catMaker, String text, String textAlt, Set buses) {
		this.catMaker = catMaker;
		this.text = text;
		this.textAlt = textAlt;
		this.buses = buses;
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
	@JoinColumn(name = "makerID", nullable = false)
	public CatMaker getCatMaker() {
		return this.catMaker;
	}

	public void setCatMaker(CatMaker catMaker) {
		this.catMaker = catMaker;
	}

	@Column(name = "text", nullable = false, length = 50)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Column(name = "textAlt", length = 50)
	public String getTextAlt() {
		return this.textAlt;
	}

	public void setTextAlt(String textAlt) {
		this.textAlt = textAlt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catModel")
	public Set getBuses() {
		return this.buses;
	}

	public void setBuses(Set buses) {
		this.buses = buses;
	}

}
