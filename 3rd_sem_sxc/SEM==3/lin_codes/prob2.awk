	#calc and print hcf and lcm of two numbers
	BEGIN{
	system("clear")
	printf "\nEnter a="
	getline a < "/dev/tty"
	printf "\nEnter b="
	getline b < "/dev/tty"
	x=a
	y=b
	r=x%y	
		while(r!=0){
		x=y
		y=r
		r=x%y
		}
	h=y
	printf "\nThe hcf of %d and %d is=%d",a,b,h
	lc=a*b/h
	printf "\nThe lcm of %d and %d is=%d",a,b,lc
	}
	#End
			
