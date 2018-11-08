import java.io.*;
class bsbs
{                                                        //declaring class
public static void main()throws IOException
{                                                       //declaring main method
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t,l=0,h,s,pos=-1,b,n,j,i;                          //declaring variables
System.out.println("Enter the size of the array");
n=Integer.parseInt(br.readLine());
h=n-1;
int a[]=new int[n];                   //declaring array
System.out.println("Enter the numbers");
for(i=0;i<n;i++)
{
    a[i]=Integer.parseInt(br.readLine());
}
//bubble sorting
for(i=0;i<n;i++)
{
    for(j=0;j<n-i-1;i++)
    {
        if(a[j]>a[j+1])
        {
            t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
        }
    }
}
for(i=0;i<n;i++)
System.out.println(a[i]);
System.out.println("Enter no. to be searched");
s=Integer.parseInt(br.readLine());
//Binary search
while(l<=h)
{
    b=(l+h)/2;
    if(a[b]==s)
    {
       pos=b;
       break;
    }
 else if(a[b]<s)
     {
       l=b+1;
    }
 else if(a[b]>s) 
     { 
       h=b-1;
    }
}
    if(pos!=-1)
 
   System.out.println(s+"found in position"+pos);
 else 
   System.out.println("Wrong"); 

}                //end of main method 
}                //end of class
/**
  Enter the size of the array
5
Enter the numbers
1
2
3
4
5
Enter no. to be searched
5
5found in position4
 
Enter the size of the array
5
Enter the numbers
1
2
3
4
5
Enter no. to be searched
6
Wrong

 */
