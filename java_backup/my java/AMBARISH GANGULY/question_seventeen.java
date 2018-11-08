import java.io.*;
 class question_seventeen
  {
     public static void main()throws IOException
      { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s,t;int i,j;char c;
        System.out.print("enter two strings");
        s=br.readLine();
        t=br.readLine();
        if(s.length()==t.length())
        {
            j=t.length()-1;
        for(i=0;i<s.length();i++)
        {
       
         System.out.print(s.charAt(i)+""+t.charAt(j));
         j--;
        }
         
        
    }
}
}
