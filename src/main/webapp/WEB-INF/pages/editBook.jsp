<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>${message}</h1>

    <form action="/editBook/" method="POST">
        <input type="text" name="bookName" placeholder=${book.bookName}><br>
        <input type="text" name="authorName" placeholder=${book.authorName}><br>
        <input type="number" name="productionYear" placeholder=${book.productionYear}><br>
        <input type="submit" value="SaveBook">
    </form>

    <ul>
        <c:forEach var="book" items="${bookSet}">
            <li>${book.bookName} ${book.authorName} ${book.productionYear}
            <a href="<c:url value="/editBook.jsp?id=${book.bookName}"/>">Edit Book</a> </li>
        </c:forEach>
    </ul>

</body>
</html>