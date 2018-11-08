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

flag=1
for(i=0;i<n-1 && flag=1;i++)
{
	flag=0
	for(j=0;j<n-1;j++)
	{
		if(a[j]>a[j+1])
		{
		flag=1
		temp=a[j]
		a[j]=a[j+1]
		a[j+1]=temp
		}
	}
}
printf "Sorted Array :"
for(i=0;i<n;i++)
{
        printf "%d",a[i]
	printf "\n"
}
}
