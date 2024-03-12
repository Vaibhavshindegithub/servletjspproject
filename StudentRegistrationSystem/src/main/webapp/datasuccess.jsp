<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Data Success Page</title>
<style >
 body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4;
    }
    .container
    {
       width: 60%;
        margin: 50px auto;
        padding: 20px;
        background-color: silver;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    button
    {
    background-color: blue;
    color: white;
    }
</style>
</head>
<body>
<%-- ${Data} --%>
<div class="container">
    <h1>Student Data</h1>
    <table border="2">
        <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Address</th>
                <th>Email</th>
               &nbsp; <th>Actions</th>
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
              <td>  <a href="deletestudent?id=<c:out value='${student.id}' />">Delete</a></td>
                <td>  <a href="updatestudent?id=<c:out value='${student.id}' />">Update</a></td>
<!--                     <td><a href="update.html"><button>Update</button></a> </td>-->  
               </tr>
            </c:forEach>
        </tbody>
    </table><br></br>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="home.jsp"><button>Home Page</button></a>
   </div>
</body>
</html>
