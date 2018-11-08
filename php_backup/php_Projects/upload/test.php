 <?php
 $db = mysqli_connect("localhost", "root", "jim12", "images");
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
    <form action="test.php" method="POST" enctype="multipart/form-data">
    <label>File: </label><input type="file" name="image" />
    <input type="submit" />
</form>