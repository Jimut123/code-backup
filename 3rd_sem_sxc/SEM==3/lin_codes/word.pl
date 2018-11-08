system("clear");


printf("\n Enter any sentence :");
$s=<STDIN>;
$len=length($s);

for($i=0;$i<$len;$i++)
{
	$c=substr($s,$i,1);
	if($c==' ')
	{
		$wc++;
		#printf(" ");
	}
	else
	{
		printf("%c",$c);
	}
	printf("wc = %d\n",$wc);
	
}




