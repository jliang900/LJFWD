/**
 * 
 */
package com.apress.bookstore.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author jliang
 *
 */
public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5046134111682068871L;

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
		if (this.username.equals("vishal") && this.password.equals("password")) {
			return "success";
		} else {
			addActionError(getText("error.login"));
			return "error";
		}
	}
}
