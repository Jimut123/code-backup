import java.io.*;
 class question_fifteen
{
  public static void main()throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String s;
      System.out.print("enter a string");
      s=br.readLine();
      int m;int m1;
      for(int i=0;i<s.length()-1;i++)
                {
                    m=(int)s.charAt(i);
                    m1=m+1;
                    if(s.charAt(i+1)==(char)m1)
                        System.out.println(s.charAt(i)+","+s.charAt(i+1));
                    else
                    if(s.charAt(i+1)==(char)(m1+32))
                        System.out.println(s.charAt(i)+","+s.charAt(i+1));
                    else
                    if(s.charAt(i+1)==(char)(m1-32))
                        System.out.println(s.charAt(i)+","+s.charAt(i+1));
                    }
                }
            }