import java.io.*;
class Hanoi
{
    int n;
    Hanoi(int m)
    {
        n=m;
     }
     void hanoi(int p1,int p2,int p3,int nd)
      {
          if(nd==1)
          {
               n=n+1;
               System.out.println("Step-"+n+" :"+" Move Disk-"+nd+" From Peg-"+p1+" to Peg-"+p2);
               return;
        }
       hanoi(p1,p3,p2,nd-1);
       n=n+1;
       System.out.println("Step-"+n+" :"+" Move Disk-"+nd+" From Peg-"+p1+" to Peg-"+p2);
       hanoi(p3,p2,p1,nd-1);
      }
}
class tower
{
      public static void main(String args[])throws IOException
      {
          int p1=1,p2=2,p3=3,nd,n;
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.print("\nEnter Number of Disks(1-5)=");
          nd=Integer.parseInt(br.readLine());
          n=0;
          Hanoi H=new Hanoi(n);
           H.hanoi(p1,p2,p3,nd);
          System.out.println("Total number of iterations : "+ H.n);
      }
}