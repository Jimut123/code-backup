import java.io.*;
public class imp 
{
    public  void main()throws IOException
    {
        int n,y;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number to be reversed");
        n=Integer.parseInt(br.readLine());
        y=n;
        reverse r=new reverse();
        r.input(y);
        r.cal();
        digits d=new digits();
        d.data(y);
        d.cal();
        //ob.input(y);
        //ob.cal();
    }
}
        