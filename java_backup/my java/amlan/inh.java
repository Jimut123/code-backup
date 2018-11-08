import java.io.*;
class abc
{
    int x,y,z;
    void input()
    {
        System.out.println("Enter value");
        x=Integer.parseInt(br.readLine());
        y=Integer.parseInt(br.readLine());
    }
    void add()
    {
        z=x+y;
        System.out.println("z");
    }
}
class abc1 extends abc
{
    int p,q,r;
    void insert()
    {
        input();
        p=Integer.parseInt(br.readLine());
        q=Integer.parseInt(br.readLine());
    }
    void sum()
    {
        add();
        r=p+q;
        System.out.pintln(r);
    }
    public void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        abc1 a=new abc();
        a.insert();
        a.sum();
    }
}
        