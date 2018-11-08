system("clear");
	for($i=.1;$i<=1.0;$i=$i+.1)
	{
	$y=&expx($i);
	printf("exp(%5.1f)=%8.5f\n",$i,$y);
	}
#end of program
sub expx{
local($x)=@_;
$ce=1;
$pe=0;
$eps=$ce-$pe;
$fact=1;
$px=1;
$n=1;
	while($eps > 1e-08){
	$pe=$ce;
	$fact=$fact*$n;
	$px=$px*$x;
	$ce=$ce+$px/$fact;
	$eps=$ce-$pe;
	$n=$n+1;
	}
return $ce;
}
		

	
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
