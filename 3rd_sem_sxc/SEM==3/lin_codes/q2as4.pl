#print all fibonacci numbers <=n
system("clear");
printf("\nEnetr any +ve integer(2-2000)=");
$n=<STDIN>;
$f1=1;
$f2=1;
printf("\nFibonacci series<=%d---->\n%d\n%d\n",$n,$f1,$f2);
	while(($f3=$f1+$f2) <= $n){
	printf("%d\n",$f3);
	$f1=$f2;
	$f2=$f3;
	}
#end of program
