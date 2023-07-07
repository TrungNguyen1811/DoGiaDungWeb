<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <c:url value="/view/client/static" var="url"></c:url>
      
 <div class="navbar navbar-default mega-menu" role="navigation">
            <div class="container">
                <!--Toggle navigation & logo-->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="${pageContext.request.contextPath }">
                        <img id="logo-header" src="${url}/img/fpt-shop.png" alt="Logo">
                    </a>
                </div>
                <div class="collapse navbar-collapse navbar-responsive-collapse">
                   <jsp:include page="/view/client/view/cart.jsp"></jsp:include>
                    <ul class="nav navbar-nav">
                        <li class="dropdown active">
                            <a href="${pageContext.request.contextPath}" class="dropdown-toggle" data-hover="dropdown" data-toggle="dropdown">
                                Main Page
                            </a>
                            
                            <ul class="dropdown-menu">
                                <li><a href="${pageContext.request.contextPath }">Home Page</a></li>
                                <li><a href="${pageContext.request.contextPath }/product/list">Product Page</a></li>
                                <li><a href="${pageContext.request.contextPath }/member/cart">Cart Page</a></li>
                            </ul>
                        </li>
                        
                        <li class="dropdown active">
                            <a href="javascript:void(0);" class="dropdown-toggle" data-hover="dropdown" data-toggle="dropdown">
                                Connect to FPT Shop
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="${pageContext.request.contextPath }/login">Login</a></li>
                                <li> <a href="${pageContext.request.contextPath }/register">Register</a></li>
                            </ul>
                        </li>
                        
                        <li class="dropdown active">
                            <a href="javascript:void(0);" class="dropdown-toggle" data-hover="dropdown" data-toggle="dropdown">
                                About
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="https://fpt.vn/vi">FPT</a></li>
                            </ul>
                        </li>
                    </ul>                   
                </div>
            </div>    
        </div>            