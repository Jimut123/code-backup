
	#xxperl16.pl : Write a program in perl to extract all words from
	# any file and save those words in some output file. Display
	# all words on screen. Print total number of words found.
	system("clear");
	printf("\nEntyer Input File Name=");
	$file1=<STDIN>;
	printf("Enter Output File Name=");
	$file2=<STDIN>;
	open(fin,$file1);
	open(fout,">$file2");
	$nw=0; # $nw=Number of words in Input file
		while(<fin>){
		$s=$_;
		$len=length($s);
		$flag=1;
			for($i=0;$i<$len;$i++){
			$ch1=substr($s,$i,1);
				if(uc($ch1) ge "A" && uc($ch1) le "Z"){
					if($flag==1){
					$nw++;
						if(($nw%15)==0){
						printf("\nPress enter key--->");
						$ans=<STDIN>;
						system("clear");
						}
					$flag=0;
					}
				printf("%s",$ch1);
				print fout $ch1;
				}
				elsif($flag == 0){
				printf("\n");
				print fout "\n";
				$flag=1;
				}
			}
		}
	close(fin);
	close(fout);
	printf("\nTotal Number of words=%d\n",$nw);
	#end of program	


