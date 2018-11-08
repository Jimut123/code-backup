
import java.io.*;
public class day1
{ 
    public static void main(String [] args)throws IOException
    
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter date ");
        int dd=Integer.parseInt(br.readLine());
        
        
        

        System.out.println("Enter month");
        int mm=Integer.parseInt(br.readLine());
        
        

        System.out.println("Enter year ");
        int yy=Integer.parseInt(br.readLine());
        int cald=0;
        
        for(int i=1980;i<yy;i++)
        {
            if((yy%4)==0  ||(yy%400)==0)
            cald=cald+366;
            else
            cald=cald+365;
        }
        int arrd[]={31,28,31,30,31,30,31,31,30,31,30,31};
        
        if((yy%4)==0 ||(yy%400)==0)
         arrd[1]=arrd[1]+1;
        //System.out.println(arrd[1]);
        for (int i=1;i<mm;i++)
        {
            cald=cald+arrd[i-1];
        }
        cald=cald+dd;
        
        String day[]={"tuesday","wednesday","thrusday","friday","saturday","sunday","monday"};
        int dayrem=0;
        int i;
        
        for(i=1;i<=cald;i++)
        {
            dayrem++;
            if(dayrem>=7)
            dayrem=0;
        }
        
        System.out.println("The day is "+day[dayrem]);
        
      
    }
}
//&& (yy%100)!=0
