<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
    <title>Pacient KOTLIN Registration Form</title>
</head>

<body>

<form:form action="processForm" modelAttribute="pacient">

    First name: <form:input path="firstName"/>

    <br><br>

    Last name: <form:input path="lastName"/>

    <br><br>

    <form:select path="country">
        <form:options items="${countryOptions}"/>
    </form:select>

    <br><br>

    <input type="submit" value="Submit"/>

</form:form>

</body>

</html>