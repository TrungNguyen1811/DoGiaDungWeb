<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<c:url value="/view/client/static" var="url"></c:url>
<meta charset="ISO-8859-1">
<title>Product Details</title>
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
	href="${url}/plugins/scrollbar/css/jquery.mCustomScrollbar.css">
<link rel="stylesheet"
	href="${url}/plugins/owl-carousel/owl-carousel/owl.carousel.css">
<link rel="stylesheet"
	href="${url}/plugins/sky-forms-pro/skyforms/css/sky-forms.css">
<link rel="stylesheet"
	href="${url}/plugins/sky-forms-pro/skyforms/custom/custom-sky-forms.css">
<link rel="stylesheet"
	href="${url}/plugins/master-slider/quick-start/masterslider/style/masterslider.css">
<link rel='stylesheet'
	href="${url}/plugins/master-slider/quick-start/masterslider/skins/default/style.css">
<link rel="stylesheet" href="${url}/css/plugins/style-switcher.css">
<link rel="stylesheet" href="${url}/css/theme-colors/default.css"
	id="style_color">
<link rel="stylesheet" href="${url}/css/custom.css">
</head>
<body>
<body class="header-fixed">
	<div class="wrapper">
		<div class="header-v5 header-static">
			<jsp:include page="topbar.jsp"></jsp:include>
			<jsp:include page="navbar.jsp"></jsp:include>
		</div>
		<div class="shop-product">
			<div class="container">
				<ul class="breadcrumb-v5">
					<li><a href="${pageContext.request.contextPath }"><i class="fa fa-home"></i> Home</a></li>
				</ul>
			</div>
			<div class="container">
				<div class="row">
					<div class="col-md-6 md-margin-bottom-50">
						<div class="ms-showcase2-template">
							<div class="master-slider ms-skin-default" id="masterslider">
								<div class="ms-slide">
									<c:url value="/image?fname=${product.image }" var="imgUrl"></c:url>
									<img class="ms-brd" src="${url}/img/blank.gif"
										data-src="${imgUrl}" alt="${product.name }">
								</div>
							</div>
						</div>
					</div>

					<div class="col-md-6">
						<div class="shop-product-heading">
							<h2>${product.name }</h2>
						</div>

						${product.des } <br>
						<ul class="list-inline shop-product-prices margin-bottom-30">
							<li class="shop-red">$ ${product.price }.0</li>
						</ul>
						<h3 class="shop-product-title">Quantity</h3>
						<div class="margin-bottom-40">

							<form name="f1" class="product-quantity sm-margin-bottom-20"
								method="get" action="<c:url value="/member/cart/add"></c:url>">
								<input type="text" value="${product.id }" name="pId" hidden="">
								<button type='button' class="quantity-button" name='subtract'
									onclick='javascript: subtractQty();' value='-'>-</button>
								<input type='text' class="quantity-field" name='quantity'
									value="1" id='qty' />
								<button type='button' class="quantity-button" name='add'
									onclick='javascript: document.getElementById("qty").value++;'
									value='+'>+</button>
								<button type="submit" class="btn-u btn-u-sea-shop btn-u-lg">Add to Cart</button>
							</form>
						</div>
                                                <br></br>
						<p class="wishlist-category">
							<strong>Categories:</strong> <a href="#">${product.category.name }</a>
						</p>
					</div>
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
	<script src="${url}/plugins/owl-carousel/owl-carousel/owl.carousel.js"></script>
	<script
		src="${url}/plugins/scrollbar/js/jquery.mCustomScrollbar.concat.min.js"></script>
	<script
		src="${url}/plugins/master-slider/quick-start/masterslider/masterslider.min.js"></script>
	<script
		src="${url}/plugins/master-slider/quick-start/masterslider/jquery.easing.min.js"></script>
	<script src="${url}/js/custom.js"></script>
	<script src="${url}/js/shop.app.js"></script>
	<script src="${url}/js/plugins/owl-carousel.js"></script>
	<script src="${url}/js/plugins/master-slider.js"></script>
	<script src="${url}/js/forms/product-quantity.js"></script>
	<script>
		jQuery(document).ready(function() {
			App.init();
			App.initScrollBar();
			OwlCarousel.initOwlCarousel();
			MasterSliderShowcase2.initMasterSliderShowcase2();
		});
	</script>
</body>
</body>
</html>