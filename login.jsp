<%@ page import="com.Bank.dto.Customer" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
    body {
    background-image:url('https://e0.pxfuel.com/wallpapers/125/909/desktop-wallpaper-log-on-to-your-bank-account-on-a-laptop-logging-banking.jpg');
    background-repeat:no-repeat;
    background-size:cover;
        background-color: pink;
        font-family: Arial, sans-serif;
    }
    .container {
        max-width: 400px;
        margin: 0 auto;
        padding: 20px;
        background-color: white;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    h1 {
        text-align: center;
        color: #333;
    }
    table {
        width: 100%;
    }
    td {
        padding: 10px;
    }
    input[type="tel"], input[type="password"] {
        width: 100%;
        padding: 10px;
        margin: 5px 0;
        border: 1px solid #ccc;
        border-radius: 5px;
    }
    input[type="submit"], button {
        width: 48%;
        padding: 10px;
        margin: 10px 1%;
        border: none;
        border-radius: 5px;
        background-color: #4CAF50;
        color: white;
        cursor: pointer;
    }
    button {
        background-color: #f44336;
    }
    input[type="submit"]:hover, button:hover {
        opacity: 0.8;
    }
    .message {
        text-align: center;
        margin: 10px 0;
        padding: 10px;
        border-radius: 5px;
    }
    .message.success {
        background-color: #dff0d8;
        color: #3c763d;
    }
    .message.failure {
        background-color: #f2dede;
        color: #a94442;
    }
</style>
</head>
<body>
<div class="container">
    <h1>User Login</h1>
    <% Customer c = (Customer) request.getAttribute("Customer"); %>
    <% String success = (String) request.getAttribute("success"); %>
    <% String failure = (String) request.getAttribute("failure"); %>
    <form action="Login" method="post">
        <% if (success != null && c != null) { %>
            <div class="message success"><%= success %></div>
        <% } %>
        <% if (failure != null) { %>
            <div class="message failure"><%= failure %></div>
        <% } %>
        <table>
            <tr>
                <td>Enter Acc_no:</td>
                <td><input type="tel" name="acc_no"></td>
            </tr>
            <tr>
                <td>Enter the Pin:</td>
                <td><input type="password" name="pin" maxlength="4" required="required"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                 <button> <a href="App.jsp"> login </a></button>
                    <button type="button" onclick="window.location.href='forgotPassword.jsp'">Forgot Password</button>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
