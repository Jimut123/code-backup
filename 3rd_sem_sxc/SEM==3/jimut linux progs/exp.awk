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
printf "\n print the array"
for(i=1;i<=n;i++){
printf "\n a[%d]=%d",i,a[i]
}
}
		
