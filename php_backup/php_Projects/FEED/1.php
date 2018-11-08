
/*
 
                *
Simple and easy
 
*/
 
$conn = mysql_connect("localhost",
"root", "");
 
$select_db = mysql_select_db("xmlfeed");
 
header("Content-Type: application/xml;
charset=UTF-8"); // To output file in xml Format
 
$rssfeed = '<?xml version="1.0"
encoding="ISO-8859-1"?>';
 
$rssfeed .= '<rss version="2.0">';
 
$rssfeed .= '<channel>';
 
$rssfeed .= '<title>Trinity Blog</title>';
 
$rssfeed .=
'<link>http://www.trinityblog.in</link>';
 
$rssfeed .= '<description>RSS feed of
trinityblog.in</description>';
 
$rssfeed .= '<language>en-us</language>';
 
$rssfeed .= '<copyright>Copyright (C)
trinityblog.in</copyright>';
 
$query = "SELECT * FROM `feed` ORDER BY sr DESC";
 
$result = mysql_query($query) or die ("Could not
execute query");
 
while($row = mysql_fetch_array($result)) {
 
                extract($row);
 
                /* Get
category name */
 
                $rssfeed
.= '<item>';
 
                $rssfeed
.= '<title>' . $title . '</title>';
 
                $rssfeed
.= '<description><![CDATA['. $desc. ']]></description>';
 
                $rssfeed
.= '<link>' . $link. '</link>';
 
                $rssfeed
.= '</item>';
 
}
 
$rssfeed .= '</channel>';
 
$rssfeed .= '</rss>';               
 
echo $rssfeed;
 
?>