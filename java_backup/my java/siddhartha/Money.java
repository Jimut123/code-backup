
import java.io.*;
class Money
{
  public static void main()throws IOException
  {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  int t=0,t1=0;
    int a[]={1000,500,100,50,20,10,5,2,1};
    System.out.println("Enter amount of  money:");
    int n=Integer.parseInt(br.readLine());
    for(int i=0;i<9;i++)
    {
        t=n/a[i];
        t1=n%a[i];
     if(t>0)
    {
     System.out.println(a[i]+"Rupee note="+"="+t);
    }  
    n=t1;
        if(n<=0)
    break;    
    }
        
  
}
}

    