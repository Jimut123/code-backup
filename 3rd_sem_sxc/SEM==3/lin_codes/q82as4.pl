#q82as4.pl :Write a program to copy
#content of 2 files to one input file
system("clear");
printf("\nEnter Input File name-1:");
$file1=<STDIN>;
printf("Enter Input File name-2:");
$file2=<STDIN>;
printf("Enter Output file name:");
$file3=<STDIN>;
open(fp1,$file1);#File opened in input mode
open(fp3,">$file3");
$n=0;#$n=Number of bytes
	while(<fp1>){
	$x=$_;#$_=one complete line
	$n=$n+length($x);
	print fp3 $x;	
	}
#copying @nd input file to the output file---->
open(fp2,$file2);
	while(<fp2>){
	$x=$_;
	$n=$n+length($x);
	print fp3 $x;	
	}
printf("\nTotal no. of bytes copied=%d\n",$n);
close(fp1);
close(fp2);
close(fp3);
#End Of Program
