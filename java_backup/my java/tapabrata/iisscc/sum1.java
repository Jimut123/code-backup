package iisscc;
class sum1
{//beginning of class
public static void main(int a,int n)
{//beginning of main
int i,j,f;//declaring variables
double s=0.0;
for(i=1;i<=n;i++)
{//using for loop
f=1;
for(j=1;j<=i;j++)
f=f*j;
s=s+((double)Math.pow(a,i)/(double)(a+f));//storing sum
}
System.out.println("sum of the series : ");
System.out.println(s);//printing the sum
}//end of main
}//end of class
