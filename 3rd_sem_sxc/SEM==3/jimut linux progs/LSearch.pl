system("clear");
printf("Enter the number of names \t");
$n=<STDIN>;
for($i=0;$i<$n;$i++)
{
	printf("Enter %d th name",$i+1);
	chop($a[$i]=<STDIN>);
	
}
printf("LIST IS \n");
for($i=0;$i<$n;$i++)
{
        printf(" %s \n",$a[$i]);

}
printf("Enter the name to be searched \t");
chop($search=<STDIN>);
$flag=0;
for($i=0;$i<$n;$i++)
{
	if($search eq $a[$i])
	{
	$flag=1;
        printf("SEARCH SUCCESSFUL found at %d index \n",$i+1);
	}
}
if($flag==0)
{
	printf("SEARCH UNSUCCESSFUL \n ");
}

