#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int* sort(int*,int);
void search(int*,int,int);

main()
{
      int n,a[100],i,s;
      printf("\nEnter the limit :\n");
      scanf("%d",&n);
      printf("\nEnter the array elements :\n");
      for(i=0;i<n;i++)
      scanf("%d",&a[i]);
      printf("\nEnter the search element :\n");
      scanf("%d",&s);
      search(a,n,s);
      getch();
}     
void search(int* b, int n, int s)
{
     int i;
     int* ar=sort(b,n);
     for(i=0;i<n;i++)
      printf("\n %d",*(ar+i));
     int l=0,h=n-1,m=(l+h)/2,f=0; 
     while(l<=h)
     {
      if(s>*(ar+m))
      l=m+1;
      else if(s<*(ar+m))
      h=m-1;
      else
      {
          f=1;
          break;
      }
      m=(l+h)/2;
     }
     if(f==1)
     printf("\nSearch element %d found.... at position %d....\n",s,(m+1));
     else
     printf("\nSearch element %d NOT found!!!!!!!!\n",s);
}
int* sort(int* a, int n)
{
     int i,j,t;
     for(i=0;i<n;i++)
     for(j=0;j<n-i-1;j++)
     if(*(a+j)>*(a+(j+1)))
     {
      t=*(a+j);
      *(a+j)=*(a+(j+1));
      *(a+(j+1))=t;
     }
    return a;
      
}
