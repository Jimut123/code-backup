
public class insert extends bank
{
    int r,t;
    insert(int a,int b,int c,int d,String name)
    {
        
        super(c,d,name);
        r=a;
        t=b;
        
        System.out.println("Total amount is "+cal(r,t,c));
        super.display();
        display();
    }
    int cal(int m,int n,int i)
    {
        int it;
        it=i+(i*m*n)/100;
        return it;
    }
    void display()
    {
        System.out.println(+r);
        System.out.println(+t);
    }
}
        