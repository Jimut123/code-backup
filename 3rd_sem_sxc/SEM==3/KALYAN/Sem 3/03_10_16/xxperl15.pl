	#xxperl15.pl : Write a program to calculate number of 
	#vowels and number of consonants in any file.
	system("clear");
	printf("\nEnter Input File Name=");
	$file1=<STDIN>;
	open(fin,$file1);
	$nov=0; # $nov=number of vowels
	$nol=0; # $nol=number of letters
	$noc=0; # $noc=number of consonants
	#To calculate number vowels and also number of letters
		while(<fin>){
		$s=$_;
		$len=length($s);
			for($i=0;$i<$len;$i++){
			$ch=uc(substr($s,$i,1));
	if($ch eq "A" || $ch eq "E" || $ch eq "I" || $ch eq "O" || $ch eq "U"){
			$nov++;
			}
			if($ch ge "A" && $ch le "Z"){
			$nol++;
			}
		}
	}
	$noc=$nol-$nov;
	printf("\nNumber of vowels=%d Number of Consonants=%d\n",$nov,$noc);
	close(fin);
	#End of main program





