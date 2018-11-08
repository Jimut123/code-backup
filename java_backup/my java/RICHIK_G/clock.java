import java.io.*;
public class clock
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int hr,min=0;
        String h[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve"};
        String m[]={"One minute","Two minutes","Three minutes","Four minutes","Five minutes","Six minutes","Seven minutes","Eight minutes","Nine minutes","Ten minutes","Eleven minutes","Twelve minutes ","Thirteen minutes","Fourteen minutes","Quarter","Sixteen minutes","Seventeen minutes","Eighteen minutes","Nineteen minutes","Twenty minutes","Twenty One minutes","Twenty Two minutes","Twenty Three minutes","Twenty Four minutes","Twenty Five minutes","Twenty Six minutes","Twenty Seven minutes","Twenty Eight minutes","Twenty Nine minutes","Half"};
        System.out.print("Time:");
        hr=Integer.parseInt(br.readLine());
        min=Integer.parseInt(br.readLine());
        System.out.println(hr+","+min);
        System.out.print("Output:");
        System.out.print(hr+",");
        if(min==0)
        {
            min=00;
            System.out.print(min);
        }
        else if(min>0&&min<10)
        {    System.out.print("0"+min);
        }
        
            
        else
        {
            System.out.print(min);
        }
         if(hr>12!!hr<1!!min>59)
            {
             System.out.print("Incorrect input");
            }
            
         else if(min==0)
         {
             System.out.print(h[hr-1]+"O'clock");
            }
            else if(min>0&&min<31)
            {
                System.out.print(m[min-1]+"past"+h[hr-1]);
            }
            else if(m>31)
            {
                if(((60-min)-1)==14)
                System.out.print("Fifteen minutes to"+h[hr-1]);
                else if((60-min)-1))
            
            
            
            
            
            
        