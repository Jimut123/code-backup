#include"iostream.h"
#include"conio.h"
int main()
{
    int a;
    cout<<"welcome to kolkata metro! Have a nice and safe journey                                ";
    cout<<"please enter the number of the station you want to go from this list : 1DumDum,2Shyambazar,3Sutanati,4Central,5Park_street,6Rabindrasarobar,7tollygaunge";
    cin>>a;
    if(a==1)
    cout<<"you are already in DumDum                ";
    else 
    if(a==2)
    cout<<" You are in Shyambazar cost is Rs.5              ";
    else 
    if(a==3)
    cout<<"You are in Sutanati cost is Rs.7              ";
    else 
    if(a==4)
    cout<<"you are in Central cost is Rs.10               ";
    else if(a==5)
    cout<<"you are in Park_streetcost is Rs.13               ";
    else if(a==6)
    cout<<"you are in rabindra sorobar cost is Rs.15               ";
    else if(a==7)
    cout<<"you are in Tollygyunge cost is Rs.20               ";
    cout<<"For any confusion , visit the front office";
    getch();
    return 0;
}
