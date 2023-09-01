<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<body>
	<div class="container">
		<h1>로그인 입력 화면</h1>
		<form action="loginInfo.jsp" method="post">
			<fieldset>
				<legend>로그인 폼</legend>
				<ul>
					<li><label for="userid">아이디</label> <input type="text"
						name="userid"></li>
					<li><label for="passwd">비밀번호</label> <input type="password"
						name="passwd"></li>
					<li><input type="submit" value="전송"></li>
				</ul>
			</fieldset>
		</form>
	</div>
</body>
<%@ include file="footer.jsp"%>