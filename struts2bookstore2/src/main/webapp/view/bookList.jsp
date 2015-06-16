<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@  taglib uri="/struts-tags" prefix="s"%>
<body>
	<div id="centered">
		<s:form action="selectedBooksLink" theme="simple">
			<center>
				<table id="grid">
					<thead>
						<tr>
							<th id="th-title">Title</th>
							<th id="th-author">Author</th>
							<th id="th-price">Price</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="bookList" id="book">
							<tr>
								<td><s:checkbox name="selectedBooks" fieldValue='%{#book.id}' id="chk_selectedBooks_%{#book.id}"/>
									<s:property value="#book.bookTitle" /></td>
								<td><s:iterator value="#book.authors" id="author">
										<s:if test="%{#book.id == #author.bookId}">
											<s:property value="#author.firstName" />
											<s:property value="#author.lastName" />
										</s:if>
									</s:iterator></td>
								<td><s:property value="price" /></td>
							</tr>
						</s:iterator>
					</tbody>
				</table>
				<br>
				<s:submit value="Add to Cart" />
			</center>
		</s:form>
	</div>
</body>