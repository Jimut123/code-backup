#Extract all words from any text file. Store those words in some output file.(The Word may be separated by a comma or any other delimmeter like '_' e.t.c.)
system("clear");
printf("\n Enter Input the file name :");
$file1=<STDIN>;
open(fp1,$file1);
printf("\n Name of the file where the words are stored :");
$file2=<STDIN>;
open(fp2,">$file2");
	while(<fp1>){
	$x=$_;
	$n=length($x);
		for($i=0;$i<$n;$i++){
		$ch=substr($x,$i,1); # 1 Character extracted
		$ch1=uc($ch); # upper case
			if($ch1 ge "A" && $ch1 le "Z")
				{
				print fp2 $ch1;
				}
			else{
				print fp2 ",";
                            }
		}
	}
close(fp1);
close(fp2);
#END
