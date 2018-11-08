	#xxperl14.pl : Write a program in perl to split
	# one input file to two(2) output files. 
	# Use command line arguments
	system("clear");
	$nargs=@ARGV; # $nargs=Number of arguments in command line
	open(fin,$ARGV[0]); # Opening first  filename in input mode
	$nbyte=0; # $nbyte=Total number of Bytes in all input file
	#To calculate total number of bytes in input file
		while(<fin>){
		$len=length($_);
		$nbyte=$nbyte+$len;
		}
	$n1=int($nbyte / 2);  #Size of first output file 
	$n2=$nbyte - $n1;  #size of second output file
	printf("nbyte=%d n1=%d n2=%d\n",$nbyte,$n1,$n2);
	close(fin);
	open(fin,$ARGV[0]);  # Opening first filename in input mode
	$n=0;
	open(fout1,">$ARGV[1]");
	open(fout2,">$ARGV[2]");
		while(<fin>){
		$s=$_;
		$len=length($s);
			for($i=1;$i<=$len;$i++){
			$n=$n+1;
				if($n<=$n1){
				print fout1 substr($s,$i,1);
				}
				else{
				print fout2 substr($s,$i,1);
				}
			}
		}
	close(fin);
	close(fout1);
	close(fout2);
	printf("\nSize of <%s>=%d Bytes\n",$ARGV[0],$n);
	printf("Size of <%s>=%d Bytes\n",$ARGV[1],$n1);
	printf("Size of <%s>=%d Bytes\n",$ARGV[2],$n2);
	#End of program





