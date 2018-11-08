	#xxperl11.pl :Write a program to copy one or more files to
	#to one outpyt file. Use command line arguments
	system("clear");
	$nargs=@ARGV;
	printf("\nnargs=%d\n",$nargs);
	open(fp2,">$ARGV[$nargs-1]");
	$n=0; # $n=Number of Bytes in all input files
		for($i=0;$i<($nargs-1);$i++){
		$fs[i]=0;
		open(fp1,$ARGV[i]);
			while(<fp1>){
			$s=$_;
			$len=length($s);
				print fp2 $s;
			$n=$n+$len;
			$fs[i]=$fs[i]+$len;
			}
		close(fp1);
		}
	printf("\nSize of <%s>=%d Bytes\n",$ARGV[$nargs-1],$n);
		for($i=0;$i<($nargs-1);$i++){
		printf("Size of <%s>=%d Bytes\n",$ARGV[$i],$fs[i]);
		}
	close(fp2);
	#End of main program


