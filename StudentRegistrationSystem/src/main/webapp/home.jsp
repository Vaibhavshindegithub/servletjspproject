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
	background-color: rgb(210,210,210);
}

h1 {
	text-align: center;
	margin-top: 50px;
}

h3 {
	text-align: center;
	margin-top: 20px;
}

.container {
	text-align: center;
	margin-top: 30px;
	width: 300px;
	margin: 50px auto; padding : 20px;
	border: dashed;
	padding: 20px;
	background-color: rgb(255, 165, 0);
}

form, .button-wrapper {
	display: inline-block;
	margin: 10px;
}

input[type="submit"], button {
	background-color: #007bff;
	color: #fff;
	border: none;
	padding: 10px 20px;
	cursor: pointer;
	border-radius: 5px;
}

a {
	text-decoration: none;
	color: #007bff;
	margin-top: 10px;
}


</style>
</head>
<body>
	<h1>Welcome ${Name}</h1>
	<h3>Choose Following Operations</h3>
	<div class="container">
		<form action="display">
			<input type="submit" value="Display">
		</form>
		<div class="button-wrapper">
			<a href="success.jsp"><button>Insert</button></a>
		</div>
		
		<div class="button-wrapper">
			<a href="index.html"><button>Login Page</button></a>
		</div>
	</div>
</body>
</html>
