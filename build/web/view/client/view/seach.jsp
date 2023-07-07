<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div class="col-md-3 filter-by-block md-margin-bottom-60">
					<h1>Filter By</h1>
					<div class="panel-group" id="accordion">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h2 class="panel-title">
									<a data-toggle="collapse" data-parent="#accordion"
										href="#collapseOne"> Name <i class="fa fa-angle-down"></i>
									</a>
								</h2>
							</div>
							<div id="collapseOne" class="panel-collapse collapse in">
								<div class="panel-body">
									<ul class="list-unstyled checkbox-list">
									
									
										<form action="${pageContext.request.contextPath }/product/seach" method="get">
											<input type="text" name="name" />
											<input type="submit" class="btn-u btn-u-sea-shop" value="Seach" >
										</form>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<div class="panel-group" id="accordion-v2">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h2 class="panel-title">
									<a data-toggle="collapse" data-parent="#accordion-v2"
										href="#collapseTwo"> Categories <i
										class="fa fa-angle-down"></i>
									</a>
								</h2>
							</div>
							<div id="collapseTwo" class="panel-collapse collapse in">
								<div class="panel-body">
									<ul class="list-unstyled checkbox-list">
										<a href="${pageContext.request.contextPath }/product/category?cate_id=1" > Electronics</a>
										<br>
										<a href="${pageContext.request.contextPath }/product/category?cate_id=2" > Refrigeration</a>
										<br>
										<a href="${pageContext.request.contextPath }/product/category?cate_id=3" > Home Appliances </a>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>