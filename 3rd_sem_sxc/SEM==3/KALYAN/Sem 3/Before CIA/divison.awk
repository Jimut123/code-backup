BEGIN{
system("clear")
printf"\nENter no. of students:"
getline n< "/dev/tty"
for(i=1;i<=n;i++)
{
	printf"\nr="
getline r< "/dev/tty"
printf "\n p1="
getline p1< "/dev/tty"
printf "\n p2="
getline p2< "/dev/tty"
printf "\n p3="
getline p3< "/dev/tty"
min=p1
if(p2<min)
{
min=p2
}
if(p3<min){
min=p3}
total=p1+p2+p3-min
avg=total/2
if(avg>=60)
div="1"
if(avg>=50&&avg<60)
div="2"
if(avg>=40&&avg<50)
div="3"
if(avg<40)
div="F"
printf("\n Roll=%d p1=%d p2=%d p3=%d total=%d average=%d division=%s",r,p1,p2,p3,total,avg,div)
}
}
