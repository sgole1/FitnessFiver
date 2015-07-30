/**
 * 
 */
package com.bodyrocks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author user
 *
 */
@Entity
@Table(name = "jim_and_facility")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class JimAndFacility {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	
	@Column(name="jim_id")
	private long jimId;
	
	@Column(name="facility_id")
	private long facilityId;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getJimId() {
		return jimId;
	}
	public void setJimId(long jimId) {
		this.jimId = jimId;
	}
	public long getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(long facilityId) {
		this.facilityId = facilityId;
	}
}
