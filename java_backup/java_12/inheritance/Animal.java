abstract class Animal
{
    String name;
    String species;
    void init(String n,String s)
    {
        name = n;
        species = s;
    }
    void eat(String fooditem)
    {
        System.out.println(species+" "+name+" likes to have "+fooditem);
    }
    abstract void sound();
}