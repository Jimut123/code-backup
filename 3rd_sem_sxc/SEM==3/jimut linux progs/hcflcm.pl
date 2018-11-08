system("clear");
printf("\n Enter first number");
$a=<STDIN>;
printf("\n Enter 2nd number");
$b=<STDIN>;
$h=&hcf($a,$b);
$l=&lcm($a,$b);
printf("a=%d b=%d hcf=%d lcm=%d \n",$a,$b,$h,$l);
#end of main
sub hcf{
local($x,$y)=@_;
#To copy parameters of main in subroutine
	while(($r=$x % $y ) !=0)
	{
	$x=$y;
	$y=$r;
	}
	$y;
	}
sub lcm {
local($x,$y)=@_;
$l=($a*$b)/$h;
$l;
}
#end of program 
