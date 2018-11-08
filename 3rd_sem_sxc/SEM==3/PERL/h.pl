
printf("\n Enter your 1st number = ");
$a=<STDIN>;
printf("Enter your 2nd number = ");
$b=<STDIN>;
if($b>$a)
{
$p=$a;
$a=$b;
$b=$p;
}
#printf ("a=%d b=%d HCF=%d LCM=%d \n",$a,$b,$h,$lc);
#end of main program
$h=&hcf($a,$b); #calling subroutine hcf()
$lc=&lcm($a,$b); # calling subroutine lcm()
printf ("a=%d b=%d HCF=%d LCM=%d \n",$a,$b,$h,$lc);




sub hcf {
local($x,$y)=@_;
while (($r = $x % $y)!=0){

$x = $y;
$y = $r;

}
$y;


sub lcm {
local($x,$y)=@_;
$hc=hcf($x,$y);
$lc=0;
if($hc!=0)
{
$lc=$x*$y/$hc;
}
else
{
$lc=$x*$y;
}
$lc;
}
}
