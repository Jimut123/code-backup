	#q6as3.awk : Write a program to search a number
	#in a list using Binary search algorithm
	BEGIN{
	system("clear")
	printf "\nEnter size of your list(1-20)="
	getline n < "/dev/tty"
	printf "\nEnter %d numbers one by one--->\n",n
		for(i=0;i<n;i++){
		printf "a[%d]=",i
		getline a[i] < "/dev/tty"
		id[i]=i+1
		}
	# Bubble Sort algorithm starts
	flag=0
	pass=0
	m=n
		while(flag==0){
		flag=1
		pass=pass+1
		m=m-1
			for(i=0;i<m;i++){
				if(a[i] > a[i+1]){
				t=a[i];
				a[i]=a[i+1]
				a[i+1]=t
				t=id[i]
				id[i]=id[i+1]
				id[i+1]=t
				flag=0
				}
			system("clear")
			printf "Pass=%d Step=%d\n",pass,(i+1)
			#To display partial sorted list
			print "Number\tIndex\n"
				for(j=0;j<n;j++){
				printf "%6d\t%6d\n",a[j],id[j]				}
			printf "\nPress enter key to continue--->"
			getline choice < "/dev/tty"
			}
		}
	system("clear")
	print "Elements in Sorted List"
	print "Number\tIndex\n"
	
		for(j=0;j<n;j++){
		printf "%6d\t%6d\n",a[j],id[j]
		}
		printf "\nPress enter key to continue--->"
		getline choice < "/dev/tty"
		do
		{
		printf "\nEnter number you want to search="
		getline num < "/dev/tty"
		#Binary search routine starts
		low=0
		high=n-1
			while(low<=high){
			mid=int((low+high)/2)
			flag=0 # flag=0 means num not found
				if(num < a[mid]){
				high=mid-1	
				}
				else if(num>a[mid]){
				low=mid+1
				}
				else{
				flag=1
		   printf "\n%d found at position=%d",num,id[mid]
				break
				}
			}
		 if(flag==0){
		printf "%d not found\n",num
		}
		printf "\nTo search another number type '1' -->"
		getline choice < "/dev/tty"
		}while(choice==1)
	}






      
			
				






























