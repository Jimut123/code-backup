#include<stdio.h>
#include<conio.h>
main()
{
      double n,i;
      int f=0;
      printf("\nEnter the number :\n");
      scanf("%lf",&n);
      for(i=1;i<n/2;i++)
      if((i*i)==n)
      {
       f=1;
       break;
      }
      if(f==1)
      {
       printf("\nSquare root : %lf",i);
       getch();
       return 0;
      }
      for(i=1;i<=n;i=i+0.00001)
      if((i*i)>=(n-0.00002))
      break;
      printf("\nSquare root : %lf",i);
      getch();
}
      
