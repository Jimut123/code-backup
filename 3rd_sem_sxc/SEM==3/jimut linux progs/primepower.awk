BEGIN{
system("clear")
printf "enter any +ve integer"
getline n < "/dev/tty"
cpy=n

while(cpy>1)
{
	for(i=2;i<=n;i++)
	{
		count=0
		for(j=2;j<=i/2;j++)
		{
			if(i%j==0){
			count=1
			break
			}
		}
		power=0
		if(count==0){
		while(cpy%i==0)
		{
			power++
			cpy=cpy/i
		}
		}
		if(power!=0)
		printf " \n power of %d = %d",i,power
	}
}
printf "\n"
}			
