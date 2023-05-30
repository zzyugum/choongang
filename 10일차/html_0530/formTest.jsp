<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>레드향 주문하기</title>
   <link rel="stylesheet" href="css/order.css">
</head>
<body>
    <div id="container">
    <h1>레드향 주문하기</h1>
    <form>
      <fieldset>
        <legend>배송 정보</legend>
        <ul id="shipping">
		  <li>
		  	<lable for="prod">주문 상품</lable>
		  	<input type="text" id="prod" value="상품용 3kg" readonly> 
		  </li>
        
          <li>
            <label for="user-name">이름 </label>
            <input type="text" id="user-name" placeholder="이름을 입력하세요" autofocus required>
          </li>
          <li>
            <label for="addr">배송 주소</label> 
            <input type="text" id="addr" required>
          </li>
          <li>
            <label for="mail">이메일</label>
            <input type="email" id="mail">
          </li>        
          <li>
            <label for="phone">연락처</label>
            <input type="tel" id="phone" placeholder="하이픈 빼고 입력해 주세요.(01012345678)" required>
          </li>
          <li>
            <label for="d-day">배송 지정</label>
            <input type="date" id="d-day"> <small>(주문일로부터 최소 3일 이후)</small>
          </li>        
        </ul>  
      </fieldset>
      <div id="buttons">
        <input type="submit" value="주문하기"> 
        <input type="reset" value="취소하기">
      </div>        
    </form>
  </div>
</body>
</html>