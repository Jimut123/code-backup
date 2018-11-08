# To find the fibonacci series
# Q - 2

	system("clear");
	printf("\n Enter any +ve number which will be the limit of the fibonacci number :");
	$n=<STDIN>;
	$a=0;
	$b=1;

	printf("%d ",$a);
	$c=0;
	while ($c < $n)
	{
		
		printf(" %d ",$c);
		$a=$b;
		$b=$c;
		$c=$a+$b;
		
	}
