#to calculate the rank of a matrix----->
#rank of 'n' students
BEGIN{
system("clear")
printf "\nEnter number of students="
getline n < "/dev/tty"
printf "Enetr marks of %d students--->\n",n
	for(i=0;i<n;i++){
	printf "total [%d]=",i
	getline t[i] < "/dev/tty" 
	}
# To calculate Rank of all students
	for(i=0;i<n;i++){
	rank[i]=1
		for(j=0;j<n;j++){
			if(t[i]<t[j]){
			rank[i]=rank[i]+1
			}
		}
	}
printf "\nTotal\tRank\n"
	for(i=0;i<n;i++){
	printf "%d\t%d\n",t[i],rank[i]
	}
}
