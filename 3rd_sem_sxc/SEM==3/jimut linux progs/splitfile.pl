system("clear");
printf("\n Enter the name of the original file \n");
chop($file1=<STDIN>);
printf("\n Enter the 1st output file name \n");
chop($file2=<STDIN>);
printf("\n Enter the 2nd output file name \n");
chop($file3=<STDIN>);
open(fp1,$file1);
$n=0;
	while(<fp1>){
	$x=$_;
	$n=$n+length($x);
	}
printf("Total no. of bytes is %4d",$n);
$n1=$n/2;
$n2=0;
close(fp1);
open(fp11,$file1);
open(fp2,">$file2");
open(fp3,">$file3");
	while(<fp11>){
	$x=$_;
	$n2=$n2+length($x);
	if($n2<$n1)
	{
	print fp2 $x;
	}
	if($n2>=$n1)
	{
	print fp3 $x;
	}
	};
close(fp2);
close(fp3);
close(fp11);

	
	


