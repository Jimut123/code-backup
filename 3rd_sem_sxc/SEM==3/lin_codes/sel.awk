BEGIN{
system("clear")
printf "Enter The length of array\n"
getline n < "/dev/tty"
for(i=1;i<=n;i++){
printf "\na[%d]=",i
getline a[i] < "/dev/tty"
}

printf "\nThe array that you have entered is--->\n"
for(i=1;i<=n;i++){
printf "\na[%d]=%d",i,a[i]
}

#Algorithm for selection sort starts---->

for(i=1;i<=n;i++)
{
for(j=i+1;j<=n;j++)
{
if(a[i]>a[j])
{
t=a[i]
a[i]=a[j]
a[j]=t
}
}
}
printf "\nThe sorted array is--->\n"
for(i=1;i<=n;i++){
printf "\na[%d]=%d",i,a[i]
}

}#End of program
