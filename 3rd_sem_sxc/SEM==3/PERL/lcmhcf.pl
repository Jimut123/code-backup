system("clear");
printf("\nEnter two numbers \n");
$a=<STDIN>;
$b=<STDIN>;
$x=0;
$y=0;
if($b>$a)
{ 
  $x=$b;
  $y=$a;
}
else
{
  $x=$a;
  $y=$b;
}
$r=$a%$b;
while($r>0)
{
  $x=$y;
  $y=$r;
  $r=$a%$b;
}
printf ("HCF = %d",y)
$lcm=($a*$b/$y);
printf ("LCM = %d"

