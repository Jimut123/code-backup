import java.io.*;
class sine_curve_values
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,c=1,f=1,i,j;
        float v,s=0.00f;
        System.out.println("Enter the precision number:");
        n=Integer.parseInt(cd.readLine());
        System.out.println("Enter the value in degrees:");
        v=Float.parseFloat(cd.readLine());
        v=(float)(3.1428571*v/180);
        for(i=1;i<=n;i++)
        {
            c=c+2;
            for(j=1;j<=c;j++)
            {
                f=f*j;
            }
            if(i%2!=0)
            {
                s=s-(float)((Math.pow(v,c))/(f));
            }
            else
            {
                s=s+(float)((Math.pow(v,c))/(f));
            }
            f=1;
        }
        v=v+s;
         System.out.println("The value:"+v);
    }
}