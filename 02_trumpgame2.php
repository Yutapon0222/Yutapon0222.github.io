<html>
	<head>
	<center>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<font size="6">High&Lowゲーム</font>
	</head>
	<body>
		<hr>
		<form action="highAndLowS07.php" method="post">
		<?php
        //array関数を使ってトランプの画像名を配列で作成
        $cards = array("Jk.png","01.png","02.png","03.png","04.png","05.png","06.png",
            "07.png","08.png","09.png","10.png","11.png","12.png","13.png","bg.png");
        //0〜13の範囲でランダム数値を1つ取得
        $leftcard = mt_rand(0,13);
        echo '<img src="../cards/',$cards[$leftcard],'">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp';
        echo '<img src="../cards/bg.png">';
        echo '<input type="hidden" name="leftcard" value="',$leftcard,'">';
        echo '<br><br>';
        echo '<input type="radio" name="select" value="High">';
        echo 'High&nbsp;&nbsp;&nbsp;&nbsp;&nbsp';
        echo '<input type="radio" name="select" value="Low">';
        echo 'Low';
        echo '<br><br><br><br>';
        echo '<input type="submit" value="送信">';
        ?>
	</center>
	</form>
	</body>
</html>