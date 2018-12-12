import java.io.*;
class pos_neg_shift
{
public static void main(String args[])throws IOException
 {
	int a[]=new int[10];
	int j,n,i,flag,pass,temp;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter size of your list=");
	n=Integer.parseInt(br.readLine());
	System.out.print("\nEnter elements of array a[] one by one ------->");
	for(i=0;i<n;i++)
	{
	System.out.print("a["+i+"]=");
	a[i]=Integer.parseInt(br.readLine());
	}
	System.out.println("\nElements in Original Array\n");
	for(i=0;i<n;i++)
	System.out.println("a["+i+"]="+a[i]);
	System.out.println("\nPress Enter Key------>");
	br.readLine();
	//Interchange starts
	flag=0;
	pass=0;
 	while(flag==0)
	{
	pass=pass+1;
	flag=1;
	for(i=0;i<(n-1);i++)
	{
	if(a[i]<0 && a[i+1]>=0)
	{
	temp=a[i];
	a[i]=a[i+1];
	a[i+1]=temp;
	flag=0;
	System.out.println("\nPass="+pass);
	for(j=0;j<n;j++)
	System.out.println("a["+j+"]="+a[j]);
	System.out.println("\nPress Enter Key ---->");
	br.readLine();
	}
}
}
System.out.println("\nModified List");
for(i=0;i<n;i++)
System.out.println("a["+i+"]="+a[i]);
}
}