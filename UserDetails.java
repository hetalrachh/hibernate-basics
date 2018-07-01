package org.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "USER_DETAILS")
public class UserDetails {

	/* Embedded primary key */
	@EmbeddedId
	private LoginDetails loginDetails;

	@Column(name = "USER_NAME")
	private String userName;

	public String getUserName() {
		return userName;
	}

	public LoginDetails getLoginDetails() {
		return loginDetails;
	}

	public void setLoginDetails(LoginDetails loginDetails) {
		this.loginDetails = loginDetails;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
