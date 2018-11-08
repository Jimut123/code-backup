	#q5perl.pl : Write a program to input 2 positive integers
	#a,b. calculate and print (i) hcf , (ii) lcm of two numbers
	# Use 2 subroutines hcf() and lcm().
	system("clear");
	print("\nEnter 1st number=");	
	$a=<STDIN>;
	print("Enter 2nd number=");
	$b=<STDIN>;
	$h=&hcf($a,$b);
	$lc=&lcm($a,$b);
	printf("\nHCF of %d, %d =%d\n",$a,$b,$h);
	printf("LCM of %d, %d =%d\n",$a,$b,$lc);
	#end of main program
	#subroutine hcf() starts
	sub hcf{
	local($a,$b)=@_;
	$x=$a;
	$y=$b;
		while(($r=$x % $y) !=0){
		$x=$y;
		$y=$r;
		}
	$y;
	}
	#end of hcf() subroutine
	#subroutine lcm() starts
	sub lcm{
	local($a,$b)=@_;
	$h=&hcf($a,$b);
	$lc=$a*$b/$h;
	$lc;
	}
	#end of subrountine hcf()


	
	
