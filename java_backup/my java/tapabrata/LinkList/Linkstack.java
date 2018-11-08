package LinkList;
class Linkstack
{
   private LinkedList4 thelist;
   public Linkstack()
   {
       thelist=new LinkedList4();
    }
    public void push(int item)
    {
        thelist.Insert(item);
    }
    public int pop()
    {
        return thelist.delete();
    }
    public boolean isEmpty()
    {
        return(thelist.isEmpty());
    }
    public void displaystack()
    {
        System.out.println(" Your Stack ");
        thelist.display1();
    }
}