<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	 <%@include file="/jsp/adminPages/headPage.jsp" %>
</head>
<body style="background-color:#848484">
	 <%@include file="/jsp/adminPages/topNavBar.jsp" %>
	 <%@include file="/jsp/adminPages/sideNavBar.jsp" %>
	<div class="col-lg-7">
	<div class="mainframe">
	<br><br>
			<s:set name="msg" value="message"/>
  		<s:if test="%{#msg=='success'}">
  			<h2 align="center">Faculty Added Successfully</h2>
  		</s:if>
  		<s:else>
  			<h2 align="center"><label class="control-label"><s:property value="msg"/> </label></h2>			
  		</s:else>
	<form class="form-horizental" action="AddFaculty" method="post" enctype="multipart/form-data" >
  					<div class="form-group">
      					<label  class="col-lg-4 control-label">Student Name</label> 
     					 <div class="col-lg-4">
     					 		<div class="input-group">
     					 			<span class="input-group-addon" id="basic-addon1">
     					 				  <span class="glyphicon glyphicon-user" aria-hidden="true"></span> 
     					 			</span>
       							 <input type="text" class="form-control" placeholder="Type Student Name here" name="studentName" required>
       							 </div>       							
       							  
      					</div>
     					  <br><br>
   					 </div>
   					
  					<div class="form-group">
      					<label  class="col-lg-4 control-label">Roll Number</label>
     					 <div class="col-lg-4">
       							 <input type="text" class="form-control"  placeholder="Type Roll Number here" name="studentRollNo" required>
     					 </div>
     					<br><br> 
   					 </div>
   					 <div class="form-group">
      					<label  class="col-lg-4 control-label">Date Of Birth</label>
     					 <div class="col-lg-4">
       							<input type="date" class="form-control"  placeholder="dd/mm/yyyy" name="dateOfBirth" > 
       							 
     					 </div>
     					<br><br> 
   					 </div>
   					 <div class="form-group">
      					<label  class="col-lg-4 control-label">Email</label>
     					 <div class="col-lg-4">
       							 <input type="text" class="form-control"  placeholder="Type Email Id Here" name="email" required>
     					 </div>
     					<br><br> 
   					 </div>
   					 <div class="form-group">
      					<label  class="col-lg-4 control-label">Phone Number</label>
     					 <div class="col-lg-4">
       							 <input type="text" class="form-control"  placeholder="Type Phone Number here" name="phoneNumber" required>
     					 </div>
     					<br><br> 
   					 </div>
   					 <div class="form-group">
      					<label  class="col-lg-4 control-label">Address</label>
     					 <div class="col-lg-4">
       							 <textarea class="form-control"  placeholder="Type Address here" name="address" required></textarea>
     					 </div>
     					<br><br><br><br> 
   					 </div>
   					<div class="form-group">
   					
      					<label  class="col-lg-4 control-label">Picture</label>
     					 <div class="col-lg-4">
     					 	
       							 <s:file class="form-control"   name="image"></s:file>
     					 </div>
     					 <br><br> 
   					 </div>
   					 
   					 
   					 <div class="form-group">
      						<div class="col-lg-10 col-lg-offset-2"><input type="submit" value="Submit"  class="btn btn-primary" />
       						 <input type="reset" class="btn btn-default" name="Reset"/>
     						 </div>
    				</div>
   					 
  				</form>
  				
			<br><br><br><br>
			</div>
		
			</div>
			<%@include file="/jsp/adminPages/newsAnnouncement.jsp" %>
			
</body>
</html>