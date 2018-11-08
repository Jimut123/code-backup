	#q3perl.pl : Write a program to input 'n' where n>=2
	# and n<=2000. calculate and print all prime numbers
	#<=n. Display also how many prime nunbers are there
	#in 'n'.
	system("clear");
	print("\nEnter n(2-2000)=");
	$n=<STDIN>;
	$count=0; # $count= total prime numbers <=$n
	system("clear");
	printf("\nPrime Numbers <=%d--->\n",$n);
		for($i=2;$i<=$n;$i++){
		$n1=$i/2;
		$flag=1;
			for($j=2;$j<=$n1;$j++){
			$r=$i % $j;
				if($r == 0){
				$flag=0;
				}
			last if($flag==0);
			}
			if($flag==1){
			printf("%4d ",$i);
			$count++;
			}
		}
	printf("\n\nTotal prime numbers <=%d =%d\n",$n,$count);
	#end of q3perl.pl

	
