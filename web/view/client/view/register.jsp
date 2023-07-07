<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:url value="/view/client/static" var="url"></c:url>
<title>Register</title>
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
<link rel="stylesheet" href="${url}/css/pages/log-reg-v3.css">
<link rel="stylesheet" href="${url}/css/plugins/style-switcher.css">
<link rel="stylesheet" href="${url}/css/theme-colors/default.css"
	id="style_color">
<link rel="stylesheet" href="${url}/css/custom.css">
</head>
<body>
	<script>
		(function(s, u, b, i, z) {
			u[i] = u[i] || function() {
				u[i].t = +new Date();
				(u[i].q = u[i].q || []).push(arguments);
			};
			z = s.createElement('script');
			var zz = s.getElementsByTagName('script')[0];
			z.async = 1;
			z.src = b;
			z.id = 'subiz-script';
			zz.parentNode.insertBefore(z, zz);
		})(document, window, 'https://widgetv4.subiz.com/static/js/app.js',
				'subiz');
		subiz('setAccount', 'acqetkhujxyunuatbxzw');
	</script>
<body class="header-fixed">
	<div class="wrapper">
		<div class="header-v5 header-static">
			<jsp:include page="navbar.jsp"></jsp:include>
		</div>
			<div class="breadcrumbs-v4">
			<div class="container">
				<span class="page-name">Welcome To</span>
				<h1>
					<span class="shop-green">FPT</span> Shop
				</h1>
                                <h3>
					<span class="shop-red">First time to our website</span> Sign-up now
				</h3>
				<ul class="breadcrumb-v4-in">
					<li><a href="${pageContext.request.contextPath }">Home</a></li>
					<li class="active">Register</li>
				</ul>
			</div>
		</div>
		<div class="log-reg-v3 content-md margin-bottom-30">
			<div class="container">
				<div class="row">

					<div class="col-md-5">
						<form id="sky-form4" class="log-reg-block sky-form"
							action="register" method="post">
							<h2>Create New Account</h2>

							<div class="login-input reg-input">
								<section>
									<label class="input"> <input type="text"
										name="username" placeholder="Username" class="form-control">
									</label>
								</section>
								<section>
									<label class="input"> <input type="email" name="email"
										placeholder="Email address" class="form-control">
									</label>
								</section>
								<section>
									<label class="input"> <input type="password"
										name="password" placeholder="Password" id="password"
										class="form-control">
									</label>
								</section>
								<section>
									<label class="input"> <input type="password"
										name="passwordConfirm" placeholder="Confirm password"
										class="form-control">
									</label>
								</section>
							</div>

							<button class="btn-u btn-u-sea-shop btn-block margin-bottom-20"
								type="submit">Create Account</button>
						</form>

						<div class="margin-bottom-20"></div>
						<p class="text-center">
							Already you have an account? <a
								href="${pageContext.request.contextPath }/login">Sign In</a>
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
	<script
		src="${url}/plugins/sky-forms-pro/skyforms/js/jquery.validate.min.js"></script>
	<script
		src="${url}/plugins/scrollbar/js/jquery.mCustomScrollbar.concat.min.js"></script>
	<script src="${url}/js/custom.js"></script>
	<script src="${url}/js/shop.app.js"></script>
	<script src="${url}/js/forms/page_registration.js"></script>
	<script>
		jQuery(document).ready(function() {
			App.init();
			App.initScrollBar();
			Registration.initRegistration();
		});
	</script>
</body>
</body>
</html>