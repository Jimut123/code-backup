#HCF and LCM of two numbers--->
system("clear");
printf("\nEnter the first number ");
$a=<STDIN>;
printf("\nEnter the second number ");
$b=<STDIN>;
$h=&hcf($a,$b); #calculate subroutine hcf()
$lc=&lcm($a,$b); #calculate subroutine lcm()
printf("a=%d,b=%d,hcf=%d,lcm=%d\n",$a,$b,$h,$lc);
#End of main progarm
sub hcf{
local($x,$y)=@_;
#To copy parameters of main in subroutine 
while(($r=$x % $y)!=0){
$x=$y;
$y=$r;
}
$y;
}

sub lcm{
local($x,$y)=@_;
$lc=$x*$y/&hcf($x,$y);
$lc;
}
