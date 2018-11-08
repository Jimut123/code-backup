#include<stdio.h>
#include<conio.h>
void quicksort(int [10],int,int);

int main()

{
    int x[20],size,i;

    printf("\n enter size of array");
    scanf("%d",&size);

    printf("\n enter %d elements",size);
    for(i=0;i<size;i++)
    scanf("%d",&x[i]);

    quicksort(x,0,size-1);

    printf("\n sorted elements");

    for(i=0;i<size;i++)
    printf("%d",x[i]);
    getch();
    return 0;
}

void quicksort(int x[10],int first,int last)
{
     int pivot,i,j,temp;

     if(first<last)
     {
         pivot=first;
         i=first;
         j=last;

         while(i<j)
         {
              while(x[i]<=x[pivot] && i<last)
              i++;
              while(x[j]>x[pivot])
              j--;
              if(i<j)
              {
                 temp=x[i];
                 x[i]=x[j];
                 x[j]=temp;
                 }
                 }
                 temp=x[pivot];
                 x[pivot]=x[j];
                 x[j]=temp;
                 quicksort(x,first,j-1);
                 quicksort(x,j+1,last);
                 }
                 }

