<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Homepage</title>
<style type="text/css">

.main{
display:flex;
flex-direction: column;
align-items: center;
justify-content: center;
}


</style>
</head>
<body> 
<div class="container-fluid main">
<h1>Click Button To Redirect</h1>
<button onclick="handleclick()" class="btn btn-primary mt-5">Project 1</button>
<button class="btn btn-light mt-3">Project2</button>
<button class="btn btn-light mt-3">Project3</button>
Hello: ${myValue } <br/>
Hi : ${name}

<a href="home">Click to  goto next page</a>
<h1>Hi, select the link</h1>
<select>
<option>hi</option>
<option>hello</option>
<option>Hey</option>
</select>
<br/>
<!-- <form action=""> -->
<!-- 	<label for="un">Enter Username: </label> -->
<!-- 	<input type="text" name="un"></input><br> <br> -->

<!-- 	<label for="un">Enter Password: </label> -->
<!-- 	<input type="password"  name="pw"></input><br><br> -->
	
<!-- 	<input type="submit" value="submit"><br> -->



<!-- </form> -->

<h1>Value: <% out.print(2*5); %></h1>

<form action="home">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>

<jsp:forward page="home">hello</jsp:forward>


</div>


<script type="text/javascript">

function handleclick(){
	let n1=10;
	let n2=20;
	sum=n1+n2
	document.write(sum)
	
}


</script>
</body>
</html>