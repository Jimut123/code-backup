<?php
$timestamp = strtotime('2-March-2011');
$newDate = date('d-F-Y', $timestamp); 
echo $newDate; //outputs 02-March-2011
$today = date("D M j G:i:s T Y");  
echo $today; 

?>
<br>
SERVER ADDRESS :
<?php
echo $_SERVER['SERVER_ADDR'];
?>
<br>
IP ADDRESS :
<?php
echo $_SERVER['REMOTE_ADDR'];
?>
<br>
HOSTNAME :
<?php
echo $_SERVER['REMOTE_HOST'];
?>
<br>
PORTNAME :
<?php
echo $_SERVER['REMOTE_PORT'];
?>
<br>
SERVER SIGNATURE :
<?php
echo $_SERVER['SERVER_SIGNATURE'];
?>