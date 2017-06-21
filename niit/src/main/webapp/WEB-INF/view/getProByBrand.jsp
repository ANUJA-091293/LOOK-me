<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
        <h1>ALL CATEGORY</h1>
        <h3>
            <a href="category list">New Employee</a>
        </h3>
        <table border="1">
 
            <th>product id</th>
            <th>product name</th>
            <th>product category</th>
            <th>product subcategory</th>
            <th>product brand</th>
            <th>product price</th>
 
            <c:forEach var="prodao" items="${p}">
                <tr>
               <td>${prodao.product_id}</td>
               <td>${prodao.product_name}</td>   
               <td>${prodao.product_catg}</td> 
               <td>${prodao.product_subcatg}</td>
               <td>${prodao.product_brand}</td>
               <td>${prodao.product_price }</td>
               
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>