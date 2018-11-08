#bubble sort--->
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
flag=0
pass=0
m=n
	while(flag==0){
	flag=1
	pass=pass+1
	m=m-1
		for(i=0;i<m;i++){
			if(a[i]>a[i+1]){
			t=a[i]
			a[i]=a[i+1]
			a[i+1]=t
			t=id[i]
			id[i]=id[i+1]
			id[i+1]=t
			flag=0
			}
	printf "Pass=%d Step=%d flag=%d\n",pass,(i+1),flag
			for(j=0;j<n;j++){
			printf "%d\t%d\n",a[j],id[j]
			}
		printf "\nPress enter---->"
		getline ch < "/dev/tty"
		system("clear")
	}
	}
printf "Sorted List"
printf "Number\tIndex\n"
        for(i=0;i<n;i++){
        printf "%d\t%d\n",a[i],id[i]
        }
}





