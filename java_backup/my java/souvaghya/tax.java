import java.io.*;
class tax
{
    int t,Income;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    tax()
    {
        Income=0;
        t=0;
    }
    void input()throws IOException
    {
        Income=Integer.parseInt(br.readLine());
        cal(Income);
    }
    void cal(int a)
    {
        //a=Income;
        if(a<=100000)
        t=0;
        else
        if(a<=250000)
        t=(a-100000)*10/100;
        else
        if(a<=500000)
        t=(10000+(a-250000))*15/100;
        else
        if(a<=1000000)
        t=(15000+(a-500000))*20/100;
        else
        if(a>1000000)
        t=(25000+(a-1000000))*25/100;
    }
    void display()
    {
    System.out.println("Income"+Income);
      System.out.println("Tax"+t);
    }
    public static void main()throws IOException
    {
        tax a=new tax();
        a.input();
        a.display();
    }
}