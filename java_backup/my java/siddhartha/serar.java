
import java .io. *;
class serar
{
public static void main()throws IOException
{
 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter limit:");
 int n=Integer.parseInt(br.readLine());
 int a[]=new int [n];

for(int i=0;i<n;i++)
{
  System.out.println("Enter elements into array:");
  a[i]=Integer.parseInt(br.readLine());
}
System.out.println("Enter searching element:");
int c= Integer.parseInt(br.readLine());
int f=0;
for(int j=0;j<n;j++)
{
  if(a[j]==c)
  {
       f=1;
       break;
    }
    }
    if(f==1)
    System.out.println("Found");
    else
    System.out.println("Not Found");
}}


 