#!/usr/bin/perl

system("clear");
printf("\nEnter the elements of the matrix :\n");
$n=<STDIN>;

for($i=0;$i<$n;$i++)
{
	for($j=0;$j<$n;$j++)
	{
		printf("\n Enter the element of %d row and %d column ",$i,$j);
		$a[$i][$j]=<STDIN>;
	}
}
printMatrix();
#Printing the matrix
sub printMatrix()
{
	#local($x)=@_;
	for($i=0;$i<$n;$i++)
	{
        	for($j=0;$j<$n;$j++)
        	{
                	printf("%d",$a[$i][$j]);
        	}
		printf("\n");
	}
}

