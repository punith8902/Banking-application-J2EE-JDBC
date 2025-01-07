<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Banking Application</title>
<style>
    body {
    background-image:url('https://thumbs.dreamstime.com/z/digital-banking-platform-services-fintech-concept-187599697.jpg');
    background-repeat:no-repeat;
    background-size:cover;
        font-family: Arial, sans-serif;
        background-color: #f0f8ff;
        color: #333;
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
    }

    h1 {
        color: #00008B;
        margin-bottom: 20px;
    }

    .container {
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        max-width: 600px;
        margin-top: 20px;
    }

    .button {
        display: block;
        padding: 15px 25px;
        margin: 10px;
        background-color: #00008B;
        color: #fff;
        text-align: center;
        text-decoration: none;
        border-radius: 5px;
        transition: background-color 0.3s;
    }

    .button:hover {
        background-color: #333399;
    }

    button {
        background-color: #00008B;
        color: #fff;
        border: none;
        padding: 15px 25px;
        margin: 10px;
        border-radius: 5px;
        cursor: pointer;
    }

    button a {
        color: #fff;
        text-decoration: none;
    }

    button:hover {
        background-color: #333399;
    }
</style>
</head>
<body>
<h1>Welcome to Banking Application</h1>
<div class="container">
    <a href="CheckBalance.jsp" class="button">Check Balance</a>
    <a href="#" class="button">Deposit</a>
    <a href="#" class="button">Transfer</a>
    <a href="#" class="button">Reset Pin</a>
    <a href="#" class="button">Password</a>
    <a href="#" class="button">Update Account</a>
   
</div>
</body>
</html>
