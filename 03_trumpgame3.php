<html>
	<head>
		<meta http-equiv="content-type"content="text/html;charset=UTF-8">
		<center>
		<font size="6">High&Lowゲーム</font>
		<hr>
	</head>
	<body>
		<?php
        $cards = array("Jk.png","01.png","02.png","03.png","04.png","05.png","06.png",
           "07.png","08.png","09.png","10.png","11.png","12.png","13.png","bg.png");
        $rightcard = mt_rand(0,13);

        $num1 = $_POST['leftcard'];
        $num2 = $_POST['select'];
        echo '<img src="../cards/',$cards[$num1],'">';
        echo '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp';
        echo '<img src="../cards/',$cards[$rightcard],'">';
        echo '<br><br>';
        echo $num2,'を選択しました。';
        echo '<br><br>';
        if($num2=='High'){
            if($num1<$rightcard){
                echo 'You Win!';
            }else{
                echo 'You Lose...';
            }
            }
        else{
            if($num1>$rightcard){
                echo 'You Win!';
            }else{
                echo 'You Lose...';
            }
        }
        ?>
	<br><br>
	<a href="highAndLowS03.php">もう一度挑戦</a>
	</center>
	</body>
</html>