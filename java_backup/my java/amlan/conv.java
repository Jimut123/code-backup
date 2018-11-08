import java.io.*;
class conv
{
	long  n,i,j,k,n1,s,t,f;
	char a[]=new char[100];
	char b[]=new char[100];
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	void input()throws IOException
{
System.out.println("Give no:");
n=Integer.parseInt(br.readLine());
//cout<<n<<endl;
n1=n;
k=0;
s=0;
n1=n;
while(n1>0)
{
s++;
n1=n1/10;
}
if(s>9)
{
System.out.println("Error..Please enter a number within 9 digits");
exit(0);
}
n1=n;
//n1=s;
while(n1>0)
{
if(n1%10==0)
a[k++]='0';
else
 if(n1%10==1)
a[k++]='1';
else
if(n1%10==2)
a[k++]='2';
else
if(n1%10==3)
a[k++]='3';
else
if(n1%10==4)
a[k++]='4';
else
if(n1%10==5)
a[k++]='5';
else
if(n1%10==6)
a[k++]='6';
else
if(n1%10==7)
a[k++]='7';
else
if(n1%10==8)
a[k++]='8';
else
if(n1%10==9)
a[k++]='9';
n1=n1/10;
}
if(n==0)
{
System.out.println("ZERO"+" ");
}

//for(i=0;i<k;i++)
//cout<<a[i];
}
}
//convert number into word (Maximum 9 digit number)

