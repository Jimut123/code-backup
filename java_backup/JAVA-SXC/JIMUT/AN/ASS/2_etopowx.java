import java.io.*;
import java.lang.*;
class e_x
{
    int fact(int n)
    {
        int i,f=1;
        for(i=1;i<=n;i++)
            f*=i;
        return f;
    }
    double cal_ex(int n, double x) // n = precision, x = val
    {
	    int i;
	    double d,k,sum=0;
	    for(i=0;i<=n;i++)
	    {
		    d=Math.pow(x,i);
		    System.out.print(x+"^"+i+"/"+fact(i)+" +  ");
		    // System.out.println("");
		    k = d/fact(i);
		    sum+=k;
	    }
	    return sum;
    }
}
class cal_etox
{
    public static void main(String args[])throws IOException
        {
                InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
                e_x ob = new e_x();
                int i,n;
                double x;
                System.out.print("Enter the value of n for precision (1-10 as factorial > 10 is NaN):");
                n = Integer.parseInt(cd.readLine());
                System.out.println("Enter the value of x in e(x):");
                x = Double.parseDouble(cd.readLine());
		System.out.println("Calculated value for "+"e^"+x+" : "+ob.cal_ex(n,x));
		System.out.println("Value for "+"e^"+x+" : "+Math.exp(x));
        }
}
