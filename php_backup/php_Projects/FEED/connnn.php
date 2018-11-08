<html>
   <head>
      <title>Connect to MariaDB Server</title>
   </head>

   <body>
      <?php
         $dbhost = 'localhost';
         $dbuser = 'id2315504_jimut';
         $dbpass = 'jimut2014';
         $conn = mysql_connect($dbhost, $dbuser, $dbpass);
      
         if(! $conn ) {
            die('Could not connect: ' . mysql_error());
         }
         
         echo 'Connected successfully';
         mysql_close($conn);
      ?>
   </body>
</html>