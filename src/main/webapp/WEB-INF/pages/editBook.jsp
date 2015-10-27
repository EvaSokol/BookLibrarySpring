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


</body>
</html>