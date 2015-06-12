<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>

<li>
	<div>
		<span class="label" style="margin-left: 15px;">
            <a href="<s:url action=""/>">Categories</a>
		</span>
	</div>
	<ul>
		<li>
            <s:form action="booksByCategoryLink">
				<s:select name="category" list="#session['categoryList']"
					listValue="categoryDescription" listKey="id" />
				<s:submit value="Select" />
			</s:form>
			<a class="label" href="">
                <span class="label" style="margin-left: 30px;"></span>
            </a>
		</li>
	</ul>
</li>