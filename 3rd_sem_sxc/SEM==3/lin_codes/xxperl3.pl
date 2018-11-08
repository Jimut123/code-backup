#calculating prime using subroutine in perl--->
system("clear");
printf("\nEnter the first number ");
$n=<STDIN>;
for($i=1;$i<=$n;$i=$i+1){
$a=&is_prime($i);
#printf ("i=%d a=%d",$i,$a);
if($a==0){
printf("%d ",$i);
}
}
sub is_prime{
	local($x)=@_;
	$c=0;
	for($j=2;$j<=($x/2);$j=$j+1){
	if(($x%$j)==0){
		$c=$c+1;
		}
	}

		$c;
}
#for( $a = 10; $a < 20; $a = $a + 1 ){
 #  print "value of a: $a\n";
#}