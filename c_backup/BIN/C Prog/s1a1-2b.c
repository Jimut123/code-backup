 #include<stdio.h>
int main()
{
  int pow,num,i=1;
  long int sum=1;
  printf("\nEnter a number: ");
  scanf("%d",&num);
  printf("\nEnter power: ");
  scanf("%d",&pow);
  while(i<=pow)
  {
            sum=sum*num;
            i++;
  }
  printf("\n%d to the power %d is: %ld",num,pow,sum);
  return 0;
}
