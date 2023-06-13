<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registration page</title>
</head>
<body>

 	<form action="controller" method="post">
 	 <input type="hidden" name="command" value="do_registration">
 	
 	<div class="list-menu-wrapper" style="float: centre;">
 	
 	<p> Name <input type="text" name="name" value=""> </p>
 	<p> Surname <input type="text" name="surname" value=""> </p>
 	<p> Login: <input type="text" name="login" value=""> </p>
 	<p> Password: <input type="text" name="surname" value="" placeholder="min 8 marks"> </p>
 	<p> E-mail: <input type="text" name="email" value="" placeholder="mail@dot.com "> </p>
 	<p> Secret word: <input type="text" name="secret_word" value="" placeholder="mother surname"> </p>		
 		
 	<input type="submit" value="send for registration">
 	
 	</div>
 	
 	</form>


</body>
</html>