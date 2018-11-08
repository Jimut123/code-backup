class abc
{
    int x,y;
    void sum(abc ob)
    {
        ob.x=ob.x+2;
        ob.y=ob.y+2;
        System.out.println(ob.x+","+ob.y);
    }
    public static void main(String args[])
    {
        abc obj = new abc();
        obj.get();
        obj.sum(obj);
    }
    void get()
    {
        x=10;
        y=5;
    }
}
