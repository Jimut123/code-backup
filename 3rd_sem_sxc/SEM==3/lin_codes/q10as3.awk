#q10 Write a program to display powers of prime number
#in any number in any given integer
BEGIN{
system("clear")
printf "\nEnter any positive integer="
getline n < "/dev/tty"
for(i=2;i<=n;i++){
i1=i/2
flag=1
	for(j=2;j<=i1;j++){
	if((i%j)==0){
	flag=0
	break
	}
	}
	if(flag==1){
	ii=i
	count=0
		while(1==1){
		if((n%ii)==0){
		count++
		}
		else{
		break
		}
		ii=ii*i
		}
		if(count !=0){
	
	printf "Power of %d=%d\n",i,count
}
}
}
}
