#include"iostream.h"
#include"conio.h"
#include"stdio.h"
#include"string.h"
int main()
{
    char a[100],b[100];;
    int i,n,f;
    cout<<"Enter your word length";
    cin>>n;
    cout<<"Enter Movie Name of Player 1";
    for(i=0;i<n;i++)
    {
                    a[i]=getch();
                    cout<<"*";
                    
                    }
                    a[i]='\0';
                    f=0;
                    cout<<endl;
                    cout<<"Player 2 start your time now...You have 5 chances to guess the movie of Player 1...."<<endl;
                    for(i=1;i<=5;i++)
                    {
                                     fflush(stdin);
                                     cout<<"Enter Movie:"<<endl;
                                     gets(b);
                                     if(stricmp(a,b)==0)
                                     {
                                                        f=1;
                                                        break;
                                                        }
                                                        else
                                                        cout<<"Wrong choice....try agian..you have" <<(5-i)<<"chance more..."<<endl;
                                                        }
                                                        
                                                        if(f==1)
                                                        cout<<"Player 2 winner......."<<a<<endl;
                                                        else
                                                        cout<<"Player 1 winner...."<<a<<endl;
                                     
                    
                    getch();
                    return 0;
                    }
