import java.io.*;
class sunday
{
    int d,y;
    sunday()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the date");
        d=Integer.parseInt(br.readLine());
        System.out.println("Enter the year");
        y=Integer.parseInt(br.readLine());
    }
    void find()
    {
        int l,f,f1;

        
        if(y%4==0)
        l=366;
        else
        l=365;
        while(d<l)
        {
            d=d+7;
          
         }
         if(d>l)
            {
            d=d-7;
            
        }

        f=l-d;
        f1=31-f;
        System.out.println("The date is="+f1+"December"+y);
    }
      public static void main(String arg[])throws IOException
    {
       
        
        sunday s=new sunday();
        s.find();
    }

}