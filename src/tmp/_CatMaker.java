/**
 * Mapping table "catmaker" to entity
 */

package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.Collection;
import java.util.HashSet;

@Entity
@Table(name = "catmaker", catalog = "trolley")
public class _CatMaker {

	private Integer id;
	private String text;
	private String textAlt;
	private Collection<CatModel> listOfCatModel = new HashSet<CatModel>();

	//-----Constructors
	public _CatMaker() {
	}

	public _CatMaker(String text, String textAlt, Collection<CatModel> listOfCatModel) {
		this.text = text;
		this.textAlt = textAlt;
		this.listOfCatModel = listOfCatModel;
	}

	//-----Field "ID"
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	//-----Field "Text"
	@Column(name = "text", nullable = false)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	//-----Field "TextAlt"	
	@Column(name = "textAlt")
	public String getTextAlt() {
		return this.textAlt;
	}

	public void setTextAlt(String textAlt) {
		this.textAlt = textAlt;
	}

	//-----Transmit itself to "catmodel"
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catMaker")
	public Collection<CatModel> getCatModel() {
		return listOfCatModel;
	}

	public void setCatModel(Collection<CatModel> listOfCatModel) {
		this.listOfCatModel = listOfCatModel;
	}

}
