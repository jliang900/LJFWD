/**
 * 
 */
package com.apress.helloworld.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @author jliang
 *
 */
@Action(value = "/hello", results = { @Result(name = "success", location = "/hello.jsp") })
public class HelloWorldAction {
	private String name;

	public String execute() throws Exception {
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
