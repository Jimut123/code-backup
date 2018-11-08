import java.io.*;
public class emp_net extends emp_sal
{
    public int pf;
    public int it;
    public int net;
    
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    
    public void display()throws IOException
    {
        System.out.println("  Enter name ");
        String n=br.readLine();
        System.out.println("  Enter code ");
        String c=br.readLine();
        System.out.println("  Enter desig ");
        String desig=br.readLine();
        System.out.println("  Enter basic ");
        int basic=Integer.parseInt(br.readLine());
       super.input(n,c,desig,basic);
        super.calc();
        pf=(basic*10)/100;
        System.out.println("Pf:"+pf);
        it=(basic*10)/100;
        System.out.println("It:"+it);
        net=gross-pf-it;
        System.out.println(net);
    }
}
