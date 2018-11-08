BEGIN{
system("clear")
printf "Enter number of students "
getline n < "/dev/tty"
for(i=1;i<=n;i++)
{
	printf "enter total of %d th student",i
	getline t[i] < "/dev/tty"
	r[i]=1;
}
for(i=1;i<=n;i++)
{
	for(j=1;j<=n;j++)
	{
		if(t[i]<t[j]){
		r[i]=r[i]+1
		}
	}
}
for(i=1;i<=n;i++)
{
        printf " total = %d rank = %d ",t[i],r[i]
	printf "\n"
}
}
