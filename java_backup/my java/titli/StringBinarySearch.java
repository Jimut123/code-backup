//binary search in string array
import java.io.*;
class StringBinarySearch
{
  String s,sWord;
  int len;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void get()throws IOException
  {
      String w="";
      int l,i,sp=0,c=0,j;
      System.out.println("enter a string");
       s=br.readLine();
      System.out.println("enter word to be searched for");
       sWord=br.readLine();
      l=s.length();
      for(i=0;i<l;i++)
      {
          if (s.charAt(i)==' ' && s.charAt(i+1)!=' ')
           sp++;
        }
        sp++;
        len=sp;
        String words[]=new String[sp];
        for(i=0;i<l;i++)
        {
            if (s.charAt(i)!=' ')
             w=w+s.charAt(i);
            else
            {
                words[c++]=w;
                w="";
            }
        }
        words[c]=w;
        for(i=0;i<sp;i++)
        {
            for(j=0;j<sp-i-1;j++)
            {
                if (words[j].length()>words[j+1].length())
                {
                    String temp=words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp;
                }
            }
        }
        find(words);
    }
    public void find(String words[])
    {
        int mid=0,high=len-1,low=0,c=0;
        for(int i=0;i<len;i++)
        System.out.println(words[i]);
        while(low<=high)
        {
            mid=(low+high)/2;
            if (words[mid].length()<sWord.length())
            {
                 System.out.println(words[mid]);
             low=mid+1;
            }
           else
           if (words[mid].length()>sWord.length())
           {
             System.out.println(words[mid]);  
            high=mid-1;
        }
            else
            {
                if (words[mid].compareTo(sWord)==0)
                {
                    c=1;
                    break;
                }
                else
               {
                if(mid==(len-1)|| mid==0)
                  break;
                else  
                   low=mid;
                }
            }
        }
        if (c==1)
         System.out.println("WORD FOUND");
        else
         System.out.println("WORD NOT FOUND");
        }
    }
    
        
      