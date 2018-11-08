<?php
$x=5;
$y=10;
function myTest()
{
	global $x,$y;
	$y=$y+$x;
	//echo $y; //should result in 15
}
myTest();
echo $y;
?>