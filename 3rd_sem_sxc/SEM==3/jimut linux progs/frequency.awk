#awk program to calculate the frequency of array(1-d) elements.
BEGIN{
system("clear")
printf "\n enter the size of the array:"
getline n<"/dev/tty"
i=1
printf "\n enter the array element one by one"
for(i=1;i<=n;i++){
printf "a[%d]:",i
getline a[i]<"/dev/tty"
}
for(i=1;i<=n;i++){
	j=1
	f=0
	if(dup==a[i]){
			break
		}
		
	for(j=1;j<=n;j++){
		if(a[i]==a[j]){
				f=f+1
				if(f>1){	
				d=j
				}
			}
		dup=a[d]
		}
		printf "\n  number: %d , frequency: %d",a[i],f
	}
}
#end of program 
