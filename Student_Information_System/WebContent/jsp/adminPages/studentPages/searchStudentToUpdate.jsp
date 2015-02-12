<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/jsp/adminPages/headPage.jsp" %>
</head>
<body>
	<%@include file="/jsp/adminPages/topNavBar.jsp" %>
	 <%@include file="/jsp/adminPages/sideNavBar.jsp" %>
	 
	<div class="col-lg-7">
		<form class="form-horizental" action="getStudentDetails" method="post">
			<div class="form-group">
			  <div class="col-lg-2"></div>
			  <div class="col-lg-6">
			  		<div class="form-group">
      					<label  class="col-lg-4 control-label">Roll Number</label>
     					 <div class="col-lg-8">
     					 		<sx:autocompleter list="listOfRollNumbers" name="searchKey" showDownArrow="false"></sx:autocompleter>
       						<!-- 	 <input type="text" class="form-control"  placeholder="Type Roll Number here" name="searchKey" required> -->
     					 </div>
     					<br><br> 
   					 </div>
			  </div>
			  <div class="col-lg-1">
			  	<div class="form-group">
      				<div class="col-lg-10 col-lg-offset-2"><input type="submit" value="Search"  class="btn btn-primary" />
      			</div>	
			  </div>
			</div>
		</div>
		</form>
	</div>
	<%@include file="/jsp/adminPages/newsAnnouncement.jsp" %>


</body>
</html>