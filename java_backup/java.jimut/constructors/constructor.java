
class constructor
{
    int a,b;
    constructor()
    {
        a=0;
        b=0;
    }
     constructor(int x,int y)
    {
        a=x;
        b=y;
    }
    constructor(constructor t)
    {
        a=t.a;
        b=t.b;
    }
}
    