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

    Department: <br>

    Surgery <form:radiobutton path="department" value="Surgery"/>
    Oncology <form:radiobutton path="department" value="Oncology"/>
    Traumatology <form:radiobutton path="department" value="Traumatology"/>

    <br><br>

    <input type="submit" value="Submit"/>

</form:form>

</body>

</html>