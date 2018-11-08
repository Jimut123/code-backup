import java.io.*;
class cow
{
	int n,n1,count,i,j,k,m,p;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	void input()throws IOException
	{
	System.out.println("Enter no of Sons:");
	n=Integer.parseInt(br.readLine());
	}
	void calc()
	{
	n1=n*n;
	System.out.println("Total no of cows:"+n1);
	count=0;
	for(i=1;i<=n1;i++)
	 count=count+i;
	System.out.println("Total Count of Milk:"+count); 
	count=count/n;
	i=1;
	k=1;
	while(i<=n)
	{
	j=0;
	m=k;
	while(k<=n1)
	{
	j=j+k;
	if((count-j)<=n1)
	 {
	 System.out.println("The Combinations of Cows:");
	 while(m<=k)
	 {
	  System.out.print(m+",");
	  m++;
	 } 
	 System.out.print((count-j)); 
	 System.out.println("");
	 k++;
	 break;
	 }
	 k++;
	 }
	 if(m==k)
	 k++;
	 i++;
	 }
	 }
}
