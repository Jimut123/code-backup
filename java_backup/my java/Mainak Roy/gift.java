import java.io.*;
class gift
    {
       public static void main(String args[])throws IOException
            {
                
                InputStreamReader ISR=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(ISR);
                String s;
                System.out.println("your name");
                s=br.readLine();
                System.out.print("HAPPY TEACHERS' DAY "+s);
            }
        }
        