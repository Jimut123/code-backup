#include "iostream.h"
#include "conio.h"
int main()
{
    int temp[5],days;
    int i,max,min,avg;
    cout<<"How many days ina month?";
    cin>>days;
    for(i=0;i<days;i++)
    {
                       cout<<" Enter temp"<<i+1<<":";
                       cin>>temp[i];
                       }
                       avg=0;
                       for(i=0;i<days;i++)
                       avg=avg+temp[i];
                       cout<<"Average temp:"<<(avg/days)<<"\n";
                       min=temp[0];
                       max=temp[0];
                       for(i=0;i<days;i++)
                       {
                                          if(min>temp[i])
                                          min=temp[i];
                                          if(max<temp[i])
                                          max=temp[i];
                                          }
                                          cout<<"Max temp is:"<<max<<endl;
                                          cout<<"Min tenp is:"<<min<<endl;
                                          getch();
                                          return 0;
                                          }
                                          
                                          
