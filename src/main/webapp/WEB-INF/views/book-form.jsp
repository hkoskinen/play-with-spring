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

        <p>Book type:</p>
        <label>Paperback <form:radiobutton path="bookType" value="paperback" /></label>
        <label>Hardcover <form:radiobutton path="bookType" value="hardcover" /></label>

        <p>Just select few of these checkboxes:</p>
        one <form:checkbox path="checkboxer" value="one" />
        two <form:checkbox path="checkboxer" value="two" />
        three <form:checkbox path="checkboxer" value="three" />


        <p><input type="submit" value="Add Book"></p>
    </form:form>

</body>
</html>
