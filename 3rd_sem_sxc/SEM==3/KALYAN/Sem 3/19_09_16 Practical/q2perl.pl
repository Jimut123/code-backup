	#q2perl.pl : Write a program to input 'n' where
	#n >=1 and n<=999999999. Calculate and print
	# sum of digits in 'n'.
	system("clear");
	print("\nEnter n(1-999999999)=");
	$n=<STDIN>;
	$m=$n;  # $m is a copy of $n
	# To calculate sum of digits
	$s=0;
		while($m != 0){
		$d=$m % 10;
		$s=$s + $d;
		$m=$m/10;
		}
	printf("\nSum of digits in %d=%d\n",$n,$s);
	#end of q2perl.pl

