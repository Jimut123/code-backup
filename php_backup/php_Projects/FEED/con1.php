<?php
$servername = 'localhost';
$username = 'root';
$password = 'jimut2014';

// Create connection
$conn = new mysqli($servername, $username, $password,"",4236);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 
echo "Connected successfully";


?>
