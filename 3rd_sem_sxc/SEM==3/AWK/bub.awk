#This is a test to push it in the git hub
#AWK program to sort an array using Bubble sort
BEGIN {
	system("clear")
	printf "\nEnter the number of elements in the array"
	getline n < "/dev/tty"
	for(i=0;i<n;i++)
	{
		printf "Enter the a[%d] element : ",i
		getline a[i] <"/dev/tty"
	}
	system("clear")
	printf " Unsorted List "
	
	for(i=0;i<n;i++)
	{	
		for(j=i+1;j<n;j++)
		{ 
			if(a[i]>a[j])
			{
			  temp=a[i]
			  a[i]=a[j]
			  a[j]=temp
		  	}
		}
		 printf "The sorted list is..\n."
	#	system("clear")
	        	for(i=0;i<n;i++)
       		 	{
                		printf "%d \n",a[i]
       			 }
		getline p <"/dev/tty"
	}
	printf "The sorted list is..\n."
	for(i=0;i<n;i++)
	{
		printf "%d \n",a[i]
	}
}




