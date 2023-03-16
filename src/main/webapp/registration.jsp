<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Account</title>
<link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei"
	rel="stylesheet">
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="error"></div>
	<div class="container">
		<div class="regbox box">
			<img class="avatar" src="img/collaboration.jpg">
			<h1>Register Account</h1>
			<form id="form" action="Register" method="post">
				<div><p><label for="name">Name</label></p>
		
				<input id="name" type="text" name="uname" required>
				</div>
				<div>
				<p>Email</p>
				<input type="text" name="email" required>
				</div>
				<div>
				<p> <label for="password">Password</label></p>
			
				<input id="password" type="password" name="password"
					required>
				</div>	 
					<button type="submit">Register</button>
				
			</form>
		</div>
	</div>
</body>
</html>