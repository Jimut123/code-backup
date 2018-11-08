import java.io.*;
public class project3
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         double p;int t;
         System.out.println("Enter data");
         p=Double.parseDouble(br.readLine());
         t=Integer.parseInt(br.readLine());
         double a=0;
         double ci=0;
         
        if(p<2000)
         {
             if(t>=2 && t<=5)
             {
             a=p*Math.pow((1+((double)5/(double)100)),t);
             ci=a-p;
             System.out.println("Compound Amount is"+ci);
            }
             else
             if(t>=5 )
             {
             a=p*Math.pow((1+((double)10/(double)100)),t);
             ci=a-p;
             System.out.println("Compound Amount is"+ci);
            }
            else
            {
             a=p*Math.pow((1+((double)3/(double)100)),t);
             ci=a-p;
             System.out.println("Compound Amount is"+ci);
           }
        }
        else if(p>=2000 && p<=6000)
        {
            if(t>=2 && t<=5)
            {
            a=p*Math.pow((1+((double)7/(double)100)),t);
            ci=a-p;
            System.out.println("Compound Amount is"+ci);
           }
            else if(t>=5)
            {
            a=p*Math.pow((1+((double)10/(double)100)),t);
            ci=a=p;
            System.out.println("Compound Amount is"+ci);
            }
            else
            {
             a=p*Math.pow((1+((double)3/(double)100)),t);
             ci=a=p;
             System.out.println("Compound Amount is"+ci);
            }
        }
        else if(p>6000)
        {
            if(t>=1)
            {
            a=p*Math.pow((1+((double)8/(double)100)),t);
            ci=a-p;
            System.out.println("Compound Amount is"+ci);
            }
            else if(t>=5)
            {
            a=p*Math.pow((1+((double)10/(double)100)),t);
            ci=a=p;
            System.out.println("Compound Amount is"+ci);
            }
            else
            {
             a=p*Math.pow((1+((double)3/(double)100)),t);
             ci=a=p;
             System.out.println("Compound Amount is"+ci);
            }
        }
        }
    }


             