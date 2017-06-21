<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h1>werty</h1>
<div class="container" style="margin-top:30px">
<div class="col-md-10 col-md-offset-1">
    <div class="panel panel-default">
 
  <div class="panel-body">
   <form:form action="insertproduct" role="form" modelAttribute="p" >
            <div class="row">
    			<div class="col-xs-12 col-sm-4 col-md-4">
					<div class="form-group">
                        <form:input type="text"   class="form-control" placeholder="plz enter id" path="product_id"  tabindex="1"/>
					</div>
				</div>
                
    			<div class="col-xs-12 col-sm-4 col-md-4">
					<div class="form-group">
                        <form:input type="text" class="form-control" placeholder="plz enter name" path="product_name" tabindex="1"/>
					</div>
				</div>
                <div class="col-xs-12 col-sm-4 col-md-4">
    				<div class="form-group">
                        <form:input type="text" class="form-control" placeholder="plz enter brand name" path="product_brand" tabindex="1"/>
					</div>
				</div>
				<div class="col-xs-12 col-sm-4 col-md-4">
					<div class="form-group">
						<form:input type="text" class="form-control " placeholder="plz enter catgory name" path="product_catg" tabindex="2"/>
					</div>
				</div>
			</div>
			<div class="form-group">
				<form:input type="text" class="form-control " placeholder="plz enter subcatgory" path="product_subcatg" tabindex="3"/>
			</div>
			<div class="form-group">
				<form:input type="text" class="form-control " placeholder="plz enter price" path="product_price" tabindex="4"/>
			</div>
			
                                                    
  <input type="submit" class="btn btn-success"/>
  
  <hr style="margin-top:10px;margin-bottom:10px;" >
  
  <div class="form-group">
                                    
                                         
</form:form>

  </div>
</div>
</div>
</div>
</body>
</html>