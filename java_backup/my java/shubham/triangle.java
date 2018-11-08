
class triangle
{
public void display()
{
int i,j;
outer:for(i=0;i<=7;i++)
{
for(j=0;j<=7;j++)
{
if(j>i)
{
System.out.println();
continue outer;
}
System.out.println(""+(i*j));
}
}
}
}
