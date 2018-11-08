BEGIN{
	system("clear")
	printf "\nEnter number of students : "
	getline n <"/dev/tty"
	printf "Enter marks of %d students ---->\n",n
		for(i=0;i<n;i++){
		printf "total  [ %d ] = ",i
		getline t[i] < "/dev/tty"
		}

	# To calculate Rank of all students
	 	for(i=0;i<n;i++){
		rank[i]=1;
			for(j=0;j<n;j++){
				if(t[i]<t[j]){
				rank[i]=rank[i]+1
				}
		}
	}
	printf "\n Total \t Rank \n"
	for(i=0;i<n;i++){
	printf "%d\t%d\n", t[i],rank[i]
	}
}
