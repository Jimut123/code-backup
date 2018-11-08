system("clear");
printf("/n Enter the file name \n");
$file1=<STDIN>;
printf("Enter out put file name \n");
$file2=<STDIN>;
open(fp1,$file1);
open(fp2,">$file2");
	while(<fp1>)
	{
	$x=$_;
	$l=length($x);
	for($i=0;$i<$l;$i++)
	{
	$char=substr($x,$i,1);
	$ch=uc($char);
	if($ch ge "A" && $ch le "Z")
	{
		print fp2 $ch;
	}
	else
	{
		print fp2 ";";
	} 
	}
	}
close(fp1);
close(fp2);


