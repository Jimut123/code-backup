import java.util.*;
public class stringprn
{
int n=0;

void run()
{
Scanner sc=new Scanner(System.in);
    System.out.println(" enter string");
    String a=sc.nextLine();
    System.out.println("1-vowel less word; 2-palindrome; 3-piglaqtin");
    n=sc.nextInt();
    print(a);
}

public void print(String a)
   {
       if (n==1)
       {
           vlw(a);
        }
        if(n==2)
        {
            pal(a);
        }
        if(n==3)
        {
            pigl(a);
        }
    }
    
    void vlw(String a)
    {
        int sp=0;
        for(int i=0;i<a.length();i++)
        {
            if (a.charAt(i)==' ')
            {
                sp++;
            }
        }
        
        String ar[] =new String[sp+1];
        int h=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            {
                h++;
            }
            else
            ar[h]=ar[h]+a.charAt(i);
        }
        int s=0;
        for(int i=0;i<=sp;i++)
        {
            ar[i]=ar[i].toLowerCase();
            for(int j=0;j<ar[i].length();j++)
            {
                switch(ar[i].charAt(j))
                {
                    case 'a':
                    s++;break;
                    case 'e':s++;break;
                    case 'i':s++;break;
                    case 'u':s++;break;
                    case 'o':s++;break;
                    
                }
            }
                if(s==0)
                {
                    System.out.println(ar[i]);
                    
                }
                s=0;
            }
            
        }
        
        void pal(String a)
        {
            int sp=0;
        for(int i=0;i<a.length();i++)
        {
            if (a.charAt(i)==' ')
            {
                sp++;
            }
        }
        
        String[] ar=new String[sp+1];
        int h=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            {
                h++;
            }
            else
            ar[h]=ar[h]+a.charAt(i);
        }
        for(int i=0;i<h;i++)
        {
            System.out.println("ab"+ar[i]);
        }
        for(int i=0;i<sp+1;i++)
        {
            String p="";
            for(int j=ar[i].length()-1;j>=0;j--)
            {
                p=p+ar[i].charAt(j);
            }
            if(p.equalsIgnoreCase(ar[i]))
            {
                System.out.println(ar[i]);
            }
        }
    }
    
    void pigl(String a)
    {
        
        int s=0;
        int j=0;
                       for(j=0;j<a.length();j++)
            {
                switch(a.charAt(j))
                {
                    case 'a':s++;break;
                    case 'e':s++;break;
                    case 'i':s++;break;
                    case 'u':s++;break;
                    case 'o':
                    s=s+1;
                    break;
                }
            }
                if(s>0)
                {
                    String w="";
                    for(int i=j+1;i<a.length();i++)
                    {
                        w=w+a.charAt(i);
                    }
                    
                    for(int i=0;i<=j;i++)
                    {
                        w=w+a.charAt(i);
                    }
                    w=w+"ay";
                    System.out.println(w);
            }
            else if(s==0)
            {
                a=a+"ay";
                System.out.println(a);
            }
        }
    }
    

                
        
                