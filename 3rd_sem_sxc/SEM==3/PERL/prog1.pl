#WAP in perl to input any +ve integers and print all the prime 
#numbers <= n . Use a sub routine is prime(n)
#whether n is prime or not prime.


	system("clear");
	printf("\n Enter any +ve integer");
	$n=<STDIN>;
	$count=0;
		for($i=2;$i<=$n;$i++)
		{
			$m=&is_prime($i);
			if($m==1)
			{
				$count++;
				printf("%4d",$i);
			}
		}
	printf("\n total prime numbers found : %d\n",$count);
	$count=0;
	for($i=2;$i<=$n;$i++)
		{
			$m=&is_prime($i);
			if($m==0)
			{
				$count++;
				printf("%4d",$i);
			}
		}
		
	printf("\n total non-prime numbers found : %d\n",$count);
	
	#End of main block

	sub is_prime{
	local($ii)=@_;
	$i1=int($ii/2);
	$flag=1;
		for($j=2;$j<=$i1;$j++)
		{
			if(($ii % $j)==0)
			{
				$flag=0;
				last if($flag==0);
			}
		}
	return $flag;
	}
				



	
