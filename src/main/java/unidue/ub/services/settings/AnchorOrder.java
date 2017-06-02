/**
 * 
 */
package unidue.ub.services.settings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * correlates the anchor of Journals to the order number
 * @author Eike Spielberg
 *
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnchorOrder {
	
	@Id
    @GeneratedValue
    private long id;
	
	private String anchor;
	
	private String orderNumber;
	
	private String name;
	
	private String runtime; 
	
	public AnchorOrder() {
		anchor = "";
		orderNumber="";
		name="";
		runtime= "";
	}

	/**
	 * returns the anchor of the collection
	 * @return the anchor
	 */
	public String getAnchor() {
		return anchor;
	}

	/**
	 * sets the anchor of the collection
	 * @param anchor the anchor to set
	 * @return the updated object
	 */
	public AnchorOrder setAnchor(String anchor) {
		this.anchor = anchor;
		return this;
	}

	/**
	 * returns the internal order number of the collection
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * sets the internal order number of the collection
	 * @param orderNumber the orderNumber to set
	 * @return the updated object
	 */
	public AnchorOrder setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
		return this;
	}

	/**
	 * returns the name of the collection
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets the name of the collection
	 * @param name the name to set
	 * @return the updated object
	 */
	public AnchorOrder setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * returns the time range covered by this collection
	 * @return the runtime
	 */
	public String getRuntime() {
		return runtime;
	}

	/**
	 * sets the time range covered by this collection
	 * @param runtime the runtime to set
	 * @return the updated object
	 */
	public AnchorOrder setRuntime(String runtime) {
		this.runtime = runtime;
		return this;
	}
}
