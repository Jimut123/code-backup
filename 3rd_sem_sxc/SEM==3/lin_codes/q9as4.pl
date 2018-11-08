#split a single file into two output files---->
system("clear");
printf("\nEnter the name of the file that is to be split : ");
$file1=<STDIN>;
printf("Enter the name of the first output file : ");
$file2=<STDIN>;
printf("Enter the name of the second output file : ");
$file3=<STDIN>;
open(fp1,$file1);
open(fp2,">$file2");
open(fp3,">$file3");
#To calculate the number of bytes in input file
$n=0; #$n=Number of bytes
	while(<fp1>){
	$x1=$_; #$_=one complete line
	$n=$n+length($x1);	
	}
$n1=$n/2;
close(fp1);
open(fp1,$file1);
$n=0;
	
	while(<fp1>){
	$x=$_;
	$n=$n+length($x);
		if($n<=$n1){
		print fp2 $x;
		}
		else
		{
		print fp3 $x;
		}
	}
close(fp1);
close(fp2);
close(fp3);
#End of file
