<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Your Book store</title>
</head>
<body>
    <h1>Books List</h1>
    <table border="1">
        <tr>
            <th align="left">Author</th>
            <th align="left">Book Title</th>
        </tr>
        <c:forEach items="${bookList}" var="book">
            <tr>
                <td>${book.author.authorName}</td>
                <td>${book.bookTitle}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>