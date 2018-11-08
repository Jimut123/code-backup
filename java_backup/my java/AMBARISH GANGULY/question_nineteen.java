import java.io.*;
 class question_nineteen
 {
   public static void main()throws IOException  
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s,w,w1;int f;int l;
        System.out.print("Enter a sentence");
        s=br.readLine();
        System.out.print("Enter a searching word");
        w1=br.readLine();
        l=s.length();
        w="";
        f=0;
        //s=s+" ";
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
          {
              //System.out.print(w);     
              if(w.equalsIgnoreCase(w1)==true)
                f++;
            w="";
        }
        else
        w=w+s.charAt(i);
    }
    if(w.equalsIgnoreCase(w1)==true)
                f++;
   System.out.print("Total frequency:"+f);     
        }
        
    }
