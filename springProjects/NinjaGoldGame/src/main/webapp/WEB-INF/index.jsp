<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Ninja Gold Game</title>
	<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>

    <div id="main">

        <div id="gold">
            <h3>Your Gold:
                <input value="<c:out value="${gold}"/>" disabled>
            </h3>
        </div>
        
        <div id="places">
        <!-- Have 4 separate forms making POST requests -->
            <div class="place">
                <h2>Farm</h2>
                <p>(earns 10-20 golds)</p>
                <form action="/process_money" method="POST">
                	<input type="hidden" name="building" value="farm" />
                    <input type="submit" value="Find Gold!" />
                </form>
            </div>
            <div class="place">
                <h2>Cave</h2>
                <p>(earns 5-10 golds)</p>
                <form action="/process_money" method="POST">
                	<input type="hidden" name="building" value="cave" />
                    <input type="submit" value="Find Gold!" />
                </form>
            </div>
            <div class="place">
                <h2>House</h2>
                <p>(earns 2-5 golds)</p>
                <form action="/process_money" method="POST">
                	<input type="hidden" name="building" value="house" />
                    <input type="submit" value="Find Gold!" />
                </form>
            </div>
            <div class="place">
                <h2>Casino</h2>
                <p>(earns 0-50 golds)</p>
                <form action="/process_money" method="POST">
                	<input type="hidden" name="building" value="casino" />
                    <input type="submit" value="Find Gold!" />
                </form>
            </div>
        </div>
        
		<h3>Activities:</h3>
        
        <div id="activities">
	        <c:forEach var ="activity" items="${activitieslog}">
			<div class="<c:out value = "${activity.color}"/>"><c:out value = "${activity.message}"/></div>	            
			</c:forEach>
        </div>

        <form action="/reset" method="post">
            <input type="submit" value="Restart Game" />
        </form>
    </div>
    
    <script>
        var div = document.getElementById('activities');
        div.scrollTop = div.scrollHeight;
    </script>
</body>
</html>