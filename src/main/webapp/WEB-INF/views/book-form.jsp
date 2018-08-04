<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Book form</title>
</head>
<body>
    <h1>Add new book</h1>

    <form:form action="process-form" modelAttribute="book">

        <p>Title: <form:input path="title" /></p>
        <p>Author: <form:input path="author" /></p>

        <p>Genre: <form:select path="genre">
            <form:options items="${book.genres}" />
        </form:select></p>

        <p><input type="submit" value="Add Book"></p>
    </form:form>

</body>
</html>
