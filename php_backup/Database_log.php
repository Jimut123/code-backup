<?php

$user = 'root';
$pass = '';

$db = 'testdb';

$db = new mysqli('localhost', $user, $pass, $db) or die("Unable to connect");

echo "Great work";

?>﻿
