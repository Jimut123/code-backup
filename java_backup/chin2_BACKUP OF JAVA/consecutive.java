import java.io.*;
public class consecutive
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE SENTENCE");
        String sentence = br.readLine();
        consecutive abc = new consecutive();
        int a = abc.calculate(sentence);
        System.out.println("NUMBER OF REPETITIONS ARE = "+a);       
    }
    public int calculate(String str)
    {
        int count = 0;
        for(int i = 0; i<str.length();i++)
        {
            if(str.charAt(i) == str.charAt(i+1))
            {
                count ++;
                System.out.println(str.charAt(i)+","+str.charAt(i+1));
                System.out.print("at position "+i+" and "+(i+1));
            }
        }
        return count;
    }
}
