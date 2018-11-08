class perfect
{
 void p()
 {
  int i;
  for(i=1;i<=100;i++)
  {
   boolean b=check(i);
   if (b==true)
    System.out.println(i);
  }
 }
 
 boolean check(int i)
 {
  int s=0,j;
  for(j=1;j<i;j++)
  {
   if (i%j==0)
    s=s+j;
  }
  //System.out.println(s);
   if (s==i)
    return true;
   else
    return false;
 }
} 