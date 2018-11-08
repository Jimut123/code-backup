	#xxperl12.pl : Write a program in perl to copy
	# content of one file or more files to some output file. 
	# Use command line arguments
	system("clear");
	$nargs=@ARGV; # $nargs=Number of arguments in command line
	open(fp2,">$ARGV[$nargs-1]"); # Opening last filename in output mode
	$nbyte=0; # $nbyte=Total number of Bytes in all input files
		for($i=0;$i< ($nargs-1) ; $i++){
		open(fp1,$ARGV[$i]);
		$fs[$i]=0; # $fs[i]= size of i-th inmput file
			while(<fp1>){
			$s=$_;
			$len=length($s);
			$fs[$i]=$fs[$i]+$len;
			print fp2 $s;
			}
		$nbyte=$nbyte+$fs[$i];
		close(fp1);
		}
	close(fp2);
	printf("\nSize of <%s>=%d Bytes\n",$ARGV[$nargs-1],$nbyte);
		for($i=0;$i<($nargs-1);$i++){
		printf("Size of <%s>=%d Bytes\n",$ARGV[$i],$fs[$i]);
		}
	#End of program





