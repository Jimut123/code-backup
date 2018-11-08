#input names in a list and search the list using linear search--->
system("clear");
printf("\nEnter size of your list(1-20)=");
$n=<STDIN>;
printf("\nEnter %d names-->\n",$n);
	for($i=0;$i<$n;$i++){
	printf("Name[%d]=",$i);
	chop($nam[$i]=<STDIN>);
	}
	do
	{
	printf("\nEnter name to be searched=");
	chop($nam1=<STDIN>);
	$count=0;
		for($i=0;$i<$n;$i++){
			if($nam1 eq $nam[$i]){
			printf("%s found\n",$nam1);
			$count++;
			}
			}
		if($count != 0){
		printf("\n Number of times %s found = %d\n",$nam1,$count);
		}
		else{
		printf("\n %s not found in the list \n",$nam1);
		}
		printf("\nDo You want to search more names[Y|N]--> ");
		chop($choice=<STDIN>);
		}while($choice eq "Y" || $choice eq "y");
#End of program
