#include<stdio.h>
#include<conio.h>
void armstrong();
void smith();
void keith();
int checkKeith(int);
int sum(int);

main()
{
      int ch;
      do
      {
          printf("\n\nPress 1 to print armstrong numbers \nPress 2 to print smith numbers \nPress 3 to print keith numbers \nPress 4 to exit\n");
          scanf("%d",&ch);
          switch(ch)
          {
                    case 1: armstrong();
                            break;
                    case 2: smith();
                            break;
                    case 3: keith();
                            break;
                    case 4: return 0;
                    default: printf("\nEnter option numbers only!!!!!!!\n");
          }
      }while(1);
      getch();
}
void armstrong()
{
     int a,b,i,s,k,n;
     printf("\nEnter the starting limit :\n");
     scanf("%d",&a);
     printf("\nEnter the ending limit :\n");
     scanf("%d",&b);
     printf("\nList of armstrong number(s) from %d to %d are :\n",a,b);
     for(i=a;i<=b;i++)
     {
      n=i;
      s=0;
      while(n>0)
      {
       k=n%10;
       s=s+(k*k*k);
       n=n/10;
      }
      if(s==i)
      printf("%d,\n",i);
     }
}
void smith()
{
     int a,b,i,s,n,j;
     printf("\nEnter the starting limit :\n");
     scanf("%d",&a);
     printf("\nEnter the ending limit :\n");
     scanf("%d",&b);
     printf("\nList of smith number(s) from %d to %d are :\n",a,b);
     for(i=a;i<=b;i++)
     {
      s=0;
      n=i;
      while(i>1)
      {
       for(j=2;j<=i;j++)
       if(i%j==0)
       {
        s=s+sum(j);
        i=(i/j);
       }
      }
      if(sum(n)==s)
      printf("%d,\n",n);
     }
}
int sum(int x)
{
    int s,k;
    s=0;
    while(x>0)
    {
     k=(x%10);
     s=s+k;
     x=(x/10);
    }
    return s;
}
void keith()
{
     int a,b,i;
     printf("\nEnter the starting limit :\n");
     scanf("%d",&a);
     printf("\nEnter the ending limit :\n");
     scanf("%d",&b);
     printf("\nList of keith number(s) from %d to %d are :\n",a,b);
     for(i=a;i<=b;i++)
     if(checkKeith(i)==1) 
     printf("%d,\n",i);
}
int checkKeith(int n)
{
    int p,m,c=0;
    p=m=n;
    while(m>0)
    {
     c++;
     m=m/10;
    }
    int a[c];
    for(int i=c-1;i>=0;i--)
    {
     a[i]=p%10;
     p/=10;
    }
    int sum=0;
    while(a[c-1]<=n)
    {
     for(int i=0;i<c;i++)
     sum+=a[i];
     if(sum==n) 
     return 1;
     for(int i=0;i<c-1;i++)
     a[i]=a[i+1];
     a[c-1]=sum;
     sum=0;
    }
    return 0;
}
