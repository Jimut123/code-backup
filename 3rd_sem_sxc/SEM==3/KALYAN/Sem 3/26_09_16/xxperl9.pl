	#xxperl9.pl : Write a program to implement Binary
	#seacrh method to search a number in a list.
	#Use suboutine binary_search().
	#main module starts
	system("clear");
	do
	{
	printf("\nEnter size of your list(1-20)=");
	$n=<STDIN>;
	printf("\nEnter %d elements one by one--->\n",$n);
		for($i=0;$i<$n;$i++){
		printf("a[%d]=",$i);
		$a[$i]=<STDIN>;
		}
	@b=&bubble(@a,$n);
	printf("\nUnsorted List\n");
	&display(@a,$n);  # To display unsorted list
	printf("\nSorted List\n");
	&display(@b,$n);  # To display sorted list
	&binary_search(@b,$n); # Calling Binary search routine
	printf("\nDo you want to continue(Y/N?) :");
	chop($choice=<STDIN>);
	}while($choice eq "y" || $choice eq "Y");	
	#end of main program
	sub bubble{
	local(@x)=@_;
	$m=@x; # $m=length of @x
	$m1=$x[$m-1]; # $m1=size of list $x[]
	# Bubble sort routine starts
	$flag=0;
	$pass=0;
	$m2=$m1;
		while($flag==0){
		$flag=1;
		$pass=$pass+1;
		$m2=$m2-1;
			for($i=0;$i<$m2;$i++){
				if($x[$i] > $x[$i+1]){
				$t=$x[$i];
				$x[$i]=$x[$i+1];
				$x[$i+1]=$t;
				$flag=0;
				}
			system("clear");
			printf("Pass=%d Step=%d\n",$pass,($i+1));
			&display(@x,$m1);
			}
		}
	@x;
	}
	#Subroutine display() starts
	sub display{
	local(@y)=@_;
	$k=@y;  # $k=size of @y
	$k1=$y[$k-1]; # $k1=size of list $y[]
	printf("\nNumber\n");
		for($j=0;$j<$k1;$j++){
		printf("%d\n",$y[$j]);
		}
	printf("\nPress enter key to continue--->");
	$choice=<STDIN>;
	}
	#Subroutine binary_search(0 starts
	sub binary_search{
	local(@c)=@_;
	$k=@c;
	$k1=$c[$k-1]; # $k1=number of elements in the list
		do
		{
		printf("\nEnter Number to be searched=");
		$num=<STDIN>;
		$flag=0;
		$low=0;
		$high=$k1-1;
			while($low <= $high){
			$mid=int(($low + $high)/2);
		printf("low=%d high=%d mid=%d\n",$low,$high,$mid);
				if($num < $c[$mid]){
				$high=$mid-1;
				}
				elsif($num > $c[$mid]){
				$low=$mid+1;
				}
				else
				{
				$flag=1;
				printf("%d found in the list\n",$num);
				last if $flag==1;
				}
			}
			if($flag==0){
			printf("%d not found!\n",$num);
			}
	printf("\nDo you want to search any more number(Y/N?):");
	 chop($choice=<STDIN>);
		}while($choice eq "y" || $choice eq "Y");
	}








			



			

































	
