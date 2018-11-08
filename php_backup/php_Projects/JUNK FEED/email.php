<?php
$to = "somebody@example.com";
$subject = "My subject";
$txt = "Hello world!";
$headers = "From: paljimutbahan@gmail.com" . "\r\n" .
"CC: jimutbahanpal@yahoo.com";

mail($to,$subject,$txt,$headers);
?>