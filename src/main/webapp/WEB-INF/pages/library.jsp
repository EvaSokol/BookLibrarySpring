<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>${message}</h1>

    <form action="/spring3/" method="POST">
        <input type="text" name="bookName" placeholder="Book name"><br>
        <input type="text" name="authorName" placeholder="Author name"><br>
        <input type="number" name="productionYear" placeholder="Production Year"><br>
        <input type="submit" value="Submit">
    </form>


    <ul>
        <c:forEach var="book" items="${bookSet}">
            <li>${book.bookName} ${book.authorName} ${book.productionYear}
            <a href="<c:url value="/editBook.jsp?id=${book.bookName}"/>">Edit Book</a> </li>
        </c:forEach>
    </ul>

    </br>
    </br>
    <form action="/spring3/" method="POST">
            <input type="number" name="filterYear" placeholder="Filter only this year">
            <input type="submit" value="ThisYearBooks">
    </form>


    <ul>
        <c:forEach var="book" items="${bookThisYearSet}">
            <li>${book.bookName} ${book.authorName} ${book.productionYear}</li>
        </c:forEach>
    </ul>


</body>
</html>