	#xxperl11.pl : Write a program in perl to copy
	# content of one file to some output file. Use command
	# line arguments
	system("clear");
	open(fp1,$ARGV[0]); # opening $ARGV[0]  in input mode
	open(fp2,">$ARGV[1]"); # opening $ARGV[1] in output mode
	$nbyte=0; # $nbyte=number of bytes in input file
		while(<fp1>){
		$s=$_; # $_= one line of a any file
		$n=length($s); # $n=length of $s
		$nbyte=$nbyte + $n;
		print fp2 $s;
		}
	close(fp1);
	close(fp2);
    printf("\nNumber of Bytes transfered to output file=%d\n",$nbyte);
	#End of program





