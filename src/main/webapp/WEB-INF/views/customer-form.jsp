<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Customer form</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
    <h1>Customer form</h1>
    <form:form action="process-form" modelAttribute="customer">

        <label>Name (*): <form:input path="name" /></label>
        <form:errors path="name" cssClass="error" />

        <label>Email: <form:input path="email" /></label>

        <button type="submit">Submit</button>

    </form:form>
</body>
</html>
