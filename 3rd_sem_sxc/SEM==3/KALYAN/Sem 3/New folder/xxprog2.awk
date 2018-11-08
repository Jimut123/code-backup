	BEGIN{
	system("clear")
	printf "\nEnter 1st number(1-200)="
	getline a < "/dev/tty"
	printf "Enter 2nd number(1-200)="
	getline b < "/dev/tty"
	x=a
	y=b
	# To calculate hcf of x,y
		while((r=x%y) !=0){
		x=y
		y=r
		}
	h=y
	#To calculate LCM of a,b
	lc=a*b/h
	printf "a=%d b=%d hcf=%d lcm=%d\n",a,b,h,lc
	}
	#end of program

