#write a program in perl to copy content from one file to another-->
system("clear");
printf("\nEnter Input File Name=");
chop($file1=<STDIN>);
printf("Enter Output File Name=");
chop($file2=<STDIN>);
open(fp1,$file1);
open(fp2,">$file2");
	while(<fp1>){
	$x=$_;
printf fp2 $x;
}
close(fp1);
close(fp2);
}
