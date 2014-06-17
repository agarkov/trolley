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
 * Catdepo generated by hbm2java
 */
@Entity
@Table(name = "catdepo", catalog = "trolley")
public class Catdepo implements java.io.Serializable {

	private Integer id;
	private String text;
	private String textAlt;
	private Set buschangesForDepoId = new HashSet(0);
	private Set buschangesForDepoMain = new HashSet(0);

	public Catdepo() {
	}

	public Catdepo(String text, String textAlt) {
		this.text = text;
		this.textAlt = textAlt;
	}

	public Catdepo(String text, String textAlt, Set buschangesForDepoId,
			Set buschangesForDepoMain) {
		this.text = text;
		this.textAlt = textAlt;
		this.buschangesForDepoId = buschangesForDepoId;
		this.buschangesForDepoMain = buschangesForDepoMain;
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

	@Column(name = "textAlt", nullable = false, length = 50)
	public String getTextAlt() {
		return this.textAlt;
	}

	public void setTextAlt(String textAlt) {
		this.textAlt = textAlt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catdepoByDepoId")
	public Set getBuschangesForDepoId() {
		return this.buschangesForDepoId;
	}

	public void setBuschangesForDepoId(Set buschangesForDepoId) {
		this.buschangesForDepoId = buschangesForDepoId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catdepoByDepoMain")
	public Set getBuschangesForDepoMain() {
		return this.buschangesForDepoMain;
	}

	public void setBuschangesForDepoMain(Set buschangesForDepoMain) {
		this.buschangesForDepoMain = buschangesForDepoMain;
	}

}
