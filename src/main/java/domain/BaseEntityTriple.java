/**
 * Base class for 3-fielded Entities
 * (fields 'id' & 'text' & 'textAlt')
 */

package domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntityTriple extends BaseEntityDouble{

	public String textAlt;
	
	//-----Constructors
	public BaseEntityTriple() {
	}

	public BaseEntityTriple(String text, String textAlt) {
		this.text = text;
		this.textAlt = textAlt;
	}
	
	//-----Field "TextAlt"
	@Column(name = "textAlt")
	public String getTextAlt() {
		return this.textAlt;
	}

	public void setTextAlt(String textAlt) {
		this.textAlt = textAlt;
	}

}