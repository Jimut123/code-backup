package iisscc;
class sum2
{//starting of class
public static void main(int a,int n)
{//starting of main
int i,j,f,t=1;//declaring variables
double s=1.0;
for(i=2;i<=n;i=i+2)
{//using for loop
f=1;
for(j=1;j<=i;j++)
f=f*j;
s=s+(t*((double)(a*a)/(double)f));//storing sum
t=t*-1;
}
System.out.println("sum of the series : ");
System.out.println(s);//printing the sum
}//end of main
}//end of class
