#insertion sort using awk
BEGIN {
	printf "Enter the number of elements "
	getline n <"/dev/tty"
	printf "Enter the elements in the array"
	for(i=0;i<n;i++)
	{  
	   getline a[i]<"/dev/tty"
	}
	pass=0
	for(i=1;i<n;i++)
	
	{
	  ti=a[i]
	  t2=i
          }

		j=i-1
	  while(j>=0 && ti<a[j])
	  {		
		t2=j
		j=j-1
		printf "pass=%d\n", pass++
		printf "Number\n"
		for(j=0;j<n;j++)
		{
		printf "%d ",a[j]
		}
	 	 getline ch < "/dev/tty"
	  
	 	 p=a[i]
		  a[i]=a[t2]
		  a[t2]=p
          }	
	} 
	printf "sorted list is"
	for(i=0;i<n;i++)
  	{
 	  printf "%d ",a[i]
 	}	
}
		   
	

BEGIN {
printf "Enter the number of elements in the array"
getline n < "/dev/tty"
for(i=0;i<n;i++)
getline a[i] < "/dev/tty"

