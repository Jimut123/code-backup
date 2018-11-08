import java.io.*;
class question_fourteen
{
 public static void main()throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.print("enter limit");
     int n;int s=0;
     n=Integer.parseInt(br.readLine());
     for(int i=1;i<=n;i++)
     s=s+i;
     System.out.println(s);
    }}