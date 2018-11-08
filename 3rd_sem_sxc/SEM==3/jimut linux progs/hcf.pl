system("clear");
printf("\n Enter first number");
$a=<STDIN>;
printf("\n Enter 2nd number");
$b=<STDIN>;
$x=$a;
$y=$b;
$r=$x%$y;
while($r!=0)
{
	$x=$y;
	$y=$r;
	$r=$x%$y;
}
$h=$y;
$l=$a*$b/$h;
printf("hcf = %d lcm = %d of %d and %d",$h,$l,$a,$b);
#end of program
