system("clear");
printf("\n Enter first number :");
$a=<STDIN>;
printf("\n a = %d and another type = $a ",$a);

func1($a);
sub func1{

	local($x)=@_;
	printf("\nHorray!!!\n The value of a = %d ",$a);
		
}
