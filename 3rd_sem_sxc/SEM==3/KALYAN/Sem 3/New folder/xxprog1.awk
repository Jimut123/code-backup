	#xxprog1.awk : Write a program in awk to input 2 numbers and then
	# then calculate (i) sum , (ii) average of 2 numbers
	BEGIN{
	system("clear")
	printf "\nEnter 1st number="
	getline a < "/dev/tty"
	printf "Enter 2nd number="
	getline b < "/dev/tty"
	sum=a+b
	avg=sum/2
	printf "sum=%d average=%5.2f\n",sum,avg
	}