void conv()
{
f=0;
t=k-1;
while(t>=0)
{
if(t==8)
{
int m=0;
while(t>6)
{
b[m++]=a[t];
t--;
}
b[m]='\0';
if(stricmp(b,"000")==0||stricmp(b,"00")==0||stricmp(b,"0")==0)
f=1;
else
f=0;
if(f==0)
{
conv1(b);
cout<<"CRORE"<<" ";
}
}
else
if(t==7)
{
int m=0;
while(t>6)
{
b[m++]=a[t];
t--;
}
b[m]='\0';
if(stricmp(b,"000")==0||stricmp(b,"00")==0||stricmp(b,"0")==0)
f=1;
else
f=0;
if(f==0)
{
conv1(b);
cout<<"CRORE"<<" ";
}
}
else
if(t==6)
{
int m=0;
while(t>4)
{
b[m++]=a[t];
t--;
}
b[m]='\0';
if(stricmp(b,"000")==0||stricmp(b,"00")==0||stricmp(b,"0")==0)
f=1;
else
f=0;
if(f==0)
{
conv1(b);
cout<<"LAKH"<<" ";
}
}
else
if(t==5)
{
int m=0;
while(t>4)
{
b[m++]=a[t];
t--;
}
b[m]='\0';
if(stricmp(b,"000")==0||stricmp(b,"00")==0||stricmp(b,"0")==0)
f=1;
else
f=0;
if(f==0)
{
conv1(b);
cout<<"LAKH"<<" ";
}
}
else
if(t==4)
{
int m=0;
while(t>2)
{
b[m++]=a[t];
t--;
}
b[m]='\0';
if(stricmp(b,"000")==0||stricmp(b,"00")==0||stricmp(b,"0")==0)
f=1;
else
f=0;
if(f==0)
{
conv1(b);
cout<<"THOUSAND"<<" ";
}
}
else
 if(t==3)
{
int m=0;
while(t>2)
{
b[m++]=a[t];
t--;
}
b[m]='\0';
if(stricmp(b,"000")==0||stricmp(b,"00")==0||stricmp(b,"0")==0)
f=1;
else
f=0;
if(f==0)
{
conv1(b);
cout<<"THOUSAND"<<" ";
}
}
else
if(t==2)
{
int m=0;
while(t>1)
{
b[m++]=a[t];
t--;
}
b[m]='\0';
if(stricmp(b,"000")==0||stricmp(b,"00")==0||stricmp(b,"0")==0)
f=1;
else
f=0;
if(f==0)
{
conv1(b);
cout<<"HUNDRED"<<" ";
}
}
else
if(t==1)
{
int m=0;
while(t>=0)
{
b[m++]=a[t];

t--;
}
b[m]='\0';
conv1(b);
//cout<<"HUNDRED"
}
else
if(t==0)
{
int m=0;
while(t>=0)
{
b[m++]=a[t];
t--;
}
b[m]='\0';
conv1(b);
//cout<<"HUNDRED"
}
}
}
void conv1(char * c)
{
int j;
for(j=0;c[j];j+=2)
{
if(c[j]=='0'&& c[j+1]!='0')
{
if(c[j+1]!='\0')
{
if(c[j+1]=='0')
   cout<<"ZERO"<<" ";
 else

 conv2(c[j+1]);
}
else
{
if(c[j+1]!='\0'&& c[j+1]!='0')
{
cout<<"ZERO"<<" ";
}

//cout<<"ZERO"<<" ";
}
}
else
if(c[j]=='1')
{
if(c[j+1]!='\0')
{
 if(c[j+1]=='0')
   cout<<"TEN"<<" ";
 else
  if(c[j+1]=='1')
   cout<<"ELEVEN"<<" ";
  else
   if(c[j+1]=='2')
   cout<<"TWELVE"<<" ";
  else
   if(c[j+1]=='3')
   cout<<"THIRTEEN"<<" ";
   else
   if(c[j+1]=='4')
   cout<<"FOURTEEN"<<" ";
   else
  if(c[j+1]=='5')
   cout<<"FIFTEEN"<<" ";
  else
   if(c[j+1]=='6')
   cout<<"SIXTEEN";
   else
   if(c[j+1]=='7')
   cout<<"SEVENTEEN"<<" ";
  else
   if(c[j+1]=='8')
   cout<<"EIGHTEEN"<<" ";
   else
   if(c[j+1]=='9')
   cout<<"NINETEEN"<<" ";
 }
else
{
cout<<"ONE"<<" ";
}
}
else
if(c[j]=='2')
{
if(c[j+1]!='\0')
{
 cout<<"TWENTY"<<" ";
 conv2(c[j+1]);
 }
else
{
cout<<"TWO"<<" ";
}
}
else
if(c[j]=='3')
{
if(c[j+1]!='\0')
{
 cout<<"THIRTY"<<" ";
 conv2(c[j+1]);
 }
else
{
cout<<"THREE"<<" ";
}
}
else
if(c[j]=='4')
{
if(c[j+1]!='\0')
{
 cout<<"FOURTY"<<" ";
 conv2(c[j+1]);
 }
else
{
cout<<"FOUR"<<" ";
}
}
else
if(c[j]=='5')
{
if(c[j+1]!='\0')
{
 cout<<"FIFTY"<<" ";
 conv2(c[j+1]);
}
else
{
cout<<"FIVE"<<" ";
}
}
else
if(c[j]=='6')
{
if(c[j+1]!='\0')
{
 //cout<<c[j+1]<<endl;
 cout<<"SIXTY"<<" ";
 conv2(c[j+1]);
   }
else
{
cout<<"SIX"<<" ";
}
}
else
if(c[j]=='7')
{
if(c[j+1]!='\0')
{
 cout<<"SEVENTY"<<" ";
 conv2(c[j+1]);
 }
else
{
cout<<"SEVEN"<<" ";
}
}
else
if(c[j]=='8')
{
if(c[j+1]!='\0')
{
 cout<<"EIGHTY"<<" ";
 conv2(c[j+1]);
 }
else
{
cout<<"EIGHT"<<" ";
}
}
else
if(c[j]=='9')
{
if(c[j+1]!='\0')
{
 cout<<"NINETY"<<" ";
 conv2(c[j+1]);
  }
else
{
cout<<"NINE"<<" ";
}
}
}
}
void conv2(char c)
{

  if(c=='1')
   cout<<"ONE"<<" ";
  else
   if(c=='2')
   cout<<"TWO"<<" ";
  else
   if(c=='3')
   cout<<"THREE"<<" ";
   else
   if(c=='4')
   cout<<"FOUR"<<" ";
   else
  if(c=='5')
   cout<<"FIVE"<<" ";
  else
   if(c=='6')
   cout<<"SIX"<<" ";
   else
   if(c=='7')
   cout<<"SEVEN"<<" ";
  else
   if(c=='8')
   cout<<"EIGHT"<<" ";
   else
   if(c=='9')
   cout<<"NINE"<<" ";
 }
};
void main()
{
clrscr();
con c;
c.input();
c.conv();
getch();
}

