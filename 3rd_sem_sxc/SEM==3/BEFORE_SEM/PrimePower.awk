BEGIN{
	printf "\n Enter a number :"
	getline a < "/dev/tty"
	
	for(i=2;i<=a;i++)
	{
		dummy=1
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
				dummy=0
				break;		
			}
		}
		if(dummy==1 && a%i == 0)
		{
			# prime number found !!
			
			d=i  # d = 2,7
			n=a  # the number inputted
			pow=0 # the power 
			while(n!=0)
			{
				if(n%d==0)
				{
					n=n/d
				}
				else
				{
					break
				}
				pow++	
			}
			
			
			printf "\nThe power of %d is %d",i,pow
		}
	}
}
