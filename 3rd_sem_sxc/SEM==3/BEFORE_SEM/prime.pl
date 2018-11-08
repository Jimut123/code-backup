system("clear");
printf("\n Enter the upper bound of the prime range : \n");
$n=<STDIN>;



for($i=2;$i<=$n;$i++)
{
	$check=&isPrime($i);
	if($check==1)
	{
		printf("%d\t",i);
	}	
	#printf("i = %d, check = %d",$i,$check);

}
sub isPrime
{
	local($x)=@_;
	$chk=0
	for($j=2;$j<$x;$j++)
	{
		if($x%$j==0)
		{
			$chk=1
		}
	
	}
	if($chk==1)
	{
		0;
	}
	else
	{
		1;	
	}
}

