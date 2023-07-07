<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<c:url value="/view/admin/static" var="url"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Product Management</title>
<link href="${url}/css/bootstrap.css" rel="stylesheet" />
<link href="${url}/css/font-awesome.css" rel="stylesheet" />
<link href="${url}/css/custom.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link href="${url}/js/dataTables/dataTables.bootstrap.css"
	rel="stylesheet" />
</head>
<body>
	<div id="wrapper">

		<jsp:include page="/view/admin/view/nav-bar.jsp"></jsp:include>
		<jsp:include page="/view/admin/view/slide-bar.jsp"></jsp:include>
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<h2>All Product</h2>
						<h5>You can management product in here</h5>

					</div>
				</div>
				<hr />

				<div class="row">
					<div class="col-md-12">
						<div class="panel panel-default">
							<div class="panel-heading">Advanced Tables</div>
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover"
										id="dataTables-example">
										<thead>
											<tr>
												<th>ID </th>
												<th>Image</th>
												<th>Name</th>
												<th>Price($)</th>
												<th>Category</th>
												<th>Description</th>
												<th>Action </th>
											</tr>
										</thead>
										<tbody>
										<c:forEach items="${proList }" var="pro" >
											<tr class="odd gradeX">
												<td>${pro.id }</td>
													<c:url value="/image?fname=${pro.image }" var="imgUrl"></c:url>
													<td><img height="150" width="200" src="${imgUrl}" /></td>

													<td>${pro.name }</td>
												<td>${pro.price }</td>
												<td>${pro.category.name }</td>
												<td>${pro.des } </td>
												<td><a
														href="<c:url value='/product/detail?id=${pro.id }'/>"
														class="center">Detail</a> | <a
														href="<c:url value='/admin/product/edit?id=${pro.id }'/>"
														class="center">Edit</a>
														| <a
														href="<c:url value='/admin/product/delete?id=${pro.id }'/>"
														class="center">Delete</a></td>
												
											</tr>
											</c:forEach>
											
											
										</tbody>
									</table>
								</div>

							</div>
						</div>
					</div>
				</div>

			</div>

		</div>
	</div>
	<script src="${url}/js/jquery-1.10.2.js"></script>
	<script src="${url}/js/bootstrap.min.js"></script>
	<script src="${url}/js/jquery.metisMenu.js"></script>
	<script src="${url}/js/dataTables/jquery.dataTables.js"></script>
	<script src="${url}/js/dataTables/dataTables.bootstrap.js"></script>
	<script>
		$(document).ready(function() {
			$('#dataTables-example').dataTable();
		});
	</script>
	<script src="${url}/js/custom.js"></script>

</body>
</html>