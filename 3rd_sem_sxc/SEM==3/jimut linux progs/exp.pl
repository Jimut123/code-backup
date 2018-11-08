system("clear");
printf("Enter the value of n");
$n=<STDIN>;
printf("Enter the value of x");
$x=<STDIN>;
$sum=0;
$d=0;
for($i=1;$i<=$n;$i++)
{
	$d=(&power($x,$i)/&fact($i-1));
	$sum=$sum+$d;
}
printf ("exp(%xd) upto n =%d = %d",$x,$n,$sum);
sub power{
local($a,$b)=@_;
$r=1;
for($i=1;$i<=$b;$i++)
{
	$r=$r*$a;
}
return $r;
}
sub fact{
local($c)=@_;
$f=1;
for($i=$c;$i>=1;$i--)
{
	$f=$f*$i;
}
return $f;
}		
