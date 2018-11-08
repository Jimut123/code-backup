BEGIN{
	system("clear");
	printf "\nEnter the number of students :"
	getline n <"/dev/tty"
	
	for(i=0;i<n;i++)
	{
		printf "\n Enter the %d th element :",i+1
		getline a[i] < "/dev/tty"
		
	}
	#rank calculation for the given array of elements
	
	flag=1
	for(i=0;i<n-1 && flag=1;i++)
	{
		flag=0
		for(j=0;j<n-1;j++)
		{
			if(a[j]<a[j+1])
			{
			flag=1
			temp=a[j]
			a[j]=a[j+1]
			a[j+1]=temp
			}
		}
	}
	
	rank=1
	printf "\nThe sorted array :"
	for(i=0;i<n;i++)
        {
		printf "%d\t",a[i]
	}
	printf "\n\n"
	for(i=0;i<n;i++)
        {
		
               	#printf "%d",a[i]
        	
		printf "marks = %d rank = %d\n",a[i],rank
		
		if(a[i]!=a[i+1]) 
		rank++
		

        }

}	


