system("clear");
printf("\n Enter Input File Name=");
chop($file1=<STDIN>);
printf("\nEnter Input File2 Name=");
chop($file2=<STDIN>);
printf("\nEnter Output File Name=");
chop($file3=<STDIN>);
open(fp1,$file1);
open(fp3,">$file3");
$n=0;
#1 to 3
	while(<fp1>){
	$x=$_;
	$n=$n+length($x);
	print fp3 $x;
	}
#2 to 3
open(fp2,$file2);
	while(<fp2>){
	$x=$_;
	$n=$n+length($x);
	print fp3 $x;
	}
printf("Number of bytes copied %4d \n",$n);
close(fp1);
close(fp2);
close(fp3);
