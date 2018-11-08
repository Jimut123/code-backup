	#q1perl.pl: Write a program in perl to input 'n' where
	#n>=2 and n<=20. Calculate and print s=(1)+(1+2)+...
	#+(1+2+3+....+n).
	system("clear");
	print("\nEnter n(2-20)=");
	$n=<STDIN>;
	#To calculate sum
	$s=0;
	$ps=0;
		for($i=1;$i<=$n;$i++){
		$ps=$ps+$i;
		$s=$s+$ps;
		}
	printf("\nSum of %d numbers=%d\n",$n,$s);
	#end of q1perl.pl

