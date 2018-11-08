import java.io.*;
class time
    {
        public static void main(String args[])throws IOException
        {
            InputStreamReader isr= new InputStreamReader(System.in);
            BufferedReader br= new BufferedReader(isr);
            System.out.println("enter hour");
            int hh= Integer.parseInt(br.readLine());
            System.out.println("enter minute");
            int min= Integer.parseInt(br.readLine());
            System.out.println("enter hour");
            int hh1= Integer.parseInt(br.readLine());
            System.out.println("enter minute");
            int min1= Integer.parseInt(br.readLine());
            int h2,m2;
            h2=m2=0;
            if(min>min1)
            {
                min1= min1+60;
                hh1= hh1-1;
                h2= hh1-hh;
                m2= min1-min;
            }
            else
           if(min<min1)
            {
               
                h2= hh1-hh;
                m2= min1- min;
            }
            System.out.println(h2+":"+m2);
        }}