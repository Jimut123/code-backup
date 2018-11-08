# WAP in perl to input list of names and search the list using linear search technique and display whether the name is found or not found

system("clear");
printf("\n Enter size of your list (1-20) =");
$n=<STDIN>;
printf("\n Enter %d names one by one -->\n",$n);

	for($i=0;$i<$n;$i++)
	{
		printf("Name[%d]=",$i);
		chop($nam[$i]=<STDIN>); 
		# To remove the \n from the line
	}
	do
	{
		printf("\n Enter name to be searched :");
		chop($nam1=<STDIN>);
		# To remove the \n from the "input string"
		$count=0;
			for($i=0;$i<$n;$i++)
			{
				if($nam1 eq $nam[$i])

				{
					printf("%s found\n",$nam1);
					$count++;
				}
			}
		if($count != 0)
		{
			
			printf("\n Number of times %s found = %d \n",$nam1,$count);
		}
		else 
		{
			printf("\n %s not found in the list \n",$nam1);
		}
		
	printf("\n Do you want to search any more name[Y/N]:");

	chop($choice =<STDIN>);
	}
	while($choice eq "y" || $choice eq "Y");

#end of prog





