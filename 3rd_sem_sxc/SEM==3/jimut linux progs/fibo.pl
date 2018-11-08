system("clear");
printf("Enter range of fibonacci \n");
$n=<STDIN>;
$a=-1;
$b=+1;
$c=$a+$b;
	for(;$c<=$n;)
	{
	$c=$a+$b;
	if($c<=$n)
	{
	printf("%d \t",$c);
	}
	$a=$b;
	$b=$c;
	}
#end of program
