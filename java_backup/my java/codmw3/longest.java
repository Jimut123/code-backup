import java.util.*;
public class longest
{
    void main()
    {
    Scanner sc=new Scanner(System.in);
    int h,b,c=0,n,m;
    String a,e="",k;
    
    System.out.println("enter sentence");
    a=sc.nextLine();
    
    for(b=0;b<a.length();b=b+1)
    {
        if(a.charAt(b)==' ')
        {
            c=c+1;
        }
    }
    h=0;
    String d[]=new String[c+1];
    for(b=0;b<a.length();b=b+1)
    {
        e=e+a.charAt(b);
        if(a.charAt(b)==' ')
        {
        d[h]=e;
        e="";
        d[h]=d[h].trim();
        h++;
    }
}
d[h++]=e;

for(m=0;m<h;m=m+1)
{
 for(n=0;n<h-m-1;n=n+1)
 {
     if(d[n].length()>d[n+1].length())
     {
         k=d[n];
         d[n]=d[n+1];
         d[n+1]=k;
}
}
}
for(b=0;b<h;b=b+1)
{
    System.out.println(d[b]);
}
}
}
        
    
    
    
    