<?php
date_default_timezone_set("America/New_York");
echo "The time is " . date("h:i:sa");
?>
<?php
$d=mktime(11, 14, 54, 8, 12, 2014);
echo "Created date is " . date("Y-m-d h:i:sa", $d);
?>