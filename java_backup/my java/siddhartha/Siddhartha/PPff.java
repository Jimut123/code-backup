class PPff
{
  int n;
  public void pp(int n)
{
    int a=0,i,j=0,c=0,d=0,m=0,h=0,k=0;
for(i=1;i<=n;i++) 
{
if(n%i==0)
{
c++;
}}
if(c==2)
{
for(k=n;k!=0;k=k/10)
{
a=k%10;
h++;
j=0;
for(d=1;d<=a;d++)
{
  if(a%d==0)
{
 j++;
}}
if(j==2)
{
  m++;
}}
if(m==h)
{
  System.out.println(n+" is a parallel prime");
}
else
{
   System.out.println(n+" is not a parallel prime");
}
  }
}
public void main()
{
  PPff obj=new PPff();
  obj.pp(n);
   }
}



 