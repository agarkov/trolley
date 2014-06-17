package domain;

// Generated 17.06.2014 13:52:54 by Hibernate Tools 4.0.0

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
 * Catmaker generated by hbm2java
 */
@Entity
@Table(name = "catmaker", catalog = "trolley")
public class Catmaker implements java.io.Serializable {

	private Integer id;
	private String text;
	private String textAlt;
	private Set catmodels = new HashSet(0);

	public Catmaker() {
	}

	public Catmaker(String text) {
		this.text = text;
	}

	public Catmaker(String text, String textAlt, Set catmodels) {
		this.text = text;
		this.textAlt = textAlt;
		this.catmodels = catmodels;
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

	@Column(name = "textAlt", length = 50)
	public String getTextAlt() {
		return this.textAlt;
	}

	public void setTextAlt(String textAlt) {
		this.textAlt = textAlt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catmaker")
	public Set getCatmodels() {
		return this.catmodels;
	}

	public void setCatmodels(Set catmodels) {
		this.catmodels = catmodels;
	}

}
