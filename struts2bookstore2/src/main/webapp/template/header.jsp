<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="header">
	<h2>
		<span style="margin-left: 15px; margin-top: 15px;" class="label">BOOK</span>
		<span style="color: white;">STORE</span>
	</h2>

	<span style="color: black; margin-left: 15px;">
	<s:property value="#session['username']"/><br>
	<s:if test="%{#session['username']!=null}">session.username!=null</s:if><s:else>sessions.username==null</s:else><br>
    <s:if test="%{!hasActionError()}">!hasActionError</s:if><s:else>hasActionError</s:else><br>
	
	 <s:if
			test="%{username!=null && !hasActionErrors() }">Welcome <s:property
				value="username" /> |
		<a href='<s:url action="logoutLink.action"/>'>Log out</a>
		</s:if> <s:else>
	    Login
	    </s:else>
	</span>
</div>