<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<c:url value="/view/admin/static" var="url"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Dashboard</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link href="${url}/css/bootstrap.css" rel="stylesheet" />
<link href="${url}/css/font-awesome.css" rel="stylesheet" />
<link href="${url}/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
<link href="${url}/css/custom.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
</head>
<body>
	<div id="wrapper">

		<jsp:include page="/view/admin/view/nav-bar.jsp"></jsp:include>
		<jsp:include page="/view/admin/view/slide-bar.jsp"></jsp:include>
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<h2>Admin Dashboard</h2>
						<h5>Welcome : ${username }</h5>

					</div>
				</div>
				<hr />
				</div>
				<hr />
				<script type="text/javascript"
					src="http://giavangvn.org/GiavangFullScript/dat-gia-vang/Widgets">
					
				</script>
			</div>

		</div>
	</div>
	<script src="${url}/js/jquery-1.10.2.js"></script>
	
	<script src="${url}/js/bootstrap.min.js"></script>
	
	<script src="${url}/js/jquery.metisMenu.js"></script>
	
	<script src="${url}/js/morris/raphael-2.1.0.min.js"></script>
	<script src="${url}/js/morris/morris.js"></script>
	
	<script src="${url}/js/custom.js"></script>


</body>

</html>