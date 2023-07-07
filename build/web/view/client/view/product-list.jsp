<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<c:url value="/view/client/static" var="url"></c:url>
<meta charset="ISO-8859-1">
<title>Product List</title>
<link rel="shortcut icon" href="favicon.ico">
<link rel='stylesheet' type='text/css'
	href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600&amp;subset=cyrillic,latin'>
<link rel="stylesheet"
	href="${url}/plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="${url}/css/shop.style.css">
<link rel="stylesheet" href="${url}/css/headers/header-v5.css">
<link rel="stylesheet" href="${url}/css/footers/footer-v4.css">
<link rel="stylesheet" href="${url}/plugins/animate.css">
<link rel="stylesheet" href="${url}/plugins/line-icons/line-icons.css">
<link rel="stylesheet"
	href="${url}/plugins/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${url}/plugins/noUiSlider/jquery.nouislider.min.css">
<link rel="stylesheet"
	href="${url}/plugins/scrollbar/css/jquery.mCustomScrollbar.css">

<link rel="stylesheet" href="${url}/css/plugins/style-switcher.css">

<link rel="stylesheet" href="${url}/css/theme-colors/default.css"
	id="style_color">

<link rel="stylesheet" href="${url}/css/custom.css">
</head>
<body>
<body class="header-fixed">
	<div class="wrapper">
		<div class="header-v5 header-${url}">
			<jsp:include page="topbar.jsp"></jsp:include>
			<jsp:include page="navbar.jsp"></jsp:include>
		</div>
		<div class="breadcrumbs-v4">
			<div class="container">
				<span class="page-name">Product Page</span>
				<h1>
					<span class="shop-green">FPT</span> Shop
				</h1>
				<ul class="breadcrumb-v4-in">
					<li><a href="${pageContext.request.contextPath }">Home</a></li>
					<li class="active">Product Page</li>
				</ul>
			</div>
		</div>
		<div class="content container">
			<div class="row">
				<jsp:include page="/view/client/view/seach.jsp"></jsp:include>
				<div class="col-md-9">
					<c:forEach items="${productList }" var="p">
						<div class="filter-results">
							<div
								class="list-product-description product-description-brd margin-bottom-30">
								<div class="row">
									<div class="col-sm-4">
										<c:url value="/image?fname=${p.image }" var="imgUrl"></c:url>
										<a
											href="${pageContext.request.contextPath }/product/detail?id=${p.id}"><img
											class="img-responsive sm-margin-bottom-20" src="${imgUrl}"
											alt=""></a>
									</div>
									<div class="col-sm-8 product-description">
										<div class="overflow-h margin-bottom-5">
											<ul class="list-inline overflow-h">
												<li><h4 class="title-price">
														<a href="
															${pageContext.request.contextPath }/product/detail?id=${p.id}">${p.name }</a>
													</h4></li>
												<li><span class="gender text-uppercase">${p.category.name }</span></li>
											</ul>
											<div class="margin-bottom-10">
												<span class="title-price margin-right-10">$ ${p.price }.0</span>
											</div>
											<p class="margin-bottom-20">${p.des }</p>
											<a
												href="${pageContext.request.contextPath }/product/detail?id=${p.id}"><button
													type="button" class="btn-u btn-u-sea-shop">More detail</button></a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
	<script src="${url}/plugins/jquery/jquery.min.js"></script>
	<script src="${url}/plugins/jquery/jquery-migrate.min.js"></script>
	<script src="${url}/plugins/bootstrap/js/bootstrap.min.js"></script>
	<script src="${url}/plugins/back-to-top.js"></script>
	<script src="${url}/plugins/smoothScroll.js"></script>
	<script src="${url}/plugins/noUiSlider/jquery.nouislider.all.min.js"></script>
	<script
		src="${url}/plugins/scrollbar/js/jquery.mCustomScrollbar.concat.min.js"></script>
	<script src="${url}/js/custom.js"></script>
	<script src="${url}/js/shop.app.js"></script>
	<script src="${url}/js/plugins/mouse-wheel.js"></script>
	<script>
		jQuery(document).ready(function() {
			App.init();
			App.initScrollBar();
			MouseWheel.initMouseWheel();
		});
	</script>
</body>

</body>
</html>