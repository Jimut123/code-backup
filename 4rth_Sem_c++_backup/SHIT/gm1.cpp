#include"stdio.h"
#include"conio.h"
#include"math.h"
int main()
{
    int k,i,l,f;
    f=0;
    l=rand(100);
    
     for(i=0;i<=5;i++)
     {
        
        printf("\n Enter no:");
        scanf("%d",&k);
        if(l==k)
        {
                f=1;
                break;
                }
                if(k<(l-10))
                 printf("\n number is too low..."); 
                else
                 if(k<(l+10))
                 printf("\n number is too high...");  
                 }
                 if(f==0)
                 printf("\n Yes you Win.....");
                 else
                  printf("\n Sorry....the number is%d",l);
                  return 0;
                  }
                       
