
import java.io.*;
public class ffibo_rec
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int i,n,k;
	void input()throws IOException
	{
	System.out.println("Give Term:");
	n=Integer.parseInt(br.readLine());
	for(i=1;i<=n;i++)
	{
	k=fibo(i);
	System.out.println(k);
	}
	}
	int fibo(int x)
	{
	if(x==0 || x==1)
	 return 0;
	else
	if(x==2)
	return 1;
	else
	return(fibo(x-1)+fibo(x-2));
	}
	}

