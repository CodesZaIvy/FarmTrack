<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Farm Produce Tracking</title>
</head>
<body>
    <h2>Farm Produce Tracking</h2>
    
    <c:forEach var="farmProduce" items="${farmProduces}">
        <div>
            <h3>${farmProduce.name}</h3>
            <p>Type: ${farmProduce.type}</p>
            <p>Quantity: ${farmProduce.quantity} kg</p>
        </div>
    </c:forEach>
</body>
</html>
