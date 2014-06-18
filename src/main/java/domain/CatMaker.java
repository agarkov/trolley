/*
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

	private Collection<CatModel> catModel = new HashSet<CatModel>();

	//##### Constructors
	public CatMaker() {}
	public CatMaker(String text, String textAlt, Collection<CatModel> catModel) {
		this.text = text;
		this.textAlt = textAlt;
		this.catModel = catModel;
	}

	//##### Transmit records to "catmodel.makerId"
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catMaker")
	public Collection<CatModel> getCatModels() {
		return this.catModel;
	}

	public void setCatModels(Collection<CatModel> catModel) {
		this.catModel = catModel;
	}
}
