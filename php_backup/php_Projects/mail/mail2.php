<?php

use Nette\Mail\Message;

$mail = new Message;
$mail->setFrom('John <john@example.com>')
    ->addTo('jimutbahanpal@yahoo.com')
    ->addTo('jimutbahanpal@yahoo.com')
    ->setSubject('Order Confirmation')
    ->setBody("Hello, Your order has been accepted.");



use Nette\Mail\SendmailMailer;

$mailer = new SendmailMailer;
$mailer->send($mail);

?>
