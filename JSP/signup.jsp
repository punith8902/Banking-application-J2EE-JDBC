<%@page import="com.Bank.dto.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
<style>
    body {
        background-image:url('https://thumbs.dreamstime.com/b/business-finance-banking-stock-market-background-concept-58652365.jpg');
    background-repeat:no-repeat;
    background-size:cover;
        font-family: Arial, sans-serif;
        background-color: #87CEEB;
        color: #333;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    h1 {
        color: #00008B;
        margin-bottom: 20px;
        text-align: center;
    }

    h2 {
        color: #00008B;
        margin-bottom: 20px;
        text-align: center;
    }

    .container {
        max-width: 400px;
        padding: 40px;
        text-align:center;
        background-color: #fff;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    .form-group {
        margin-bottom: 15px;
    }

    .form-group label {
        display: block;
        margin-bottom: 5px;
    }

    .form-group input {
        width: 100%;
        padding: 10px;
        box-sizing: border-box;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    .form-group input[type="submit"], .form-group button {
        width: 100%;
        padding: 10px;
        border: none;
        border-radius: 5px;
        background-color: #00008B;
        color: #fff;
        cursor: pointer;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 16px;
    }

    .form-group input[type="submit"]:hover, .form-group button:hover {
        background-color: #333399;
    }

    .form-group button {
        background-color: #f44336;
    }

    .form-group button a {
        color: #fff;
        text-decoration: none;
    }

    .message {
        margin-bottom: 20px;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        background-color: #f9f9f9;
        text-align: center;
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
<% Customer c = (Customer) request.getAttribute("Customer"); %>
<% String success = (String) request.getAttribute("success"); %>
<% String failure = (String) request.getAttribute("failure"); %>
<div class="container">
    <h1>Welcome to Bank</h1>
    <h2>Application Form</h2>
    <form action="Signup" method="post">
        <% if (success != null && c != null) { %>
            <div class="message success"><%= success %></div>
        <% } %>
        <% if (failure != null) { %>
            <div class="message failure"><%= failure %></div>
        <% } %>
        <div class="form-group">
            <label for="name">Enter Your Name:</label>
            <input type="text" id="name" name="name" required>
        </div>
        <div class="form-group">
            <label for="phone">Enter Your Phone no:</label>
            <input type="tel" id="phone" name="phone" required>
        </div>
        <div class="form-group">
            <label for="mail">Enter Your Email:</label>
            <input type="email" id="mail" name="mail">
        </div>
        <div class="form-group">
            <label for="pin">Set the Pin:</label>
            <input type="password" id="pin" name="pin" maxlength="4" required>
        </div>
        <div class="form-group">
            <label for="confirm">Confirm the Pin:</label>
            <input type="password" id="confirm" name="confirm" maxlength="4" required>
        </div>
        <div class="form-group">
            <input type="submit" value="SignUp">
            <br>
            <br>
            <button type="button" onclick="window.location.href='login.jsp'">Login</button>
        </div>
    </form>
</div>
</body>
</html>
