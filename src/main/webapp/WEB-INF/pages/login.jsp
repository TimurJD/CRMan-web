<%-- 
    Document   : login
    Author     : Timur Berezhnoi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Signin</title>

<spring:url value="/resources/css/bootstrap.min.css" var="coreCss" />
<spring:url value="/resources/css/login.css" var="loginCss" />

<!-- Bootstrap core CSS -->
<link href="${coreCss}" rel="stylesheet" />

<!-- Custom styles for this template -->
<link href="${loginCss}" rel="stylesheet" />
</head>
<body>
	<div class="container">
		<form class="form-signin">
			<h2 class="form-signin-heading">Please sign in</h2>
			<label for="inputEmail" class="sr-only">Email address</label> <input
				type="email" id="inputEmail" class="form-control"
				placeholder="Email address" required autofocus> <label
				for="inputPassword" class="sr-only">Password</label> <input
				type="password" id="inputPassword" class="form-control"
				placeholder="Password" required>
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">
					Remember me
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
				in</button>
		</form>
	</div>
	<!-- /container -->
</body>
</html>