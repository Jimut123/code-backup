public class demo1
 {
     public void main()
      {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          String s=br.readLine();
          String w=" ";
          for(int i=0;i<s.length();i++)
           {
               for(int j=0;j<i;j++)
                {
                    System.out.print(charAt(j));
                }
            }
        }//end of void main
    }//end of public class
    
    
