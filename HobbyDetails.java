package org.hibernate.dto;

import javax.persistence.Embeddable;

/**
 * Class embedded in StudentDetails class
 */
@Embeddable
public class HobbyDetails {
	
	private String hobbyName;
	
	private String hobbyType;

	public String getHobbyName() {
		return hobbyName;
	}

	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}

	public String getHobbyType() {
		return hobbyType;
	}

	public void setHobbyType(String hobbyType) {
		this.hobbyType = hobbyType;
	}
	
	

}
