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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CatVtype generated by hbm2java
 */
@Entity
@Table(name = "cat-vtype", catalog = "trolley")
public class CatVtype implements java.io.Serializable {

	private Integer id;
	private String text;
	private Set views = new HashSet(0);

	public CatVtype() {
	}

	public CatVtype(String text) {
		this.text = text;
	}

	public CatVtype(String text, Set views) {
		this.text = text;
		this.views = views;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catVtype")
	public Set getViews() {
		return this.views;
	}

	public void setViews(Set views) {
		this.views = views;
	}

}
