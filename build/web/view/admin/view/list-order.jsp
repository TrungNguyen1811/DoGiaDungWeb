<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<c:url value="/view/admin/static" var="url"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Order Management</title>
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
						<h2>Order Management</h2>
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
												<th>index</th>
												<th>ID</th>
												<th>Buyer</th>
												<th>Email</th>
												<th>Date</th>
												<th>Product</th>
												<th>Quantity</th>
												<th>Price</th>
												<th>Sum</th>
												<th>Action</th>


											</tr>
										</thead>
										<tbody>
											<c:set var="index" value="${0}" />
											<c:forEach items="${listCartItem }" var="list">
												<tr class="odd gradeX">
													<c:set var="index" value="${index + 1}" />
													<td>${index }</td>
													<td>${list.id }</td>
													<td>${list.cart.buyer.username }</td>
													<td>${list.cart.buyer.email }</td>
													<td>${list.cart.buyDate }</td>
													<td>${list.product.name }</td>
													<td>${list.quantity }</td>
													<td>${list.product.price }</td>
													<td>${ list.quantity * list.product.price }</td>


													<td><a
														href="<c:url value='/admin/order/delete?id=${list.id }'/>"
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