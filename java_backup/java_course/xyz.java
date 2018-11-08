class xyz extends abc
{
    int c;
    xyz()
    {
        super();
        c=4;
        System.out.print("derived");
    }
    void show()
    {
        
        System.out.print(super.a);
        System.out.print(a);
    }
}
