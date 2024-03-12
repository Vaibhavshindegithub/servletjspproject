<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style >

body {
	font-family: Arial, sans-serif;
        background-color: pink;
        margin: 0;
        padding: 0;
}
.container1
{
  width: 40%;
  height: 160px;
   margin: 30px auto;
        background-color: red;
        color:black;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.1);
}
h1
{
    margin: 10px;
    padding-left: 190px;
    color: rgb(52, 210, 235);
    
}
button
{
  margin:30px auto;
  background-color: white;
}
.container2
{
  width: 40%;
  height: 260px;
   margin: 15px auto;
        background-color: gray;
        color:black;
        padding: 10px;
        border-radius: 5px;
        box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.1);
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

</style>
</head>
<body>
<div class="container1">
 <h1>Update Page</h1>
    <table border="2">
        <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Address</th>
                <th>Email</th>
              
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${Data}" var="student">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.fname}</td>
                    <td>${student.sname}</td>
                    <td>${student.address}</td>
                    <td>${student.email}</td>
             
               </tr>
            </c:forEach>
        </tbody>
    </table><button><a href="home.jsp">Home page</a></button>
   
    </div>
    
    <br></br><br>
 <div class="container2">
<form action="update2">
<h3>Id Is Fix <input type="text" name="id" value="${id}" readonly="readonly"></h3>
<h3>Enter Name :<input type="text" name="fname" value="${fname}" required="required"></h3>
<h3>Enter Last Name :<input type="text" name="lname" value="${sname}"  required="required"></h3>
<h3>Enter Address :<input type="text" name="address" value="${address}"  required="required"></h3>
<h3>Enter Email :<input type="text" name="email" value="${email}" required="required"></h3>
<input type="submit" value="Update">
</form>
</div>   
</body>
</html>