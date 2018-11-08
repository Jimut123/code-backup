class Lion extends Animal
{
    Lion()
    {
        init("Lion","Asiastic");
    }
    void sound()
    {
        System.out.println("Lions Roar! Roar!");   
    }
    public static void main(String args[])
    {
        Lion l=new Lion();
        l.eat("flesh");
        l.sound();
    }
}