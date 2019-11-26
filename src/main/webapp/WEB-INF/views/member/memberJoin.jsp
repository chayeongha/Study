<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../layout/bootStrap.jsp" />
</head>
<body>
	<c:import url="../layout/nav.jsp" />

	<div class="container">
		<form action="./memberJoin" method="post" id="frm">
			<!-- 아이디 -->
			<div class="form-group">
				<label for="id">아이디</label> <input type="text" class="form-control"
					id="id" name="id" placeholder="ID" required="required">
				<div id="checkIdResult"></div>
			</div>

			<div class="checkId"></div>

			<!-- 비밀번호 -->
			<div class="form-group">
				<label for="user_pw">비밀번호</label> <input type="password"
					class="form-control" id="pw" name="pw" placeholder="PASSWORD"
					required="required">
			</div>

			<!-- 이름 -->
			<div class="form-group">
				<label for="user_name">이름</label> <input type="text"
					class="form-control" id="name" name="name" placeholder="Name"
					required="required">
			</div>

			<!-- 생년월일 -->
			<div class="form-group required">
				<label for="user_birth">생년월일</label> <input type="text"
					class="form-control" id="birth" name="birth"
					placeholder="ex) 19990415" required="required">
			</div>

			<!-- 이메일 -->
			<div class="form-group">
				<label for="user_email">이메일</label> <input type="email"
					class="form-control" name="email" id="email" placeholder="E-mail">
			</div>

			<!-- 성 -->
			<div class="form-group">
				<label for="user_gender">성별</label> <label>
				<input
					type="checkbox" name="gender" value="F">여성</label> <label>
					<input
					type="checkbox" name="gender" value="M">남성</label>
			</div>

		
			<div class="form-group">
			<button class="btn btn-primary px-3" type="submit" >Join</button>
			</div>

		</form>

	</div>

	
</body>
</html>