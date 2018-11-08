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

	#To calculate the frequency of the elements present in the array
	
	#To do this first find out the maximum and minimum elements
	
	max=a[0]
	min=a[0]
	
	for(i=0;i<n;i++)
	{
		if(max<a[i])
		max=a[i]
		
		if(min>a[i])
		min=a[i]
	}
	#Displaying the maximum and minimum elements
	
	printf "\nMaximum = %d and minimum = %d\n",max,min


	
	for(i=min;i<=max;i++)
	{
		count=0
		for(j=0;j<n;j++)
		{
			if(a[j]==i)
			count++			
		}
		if(count > 0)
		printf "\nThe frequency of %d is %d",i,count
	}
}













