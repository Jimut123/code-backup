 <?php

$servername = 'localhost';
$username = 'root';
$password = 'jim12';
$db_name = 'photos';

?>

<?php
// Create connection
$conn = new mysqli($servername, $username, $password,$db_name);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

echo "<br>Connected successfully<br>";

?>
 <?php

 $image = addslashes(file_get_contents($_FILES['image']['tmp_name'])); //SQL Injection defence!
$image_name = addslashes($_FILES['image']['name']);
$sql = "INSERT INTO `images` ( `image`, `image_name`) VALUES ('{$image}', '{$image_name}')";
if (!mysql_query($sql)) { // Error handling
    echo "Something went wrong! :("; 
}

   }
        /*-----------------
    IMAGE QUERY END
    ---------------------*/
?>

<form method="post" action="test.php" enctype="multipart/form-data">
<div>
<input type="file" name="image">
</div>
<div>
<textarea name="text" cols="40" rows="4" placeholder="Say Something about This Image ..."></textarea>
</div>
<div>
<input type="submit" name="upload" value="upload image">
</div>
</form>
