BEGIN{

	system("clear")
	printf "\nEnter the size of the array to be inserted :\n"
	getline n < "/dev/tty"
	#To take the elements in the array
	
	printf "\n Enter the elements of the array one by one :"
	for(i=0;i<n;i++)
	{
		printf "\n Enter the %d element :",(i+1)
		getline a[i] < "/dev/tty"
	
	}
	c=0 #counter variable	
	for(i=c;i<n-1;i++)
	{
		#The value showing the i
		printf "\nThe first iteration i = %d",i
		min=a[i]
		pos=i
		printf "\n min = %d\n",min
		printf "\nThe j loop: \n "
		for(j=i+1;j<n;j++)
		{
			printf "%d\t",a[j]
			if(min>a[j])
			{
				min=a[j]
				pos=j
			}
		}

		printf "\n"
		printf "min = %d",min
		temp=a[i]
		a[i]=a[pos]
		a[pos]=temp
		
		printf "\nThe new array\n"
		for(k=0;k<n;k++)
		printf "%d\t",a[k]
		printf "\n"
		c++
	}
	
	#Displaying the resultant array
	printf "\n The resultant elements of the array :\n"
        for(i=0;i<n;i++)
        {
                printf "%d\t",a[i]

        }

}
