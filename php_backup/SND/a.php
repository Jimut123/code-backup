
<?php
// using SendGrid's PHP Library
// https://github.com/sendgrid/sendgrid-php
// If you are using Composer (recommended)
require 'vendor/autoload.php';
// If you are not using Composer
// require("path/to/sendgrid-php/sendgrid-php.php");
$from = new SendGrid\Email("Jimut Bahan Pal", "jimutbahanpal@yahoo.com");
$subject = "Sending with SendGrid is Fun";
$to = new SendGrid\Email("Jimut Bahan Pal", "jimutbahanpal@gmail.com");
$content = new SendGrid\Content("text/plain", "and easy to do anywhere, even with PHP");
$mail = new SendGrid\Mail($from, $subject, $to, $content);
$apiKey = getenv('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');
$sg = new \SendGrid($apiKey);
$response = $sg->client->mail()->send()->post($mail);
echo $response->statusCode();
print_r($response->headers());
echo $response->body();
?>
MAIL IS SENT

