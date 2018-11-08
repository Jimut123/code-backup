	#q4as3.awk : Write a program to calculate (i) sum of 'n' elements
	#(ii)average of 'n' elements and (iii) standard deviation of 'n'
	#elements
	BEGIN{
	system("clear")
	printf "\nEnter size of your list(1-20)="
	getline n < "/dev/tty"
	printf "\nEnter %d elements one by one--->", n
		for(i=0;i<n;i++){
		printf "a[%d]=",i
		getline a[i] < "/dev/tty"
		}
	# To calculate sum, average
	sum=0
		for(i=0;i<n;i++){
		sum +=a[i]
		}
	avg=sum/n
	#To calculate standard deviation
	sd=0
		for(i=0;i<n;i++){
		sd=sd+(a[i]-avg)*(a[i]-avg)
		}
	sd=sqrt(sd/n)
	printf "Sum=%d  Average=%5.2f Standard Deviation=%7.4f\n",sum,avg,sd
	}
	#end of program

