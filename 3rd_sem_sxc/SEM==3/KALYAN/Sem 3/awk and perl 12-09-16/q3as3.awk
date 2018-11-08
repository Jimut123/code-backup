	#q3as3.awk : Write a program to input roll, p1,p2,p3
	# and calulate total,average,division<F7> of 'n' students
	BEGIN{
	system("clear")
	printf "\nEnter number of students(1-20)="
	getline n < "/dev/tty"
	print "Enter roll,p1,p2,p3 of all students"
		for(i=0;i<n;i++){
		printf "roll[%d]=",i
		getline r[i] < "/dev/tty"
		printf "p1[%d]=",i
		getline p1[i] < "/dev/tty"
		printf "p2[%d]=",i
		getline p2[i] < "/dev/tty"
		printf "p3[%d]=",i
		getline p3[i] < "/dev/tty"
		}
	#To calculate total, average,Division of all students
		for(i=0;i<n;i++){
		small=p1[i]
			if(p2[i]<small){
			small=p2[i]
			}
			if(p3[i]<small){
			small=p3[i]
			}
		tot[i]=p1[i]+p2[i]+p3[i]-small
		avg[i]=tot[i]/2
		# To calculate Division

			if(avg[i]>=60){
			d[i]="1st"
			}
			else if(avg[i]>=50){
			d[i]="2nd"
			}
			else if(avg[i]>=40){
			d[i]="3rd"
			}
			else{
			d[i]="Fail"
			}
		}
	# To print results of all students
	system("clear")
	print "Roll  P1  P2  P3  Tot  AVG  Division\n"
		for(i=0;i<n;i++){
	      printf "%4d  %2d  %2d  %2d  %3d  %5.1f %s\n",r[i],p1[i],
		p2[i],p3[i],tot[i],avg[i],d[i]
		}
	
	}







		









		




