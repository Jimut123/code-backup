import java.io.*;
class compound
{
    public static void main(String args[])throws IOException
{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    int p,r,t,ci;
    p=Integer.parseInt(br.readLine());
    r=Integer.parseInt(br.readLine());
    t=Integer.parseInt(br.readLine());
    ci=p*(int)Math.pow((1+r/100),t);
    System.out.println(ci);
}
}