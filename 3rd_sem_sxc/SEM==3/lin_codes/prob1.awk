	#write a program in awk to input 'n' and clac
	#s=1+2+3..n and Print s
	BEGIN{
	system("clear")
	printf "\nEnter n(1-20)="
	getline n < "/dev/tty"
	s=0
		for(i=1;i<=n;i++){
		s+=i
		}
	printf "n=%d Sum=%d\n",n,s
	}
	#End of program

