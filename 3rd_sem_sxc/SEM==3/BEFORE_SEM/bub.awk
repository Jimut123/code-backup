BEGIN{
	system("clear");
	printf "Enter the size of the array: "
	getline n < "/dev/tty"
	#printf "The size of the array : "	
	for(i=0;i<n;i++)
	{
		printf "\nEnter the %d element of the array :",i
		getline a[i] < "/dev/tty"
	}
	printf "\n"
	printf "\nThe input array :\n"
	for(i=0;i<n;i++)
        {
        	printf "%d\t",a[i]
                
        }

	flag=1
	#The bubble sorting algorithm using flag variable
 	for(i=0;i<n-i&&flag=1;i++)
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
	
	printf "\n\n"
	#Displaying the sorted array
	for(i=0;i<n;i++)
        {
                printf "%d\t",a[i]

        }

	
}
