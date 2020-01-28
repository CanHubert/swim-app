<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!Doctype html>

<html>
<head>
	<title>User Info</title>
</head>

<body>

	<div id="container">
	<div id="singleUser">
	
		</div>
			<p>UserName : ${temp.userName} </p>
			<p>Email : ${temp.email} </p>
			<p>${id}  ${temp.id}</p>
			
		</div>
	</div>
	
	
	<div id="usersList">
		<c:forEach items="${users}" var="user">
	
	<table>
		<tr>
			<th>Id</th>
			<th>User</th>
			<th>Email</th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<tr>
			<td>${user.id}</td>
			<td>${user.userName}</td>
			<td>${user.email}</td>
			<td>${user.firstName}</td>
			<td>${user.lastName}</td>
		</tr>
	
	</table>
	</c:forEach>
	Size =  ${size}
	</div>
	
	



</body>

</html>