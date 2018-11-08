public class arraystackInt
{
protected int stack[];//array to hold stack
protected int ctr;//to print specific element in stack
public arraystackInt(int capacity)
{
stack=new int[capacity];
ctr=-1;
}
public boolean isEmpty()
{
return ctr==-1;
}
public void push(int i)
{
if(ctr+1<stack.length)
stack[++ctr]=i;
//ctr++;
}
public int pop()
{
if (isEmpty())
return 0;
return stack[ctr--];
}
}