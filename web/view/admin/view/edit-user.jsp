<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<c:url value="/view/admin/static" var="url"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Edit User</title>
<link href="${url}/css/bootstrap.css" rel="stylesheet" />
<link href="${url}/css/font-awesome.css" rel="stylesheet" />
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
						<h2>Edit User</h2>
						<h5>You can edit info user in here</h5>
					</div>
				</div>
				<hr />
				<div class="row">
					<div class="col-md-12">
						<!-- Form Elements -->
						<div class="panel panel-default">
							<div class="panel-heading">Info you can change</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-md-6">
										<h3>User:</h3>
										<c:url value="/admin/user/edit" var="edit"></c:url>
										<form role="form" action="${edit }" method="post"
											enctype="multipart/form-data">
											<input name="id" value="${user.id }" type="text" hidden="">
											<div class="form-group">
												<label>User Name:</label> <input class="form-control"
													value="${user.username }" name="username" />
											</div>
											<div class="form-group">
												<label>Password</label> <input class="form-control"
													value="${user.password }" type="password" name="password" />
											</div>
											<div class="form-group">
												<label>Email:</label> <input class="form-control"
													value="${user.email }" name="email" />
											</div>
											<div class="form-group">
												<label>Role</label>
												<div class="checkbox">
													<label> <input type="radio" value="1" name="role" />Admin
													</label> <br> <label> <input type="radio" value="2"
														name="role" checked="checked"/>Client
													</label>
												</div>

											</div>

											<div class="form-group">
												<label>Choose Avatar</label> <input type="file"
													name="avatar" />
											</div>
											<button type="submit" class="btn btn-default">Edit</button>
											<button type="reset" class="btn btn-primary">Reset</button>
										</form>



									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12"></div>
				</div>
			</div>
		</div>
	</div>
	<script src="${url}/js/jquery-1.10.2.js"></script>
	<script src="${url}/js/bootstrap.min.js"></script>
	<script src="${url}/js/jquery.metisMenu.js"></script>
	<script src="${url}/js/custom.js"></script>

</body>
</html>