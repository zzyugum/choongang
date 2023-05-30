<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8">
    <title>연습문제 2</title>
    <style>
			#container { 
				width:520px;
				border:1px solid black;
				padding:20px 40px;
				margin:0 auto;
			}
      fieldset { margin-bottom:15px; }
      legend { font-weight:bold; }
			ul {list-style-type: none;}
			li { line-height:30px;}
    </style>
  </head>
  <body>
		<div id="container">
			<h1>프런트엔드 개발자 지원서 </h1>
			<p>HTML, CSS, Javascript에 대한 기술적 이해와 경험이 있는 분을 찾습니다.</p>
			<hr>
			<form>
				
				<strong>개인정보</strong>
				<ul>
					<li>
					<lable for="r-name">이름<input type="text" id=r-name></lable>
					</li>
					<li>
					<lable for="r-phon">연락처<input type="text" id=r-phon></lable>
					</li>
				</ul>
				<strong>지원 분야</strong>
				<ul>
					<li>
					<lable><input type="radio"> 웹 퍼블리싱</lable>
					</li>
					<li>
					<lable><input type="radio"> 웹 어플리케이션 개발</lable>
					</li>
					<li>
					<lable><input type="radio"> 개발 환경 개선</lable>
					</li>
				</ul>
				<strong>지원 동기</strong>
				<ul>
					<li>
						<textarea cols="60" rows ="5" placeholder="본사 지원 동기를 간략히 써 주세요."></textarea>
					</li>
					</ul>
				<input type="submit" value="접수하기">
				<input type="reset" value="다시쓰기">
			</form>
		</div>
  </body>
</html>
