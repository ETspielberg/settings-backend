package unidue.ub.services.settings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Plain old java object holding a notation and the corresponding description.
 * 
 * @author Eike Spielberg
 * @version 1
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Notation {
	
	@Id
	@GeneratedValue
	private Long id;

	// char fields for description and notation
	@Column(columnDefinition = "TEXT")
	private String description;

	private String notation;
	
	/**
     * general constructor
     * 
     */
    public Notation() {
	}

	/**
	 * returns the description
	 * 
	 * @return description the description of the notation
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * sets the description
	 * 
	 * @param description the description of the notation
	 * @return Notation the updated <code>Notation</code>-object
	 */
	public Notation setDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * returns the notation
	 * 
	 * @return description the notation
	 */
	public String getNotation() {
		return notation;
	}

	/**
	 * sets the notation
	 * 
	 * @param notation the notation
	 * @return Notation the updated <code>Notation</code>-object
	 */
	public Notation setNotation(String notation) {
		this.notation = notation;
		return this;
	}
	

}
