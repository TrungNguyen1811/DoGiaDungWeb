<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<c:url value="/view/admin/static" var="url"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Pay</title>
<link href="${url}/css/bootstrap.css" rel="stylesheet" />
<link href="${url}/css/font-awesome.css" rel="stylesheet" />
<link href="${url}/css/custom.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
</head>
<body>
	<div id="wrapper">
		<jsp:include page="/view/admin/view/nav-bar.jsp"></jsp:include>
		<!-- /. NAV TOP  -->
		<jsp:include page="/view/admin/view/slide-bar.jsp"></jsp:include>
		<!-- /. NAV SIDE  -->
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<h2>Pay</h2>
						<h5>You can edit address & bank account in here</h5>
					</div>
				</div>
				<hr />
				<div class="row">
					<div class="col-md-12">
						<div class="panel panel-default">
                                                    	<div class="panel-heading">Add Address</div>
                                                            <form>
                                                                <div>Full name</div>
                                                                <input type="text" placeholder="H? và tên"  maxlength="64" value="">
                                                            <div >S? ?i?n tho?i</div>
                                                                <input type="text" placeholder="S? ?i?n tho?i"  value="">
                                                            <div>T?nh/ Thành ph?, Qu?n/Huy?n, Ph??ng/Xã</div>
                                                                <input  type="text" placeholder="T?nh/ Thành ph?, Qu?n/Huy?n, Ph??ng/Xã" value="">
                                                            <div> ??a ch? c? th?</div>
                                                                <textarea disabled="" rows="2" placeholder="??a ch? c? th?"  maxlength="128"></textarea>
                                                                <button>Tr? L?i</button><button>Hoàn thành</button>
                                                            </form>

							<div class="panel-heading">Add bank Account</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-md-6">										
										<form role="form" action="/member/buy"  method="post" enctype="multipart/form-data">
											<div>Chi ti?t th?</div>
                                                                                        <input maxlength="19" type="tel" placeholder="" value="">
                                                                                    <label style="max-width: 414px;">S? th?</label>
                                                                                        <input maxlength="19" type="tel" placeholder="" value="">
                                                                                    <label style="max-width: 261px;">Ngày h?t h?n (MM/YY)</label>
                                                                                        <input title="Mã CVV" type="password" placeholder="" value="">
                                                                                    <label style="max-width: 89px;">Mã CVV</label>
                                                                                        <input  type="tel" placeholder="" value="">
                                                                                    <label style="max-width: 414px;">H? và tên ch? th?</label>
                                                                                        <input  type="tel" placeholder="" value="">
                                                                                        
											<button type="submit" class="btn btn-default">Add</button>
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