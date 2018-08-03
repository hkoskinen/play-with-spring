<%--
  Created by IntelliJ IDEA.
  User: losti
  Date: 3.8.2018
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>contact form</title>
</head>
<body>
    <h1>contact</h1>
    <form action="handle-form" method="get">
        <input type="text" name="name" placeholder="John Doe">
        <input type="email" name="email" placeholder="john.doe@example.com">
        <textarea name="message" id="" cols="30" rows="10" placeholder="Hi!"></textarea>
        <button type="submit">Send</button>
    </form>
</body>
</html>
