<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="header.jsp"%>
<div class="container">
	<h1>fmt 실습</h1>
	<c:set var="myDate" value="<%=new java.util.Date()%>" />
	<c:out value="${myDate}" />
	<br>

	<fmt:formatDate value="${myDate}" type="date" />
	<br>
	<fmt:formatDate value="${myDate}" type="time" />
	<br>
	<fmt:formatDate value="${myDate}" type="both" />
	<br>
	<fmt:formatDate value="${myDate}" type="both" dateStyle="short"
		timeStyle="short" />
	<br>
	<fmt:formatDate value="${myDate}" type="both" dateStyle="long"
		timeStyle="long" />
	<br>

	<fmt:formatDate value="${myDate}" pattern="YYYY-MM-dd a hh:mm:ss" />
	<br>

	<h1>JSTL fmt 라이브러리 실습2</h1>
	<fmt:formatNumber value="100000" type="currency" />
	<br>
	<fmt:formatNumber value="0.123" type="percent" />
	<br>
	<fmt:formatNumber value="987654321.1" pattern="#,###.00" />
	<br>
</div>
<%@ include file="footer.jsp"%>