<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: gray;
    }

    .container {
        width: 50%;
        margin: 50px auto;
        padding: 20px;
        background-color: silver;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    h1, h2, h3 {
        text-align: center;
    }

    form {
        margin-top: 20px;
    }

    form h3 {
        margin: 10px 0;
    }

    input[type="text"] {
        width:200px;
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    input[type="submit"], button {
        background-color: #007bff;
        color: #fff;
        border: none;
        padding: 10px 20px;
        cursor: pointer;
        border-radius: 5px;
    }

    input[type="submit"]:hover, button:hover {
        background-color: black;
    }

    button {
        margin-top: 20px;
         background-color: black;
        color: black;
        border: none;
        padding: 10px 20px;
        cursor: pointer;
        border-radius: 5px;
       
        
    }

  

    
</style>
</head>
<body>
<div class="container">
    <h1>Success Page</h1>
    <h2>Welcome ${Name}</h2>

    <form action="set">
        <h3>Enter First Name: <input type="text" name="fname" required="required"></h3>
        <h3>Enter Last Name: <input type="text" name="lname" required="required"></h3>
        <h3>Enter Address: <input type="text" name="address" required="required"></h3>
        <h3>Enter Email: <input type="text" name="email" required="required"></h3>
        <input type="submit" value="Set Data">
    </form>

    <button><a href="home.jsp">Back</a></button>
</div>
</body>
</html>
