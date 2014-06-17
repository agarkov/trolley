/**
 * Mapping table "catmaker" to entity
 */

package domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.Collection;
import java.util.HashSet;

@Entity
@Table(name = "catmaker", catalog = "trolley")
public class CatMaker extends BaseEntityTriple {

	private Collection<CatModel> listOfCatModels = new HashSet<CatModel>();

	//-----Constructors
	public CatMaker() {
	}

	public CatMaker(String text, String textAlt, Collection<CatModel> listOfCatModels) {
		this.text = text;
		this.textAlt = textAlt;
		this.listOfCatModels = listOfCatModels;
	}

	//-----Transmit itself to "catmodel"
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catMakers")
	public Collection<CatModel> getCatModels() {
		return this.listOfCatModels;
	}

	public void setCatModels(Collection<CatModel> listOfCatModels) {
		this.listOfCatModels = listOfCatModels;
	}

}
