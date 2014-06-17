/**
 * Base class for 2-fielded Entities
 * (fields 'id' & 'text')
 */

package domain;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntityDouble {

	public Integer id;
	public String text;
	
	//-----Constructors
	public BaseEntityDouble() {
	}

	public BaseEntityDouble(String text) {
		this.text = text;
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

}