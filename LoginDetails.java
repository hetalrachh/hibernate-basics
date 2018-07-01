package org.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LoginDetails implements Serializable{
	
	@Column(name="LOGIN_ID")
	private String loginId;
	
	@Column(name="LOGIN_NAME")
	private String loginName;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

}
