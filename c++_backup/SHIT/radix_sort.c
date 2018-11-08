    /* radix sort using single dimensional array  and using 2-d array as card sorter of decimal number*/
#include"stdio.h"
#include"conio.h"
main()
{
  int a[100],b[100][10],i,j,k,n,l,p,t,s,u,r,temp,dig,m,q,x;
  int c[100];
  printf("\n  Give no term:");
  scanf("%d",&n);
  for(i=0;i<n;i++)
   {
     printf("\n Give value in a[%d]:",i);
     scanf("%d",&a[i]);
   }
   printf("\n The values are:");
   for(i=0;i<n;i++)
     printf("\n%d",a[i]);

   l=0;
   /* find largest from array */
   for(i=0;i<n;i++)
     if(a[i]>l)
       l=a[i];
    printf("\n The largest value is:%d",l);

   s=0;
   p=l;
   while(p!=0)
    {
      t=p%10;
      s=s+1;
      p=p/10;
    }
  printf("\n The largest value is %d,Number of digit is %d",l,s);

 /* find the total number of element */
 u=0;
 for(i=0;i<n;i++)
	u++;
 printf("\n The total number of element is %d",u);
 /* initialise the value to b matrix */
  for(i=0;i<u;i++)
   for(j=0;j<10;j++)
    {
      b[i][j]=0;
      b[j][i]=0;
    }

 for(i=0;i<n;i++)
   c[i]=a[i];
 x=1;
 /* sorting starts */
  for(r=1;r<=s;r++)
    {
     j=0;

    for(i=0;i<n;i++)
     {

     temp=c[i];
     /*printf("\c%d",c[i]);*/
     /*getch();*/
     k=1;
     while(k<=r)
     {
       dig=temp%10;
       temp=temp/10;
     k++;
     }
    /*printf("\ndig%d",dig);*/
    /*getch();*/
   /* printf("\n jjj %d",j);*/
    b[j][dig]=0;
    b[j][dig]=c[i];
       j++;
    }
   printf("\n\n");
   for(m=0;m<u;m++)
   {
     for(t=0;t<10;t++)
       printf(" %4d",b[m][t]);
    printf("\n");
  }
  printf("\n Pass no %d on digit no %d ",x,dig);
  x++;
  getch();
      q=0;
      for(t=0;t<10;t++)
       for(m=0;m<u;m++)
	if(b[m][t]!=0)
	{
	 /*printf("\n mm %d",b[m][t]);*/
	 /*getch();*/
	 c[q]=0;
	  c[q]=b[m][t];
	  q=q+1;
	}




   for(q=0;q<u;q++)
     for(t=0;t<10;t++)
      {
	b[q][t]=0;
	b[t][q]=0;
      }
 }

 for(i=0;i< n;i++)
  printf("\n %d",c[i]);
  getch();
}
