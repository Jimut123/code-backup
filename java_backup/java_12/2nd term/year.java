import java.io.*;
class year
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int date[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int n=100000,v=1;
        int d=0,k=0,i=0;
        while(v!=0)
        {
            
        System.out.println("Enter a number : ");
        n=Integer.parseInt(cd.readLine());
        if(n<100000)
        {
            System.out.println("Invalid input. ");
            v=1;
        }
        else
        {
            d=n%10000;
            k=n/10000;
            if(k>365)
            {
                k=k-365;
                d++;
                i=0;
            }
            if((n%100==0)&&(n%400==0))
            {
               
                if(i==2)
                {
                    if(k>=date[i])
                    {
                    k=k-29;
                    i++;
                }
                }
                else
                {
                    if(k>date[i])
                    {
                    k=k-date[i];
                    i++;
                }
                }
                
            }
            else
            {
                 if(k>date[i])
                    {
                k=k-date[i];
                i++;
            }
            }
            
            if((k!=0)&&(d!=0)&&(k<365))
            v=0;
        }
    }
         System.out.println(k+"\t"+month[i]+"\t"+d );
        }
    }
    