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
@Table(name = "facilities")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Facilities {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	@Column(name = "name")
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
