package arraystring;

import java.io.*;
class max_vowel_min_no_vowel
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s1,s2;int i,n,max,min;
System.out.print("Enter the Strings");
n=Integer.parseInt(br.readLine());
String s[]=new String[n];
for(i=0;i<n;i++)
{
  s[i]= br.readLine();
}
max=min=VowelCount(s[0]);
//min=VowelCount(s[0]);
s1=s2=s[0];
for(i=0;i<n;i++)
{
    int k=VowelCount(s[i]);
    if(k>max)
    {max=k;
     s1=s[i];
    }
    else
    if(k<min)
    {min=k;
        s2=s[i];
    }
}
 System.out.println(s1 +","+s2);
} 
 public static int VowelCount(String s)
  {int i,v=0;
  for(i=0;i<s.length();i++)
    {char c =s.charAt(i);
      if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='U'||c=='u')
      v++;
      
    }
    return v;
}
}

    
    
    
    
    
    