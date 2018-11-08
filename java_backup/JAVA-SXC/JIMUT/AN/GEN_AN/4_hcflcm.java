import java.io.*;
class HcfLcm
{
        public static void main(String args[])throws IOException
        {
                InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
				System.out.println("Enter two nos. for HCF :");
				int a1 = Integer.parseInt(cd.readLine());
				int b1 = Integer.parseInt(cd.readLine());
				HcLc ob = new HcLc();
				int hcfc = ob.Hcf1(a1,b1);
				int lcmc = ob.Lcm1(a1,b1);
				System.out.println("LCM :"+lcmc);
				System.out.println("HCF :"+hcfc);
		}
}

class HcLc
{
	int Hcf1(int a, int b)
	{
		int d,k,min,max;
		if(a>b)
		{
			max=a;
			min=b;
		}
		else
		{
			max=b;
			min=a;
		}
		k=max%min;
		while(k!=0)
		{
			k=max%min;
			if(k==0)
				break;
			max = min;
			min = k;
		}
		return min;
	}
	int Lcm1(int a,int b)
	{
		
		return (a*b)/Hcf1(a,b);
	}
	
}
