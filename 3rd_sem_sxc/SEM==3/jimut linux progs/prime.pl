system("clear");
printf("Enter any range");
$n=<STDIN>;
for($i=2;$i<=$n;$i++)
{
	$check=&is_prime($i);
	if($check==1){
	printf("%d \n",$i);
	}
}
sub is_prime{
local($x)=@_;
$count=0;
for($j=2;$j<=$x/2;$j++)
{
	if($x % $j==0)
	{$count=1;
	}
}
if($count==0){
1;
}
else{
0;
}
}
#end of program


