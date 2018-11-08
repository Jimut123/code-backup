
import java.io.*;
class volume
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double a=0,l=0,b=0,h=0,r=0,volume=0;
        int ch;
        System.out.println("menu");
        System.out.println("1.volume of cube");
        System.out.println("2.volume of cuboid");
        System.out.println("3.volume of cylinder");
        System.out.println("Enter your choice");
        ch= Integer.parseInt(br.readLine());
        switch(ch)
        {case 1:System.out.println("Enter a");
            a=Double.parseDouble(br.readLine());
            volume=a*a*a;
            System.out.println(volume);
            break;
            case 2:System.out.println("Enter l,b,h");
            l=Double.parseDouble(br.readLine());
            b=Double.parseDouble(br.readLine());
            h=Double.parseDouble(br.readLine());
            volume=l*b*h;
            System.out.println(volume);
            break;
            case 3:System.out.println("Enter r");
            r=Double.parseDouble(br.readLine());
            h=Double.parseDouble(br.readLine());
            volume=3.14*r*r*h;
            System.out.println(volume);
            break;
            default:System.out.println("Invalid choice");
        }
    }
}

   
    
    
    
    
    