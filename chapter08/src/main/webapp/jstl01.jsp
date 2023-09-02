<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="page" value="1" scope="request" />
<%-- value="1" : 문자 1, value="${1}" : 정수 1 --%>

<%@ include file="header.jsp"%>
<body>
	<div class="container">
		<h1>Page: ${pageScope.page} / ${requestScope.page} / ${page}</h1>
		<c:out value="${page}" /> / <c:out value="page" />
		<c:remove var="page" />
		(${page})
	</div>
</body>
<%@ include file="footer.jsp"%>