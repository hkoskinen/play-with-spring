<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Book confirmation</title>
</head>
<body>
    <h1>Book Confirmation</h1>
    <p>Book title: ${book.title}</p>
    <p>Book author: ${book.author}</p>
    <p>Book genre: ${book.genre}</p>
    <p>Book type: ${book.bookType}</p>

    <ul>
        <c:forEach var="checkboxerVal" items="${book.checkboxer}">
            <li>${checkboxerVal}</li>
        </c:forEach>
    </ul>


</body>
</html>
