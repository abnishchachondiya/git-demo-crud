<%@ page ISELIgnored="false" %>
<%@taglib url="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>

	<c:when test="${!empty empsData}">
		
		<table border="1" bgcolor="red" align="center">
		
			<tr>
				<th>EmpNo</th>
				<th>EmpName</th>
				<th>Job</th>
				<th>Salary</th>
				<th>Operations</th>
			</tr>
		
	<c:forEach var="emp" items="${empsData}">
	
		<tr>
			<td>${emp.empno}</td>
			<td>${emp.ename}</td>
			<td>${emp.job}</td>
			<td>${emp.sal}</td>
			<td><a href="edit?no=${emp.empno}"><img src="images/edit1.png" width="50" height="50"/></a>&nbsp;&nbsp;&nbsp;<a href="delete?no=${emp.empno}"><img src="images/delete1.png" width="50" height="50"></a></td>
		</tr>
	
	</c:forEach>	
	</table>
	</c:when>
	<c:otherwise>
		<h1 style="color:cyan;text-align:center"> Record Not Found</h1>
	</c:otherwise>
	
</c:choose>

<c:if test="${!empty resultMsg }">
	<h3 style="color=green;text-align:center">${resultMsg}</h3> 
</c:if>
<br><br>

<hr>
<h1 style="text-align:center"><a href><img src="images/add.png" width="50" height="50"> Add Employee</a></h1>

