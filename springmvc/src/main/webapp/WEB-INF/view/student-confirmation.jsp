<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="col"%>

<!DOCTYPE html>

<html>

<head>
    <title>Student Confirmation</title>
</head>

<body>

The student is confirmed: <b>${student.firstName} ${student.lastName}</b>

<br><br>

Country: <b> ${student.country} </b>

<br><br>

Favorite Language: <b> ${student.favoriteLanguage} </b>

<br><br>

Operating Systems:
<ul>
    <col:forEach var="temp" items="${student.operatingSystems}">

        <li> ${temp} </li>

    </col:forEach>
</ul>

</body>

</html>