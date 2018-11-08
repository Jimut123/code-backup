	#q6perl.pl : Write a program to input any sentence.
	# Print all words within the sentence. 
	system("clear");
	print("\nEnter any sentence=");
	$s=<STDIN>;
	$len=length($s);
	$nw=0; # $nw=number of words in $s
	$flag=1;
		for($i=0;$i<$len;$i++){
		$c=substr($s,$i,1);
		$c1=uc($c);
			if($c1 ge "A" && $c1 le "Z"){
				if($flag==1){
				$nw++;
				$flag=0;
				}
			print($c);
			}
			elsif($flag==0){
			printf("\n");
			$flag=1;
			}
		}
	printf("\nTotal number of words=%d\n",$nw);
	#end of q6perl.pl

