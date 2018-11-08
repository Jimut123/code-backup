package special;

import java.io.*;
class object_bin_add
{
int pos,n,t,k;
int a[]=new int[100];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
object_bin_add()
{
    n=0;
    pos=0;
}
void accept()
{
    System.out.println("Enter data :");
    n=Integer.parseInt(br.readLine());
    t=0;
    while(n>0)
    {
        k=n%10;
        a[t++]=k;
        n=n/10;
    }
    
}
object_bin_add addition(object_bin_add a1,object_bin_add b1)
{
    object_bin_add c1;
    
    