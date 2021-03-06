<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    <title>Roster</title>
</head>
<body>
    <navigation>
        <p>Prototype Roster</p>
        <a href="teams">New Team</a>
    </navigation>
    <div id="wrapper">
        <table class="table table-striped">
            <thead>
                <th>Team</th>
                <th>Players</th>
                <th>Action</th>
            </thead>
            <tbody>
            	<c:if test = "${roster.getRosterSize() != 0}">
                    <c:forEach var = "i" begin = "0" end = "${roster.getRosterSize()-1}">
                        <tr>
                            <td><c:out value = "${roster.getTeam(i).getTeamName()}"/></td>
                            <td><c:out value = "${roster.getTeam(i).getTeamSize()}"/></td>
                            <td><a href='teams?id=<c:out value="${ i }"/>'>Details</a> <a href='delete_team?id=<c:out value="${ i }"/>'>Delete</a></td>
                        </tr>
                    </c:forEach>
                </c:if>
            </tbody>
        </table>
    </div>
</body>
</html>