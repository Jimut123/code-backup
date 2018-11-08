<?php
#require './vendor/autoload.php';
require 'C:\Bitnami\wampstack-5.6.31-0\apache2\htdocs\phpmailer\PHPMailerAutoload.php';
#require 'C:\Bitnami\wampstack-5.6.31-0\apache2\htdocs\phpmailer\class.smtp.php';
#require 'C:\Bitnami\wampstack-5.6.31-0\apache2\htdocs\phpmailer\class.phpmaileroauthgoogle.php';
#require 'C:\Bitnami\wampstack-5.6.31-0\apache2\htdocs\phpmailer\class.phpmailer.php';
#require 'C:\Bitnami\wampstack-5.6.31-0\apache2\htdocs\phpmailer\class.phpmaileroauth.php';
#require 'C:\Bitnami\wampstack-5.6.31-0\apache2\htdocs\phpmailer\class.pop3.php';



$mail = new phpmailer;

//$mail->SMTPDebug = 3;                               // Enable verbose debug output

$mail->isMail();                                      // Set mailer to use SMTP
$mail->Host = 'smtp.gmail.com';  // Specify main and backup SMTP servers
$mail->SMTPAuth = true;                               // Enable SMTP authentication
$mail->Username = 'jimutbahanpal@gamil.com';                 // SMTP username
$mail->Password = 'jimut1234';                           // SMTP password
$mail->SMTPSecure = 'tls';                            // Enable TLS encryption, `ssl` also accepted
$mail->Port = 465;                                    // TCP port to connect to

$mail->setFrom('from@example.com', 'Mailer');
$mail->addAddress('jimutbahanpal@yahoo.com', 'Jimut User');     // Add a recipient
//$mail->addAddress('ellen@example.com');               // Name is optional
//$mail->addReplyTo('info@example.com', 'Information');
//$mail->addCC('cc@example.com');
//$mail->addBCC('bcc@example.com');

//$mail->addAttachment('/var/tmp/file.tar.gz');         // Add attachments
//$mail->addAttachment('/tmp/image.jpg', 'new.jpg');    // Optional name
$mail->isHTML(true);                                  // Set email format to HTML

$mail->Subject = 'Here is the subject';
$mail->Body    = 'This is the HTML message body <b>in bold!</b>';
$mail->AltBody = 'This is the body in plain text for non-HTML mail clients';

if(!$mail->send()) {
    echo 'Message could not be sent.';
    echo 'Mailer Error: ' . $mail->ErrorInfo;
} else {
    echo 'Message has been sent';
}
?>