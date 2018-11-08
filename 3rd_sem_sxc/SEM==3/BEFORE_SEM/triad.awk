BEGIN{
	# To make the array of triads.. it will have to start from 123
	
	n1=219 # First digit of the triad list
	
	n2=n1*2
	n3=n1*3
	printf "n2 = %d n3 = %d",n2,n3
	c1=0
	while(n1>0)
	{
		d=n1%10
		printf "\n d = %d and c = %d",d,c1
		a[c1++]=d
		n1=n1/10	
		if(c1==3)
		{
			break
		}
	}
	while(n2>0)
        {
                d=n2%10
		printf "\n d = %d and c = %d",d,c1
                a[c1++]=d
                n2=n2/10
		if(c1==6)
                {
                        break
                }

        }
	while(n3>0)
        {
                d=n3%10
		printf "\n d = %d and c = %d",d,c1
                a[c1++]=d
                n3=n3/10
		if(c1==9)
                {
                        break
                }

        }
	printf "\n\n"
	##Printing the array for verifying the numbers
	
	for(i=0;i<=8;i++)
	{
		printf "%d",a[i]
	}
	
	
	##Sorting the array

	flag=1
	#The bubble sorting algorithm using flag variable
 	for(i=0;i<8&&flag=1;i++)
	{
		flag=0
		for(j=0;j<8;j++)
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
	
	##Display the sorted array
	printf "\n"
	for(i=0;i<=8;i++)
        {
		
                printf "%d",a[i]
        }
	counter=0
	for(i=0;i<=8;i++)
        {
		printf "counter = %d (i+1) = %d a[i] = %d\n",counter,(i+1),a[i]
		
		counter++
		if(counter != a[i])
		{
			printf "Not a triad!!"
		}
        }

}
