BEGIN{
system("clear")
printf "Enter the no. of elements"
getline n < "/dev/tty"
for(i=0;i<n;i++)
{
        printf "enter %d element",i+1
        getline a[i] < "/dev/tty"
}
printf "Unsorted Array :"
for(i=0;i<n;i++)
{
        printf "%d",a[i]
        printf "\n"
}
step=0
pass=0
for(i=1;i<n;i++)
{
	step=step+1
	temp=a[i]
	for(j=i-1;j>=0 && a[j]>temp;j--)
	{
		pass=pass+1
		a[j+1]=a[j]
		printf "present conditon : \n"
        	printf "Step %d pass %d \n ",step,pass
        	for(k=0;k<n;k++)
        	{
        	printf "\n"
        	printf "%d",a[k]
        	}
        	printf "\n"
        	printf "press enter"
        	getline ch < "/dev/tty"
        	system("clear")

	}
	pass=0
	a[j+1]=temp
	printf "present conditon : \n"
        printf "Step %d complete  \n ",step
	for(l=0;l<n;l++)
	{
	printf "\n"
	printf "%d",a[l]
	}
	printf "\n"
	printf "press enter"
	getline ch < "/dev/tty"
	system("clear")

}
printf "Sorted Array :"
for(i=0;i<n;i++)
{
	printf "\n"
	printf "%d",a[i]
}

}
