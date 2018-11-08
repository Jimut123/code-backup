#copy content of one file to some output file
system("clear");
printf("\nEnter Input File Name=");
chop($file1=<STDIN>);
printf("Enter Output File Name=");
chop($file2=<STDIN>);
open(fp1,$file1); #open file1 in input mode
open(fp2,">$file2"); #open file2 in write mode
$nbyte=0; # $nbyte=number of bytes in input file
	while(<fp1>){
	$s=$_; #s_=one line of a any file
	$n=length($s); # $n=length of $s
	$nbyte=$nbyte + $n;
	print fp2 $s;
	}
close(fp1);
close(fp2);
printf("\nNumber of bytes transfered to output file=%d\n",$nbyte);

#End of Program
