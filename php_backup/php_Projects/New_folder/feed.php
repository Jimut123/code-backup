<!--

<?php
$servername = 'localhost';
$username = 'id2315504_post';
$password = 'jimut2014';
$db_name = 'id2315504_feed';

?>




-->



<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"><!-- The bootstrap loader-->
<link href="https://afeld.github.io/emoji-css/emoji.css" rel="stylesheet">
<link rel="stylesheet" href="feed1.css" ><!-- The feed css loader-->
<link href="https://fonts.googleapis.com/css?family=Fondamento" rel="stylesheet"><!-- The google text api loader-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
    h1{
        text-align : center;
    }
</style>

<section class="Jim-net">
    <h1>Anonymous forum</h1>
</section>
 <hr>
<style>
body{
    color: black;
    background-color: #d8e7ff;
}
.Jim-net{
    color: #001a44;
}
textarea.input_text: {
    color: #d8e7ff;
}
</style>
<div class="container">
<section class="fullpage" >
<section class="postBar">
POST SOMETHING : 
<br>
<form method="post" >
<input type="text" name="feed_1" class="input_text" value="">
<br><br>
<input type="submit" name="submit" class="submit_button" value="post"> 
</form>
</section>
<?php

$servername = 'localhost';
$username = 'root';
$password = 'jim12';
$db_name = 'jimutdb';

?>
<section class ="imp">


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
if (empty($_POST["feed_1"])) {
    echo "<br>"."post is required"."<br>";
  } 

  else{
    $today = date("D M j G:i:s T Y");  
$sql = "INSERT INTO `feed` (info,today,server_address,ip_address,port_name)
VALUES ('".addslashes($_POST["feed_1"])."','".$today."','".$_SERVER['SERVER_ADDR']."','".$_SERVER['REMOTE_ADDR']."','".$_SERVER['REMOTE_PORT']."')";


if ($conn->query($sql) == TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}
}
?>
</section>
<section class="chat" >
<?php
$sql = "SELECT info,today FROM feed";
$result = $conn->query($sql);
?>
<br><br>
<?php
if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
    
        
        echo "<sup>".$row["today"]."</sup>"."&nbsp"."&nbsp"."&nbsp"."<mark>".$row["info"]."</mark>"."<br><br>";
    
    }
} else {
    echo "0 results";
}
$conn->close();
?>
</section>
</section>
</div>
<footer>a 
<a href="" target="_blank" class="JBP">&copy Jimut Bahan Pal </a>  
production 
</footer>
<br><br>