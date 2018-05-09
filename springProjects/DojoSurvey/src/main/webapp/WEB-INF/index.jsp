<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dojo Survey Index</title>
</head>
<body>
    <div id="main">
        <form id="survey" action="/survey" method="POST">
            <p>Your Name:
                <input type="text" name="name" required>
            </p>

            <p>Dojo Location:
                <select name="location" form="survey" required>
                    <option value="San Jose (SJO)">San Jose (SJO)</option>
                    <option value="Arizona (AZA)">Arizona (AZA)</option>
                </select>
            </p>

            <p>Favorite Language:
                <select name="fav_language" form="survey" required>
                    <option value="Python">Python</option>
                    <option value="PHP">PHP</option>
                    <option value="JAVA">JAVA</option>
                </select>
            </p>

            <p>Commnet (optional):
                <textarea rows="3" name="comment"></textarea>
            </p>
            <input type="submit" value="Send">

        </form>

    </div>

</body>
</html>