#Insertion sort--->
BEGIN{
system("clear")
printf "\nEnter n--->\n"
getline n < "/dev/tty"
printf "\nEnter %d values-->",n
for(i=0;i<n;i++){
printf "a[%d]=",i
getline a[i] < "/dev/tty"
id[i]=i+1
}
system("clear")

printf "Unsorted List"
printf "Number\tIndex\n"
	for(i=0;i<n;i++){
	printf "%d\t%d\n",a[i],id[i]
	}
#Start--->
pass=0

	for(i=1;i<n;i++){
	t1=a[i]
	t2=id[i]
	j=i-1
	pass=pass+1
	
		while(j>=0 && t1<a[j]){
			a[j+1]=a[j]
			id[j+1]=id[j]
			j=j-1
			printf "pas=%d\n",pass
			printf "Number \tindex\n"
				for(j=0;j<n;j++){
				printf "%d\t%d\n",a[j],id[j]
				}
			printf "Press enter key to continue"
			getline ch < "/dev/tty"
			system("clear")
		}
		a[j+1]=t1
		id[j+1]=t2
		
		printf "Pass=%d\n",pass
		printf "Number\tIndex\n"
		for(k=0;k<n;k++){
			printf "%d\t%d\n",a[k],id[k]
			}
	printf "Press Enter key to continue->"
	getline ch <"/dev/tty"
	system("clear")
		}
		
printf "Sorted List"
printf "Number\tIndex\n"
        for(i=0;i<n;i++){
        printf "%d\t%d\n",a[i],id[i]
        }

}



