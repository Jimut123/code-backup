
import java.io.*;
public class SET1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int k1,k2;
        k1=Integer.parseInt(br.readLine());
        SET ob=new SET(k1);
        ob.readelements();
        ob.displyelements();
       k2=Integer.parseInt(br.readLine());
        SET ob1=new SET(k2);
        ob1.readelements();
        ob1.displyelements();
        SET ob2=ob.intersection(ob1);
        ob2.displyelements();
        SET ob3=ob.union(ob1);
        ob3.displyelements();
            }
}
        