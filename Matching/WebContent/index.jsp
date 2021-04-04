<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>マッチング</title>
</head>
<body>
<p>ほしの みえこ<br>
星野 美恵子<br>
無｜新｜70歳<br>
支持：共産<br>
元福岡市議会議員、元九州朝日放送労組専従書記<br></p>
<p>はっとり せいたろう<br>
服部 誠太郎<br>
無｜新｜66歳<br>
推薦：自民・立民・公明・社民<br>
元福岡県副知事、元福岡県福祉労働部長<br></p>
<form action="/Matching/Home" method= "post">
<p>アンケート</p>
<p>Q１<br>
<input type="radio" name="q1" value="1"> 反対
<input type="radio" name="q1" value="2"> 少し反対
<input type="radio" name="q1" value="3"> 中立
<input type="radio" name="q1" value="4"> 少し賛成
<input type="radio" name="q1" value="5"> 賛成
</p>

<p>Q２<br>
<input type="radio" name="q2" value="1"> 反対
<input type="radio" name="q2" value="2"> 少し反対
<input type="radio" name="q2" value="3"> 中立
<input type="radio" name="q2" value="4"> 少し賛成
<input type="radio" name="q2" value="5"> 賛成
</p>

<p>Q３<br>
<input type="radio" name="q3" value="1"> 反対
<input type="radio" name="q3" value="2"> 少し反対
<input type="radio" name="q3" value="3"> 中立
<input type="radio" name="q3" value="4"> 少し賛成
<input type="radio" name="q3" value="5"> 賛成
</p>

<p>Q４<br>
<input type="radio" name="q4" value="1"> 反対
<input type="radio" name="q4" value="2"> 少し反対
<input type="radio" name="q4" value="3"> 中立
<input type="radio" name="q4" value="4"> 少し賛成
<input type="radio" name="q4" value="5"> 賛成
</p>

<p>Q５<br>
<input type="radio" name="q5" value="1"> 反対
<input type="radio" name="q5" value="2"> 少し反対
<input type="radio" name="q5" value="3"> 中立
<input type="radio" name="q5" value="4"> 少し賛成
<input type="radio" name="q5" value="5"> 賛成
</p>
<input type = "submit" value = "結果を見る" class="button">
</form>
</body>
</html>