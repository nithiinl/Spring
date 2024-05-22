<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>

<h2 class="bg-dark text-white text-center mt-3">Save Product Details</h2>

<form action="saveProduct" method="POST">

<table class="table table-bordered mt-4">
		<tr>
			<td>Product ID: </td>
			<td><input type="text" name="pid"/></td>
		</tr>
		
		<tr>
			<td>Product Name: </td>
			<td><input type="text" name="pname"/></td>
		</tr>
		
		<tr>
			<td>Product Price: </td>
			<td><input type="text" name="pprice"/></td>
		</tr>
		
		<tr>
			<td><input type="submit" class="btn btn-primary btn-lg ms-5 " value="submit"/></td>
			<td><input type="reset" class="btn btn-danger btn-lg" value="reset"/></td>
		</tr> 
</table>


</form>

</body>
</html>