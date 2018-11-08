<?php

DEFINE ('DB_USER','root');
DEFINE ('DB_PASSWORD','');
DEFINE ('DB_HOST','127.0.0.1');
DEFINE ('DB_NAME','jimutdb');

$dbc = @mysqli_connect(DB_HOST,DB_USER,DB_PASSWORD,DB_NAME)
OR die('Could not connect to mysql'.
	mysqli_connect_error());
?>