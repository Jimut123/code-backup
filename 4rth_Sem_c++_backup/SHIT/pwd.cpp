#include"iostream.h"
#include"conio.h"
int main()
{
    char a[100];
    int i,n;
    cout<<"Enter your word length";
    cin>>n;
    cout<<"Enter Text";
    for(i=0;i<n;i++)
    {
                    a[i]=getch();
                    cout<<"*";
                    
                    }
                    a[i]='\0';
                    cout<<endl;
                    cout<<"Your string is:"<<a;
                    getch();
                    return 0;
                    }
