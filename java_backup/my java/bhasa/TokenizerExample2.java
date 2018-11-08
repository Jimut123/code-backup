import java.io.*;
import java.util.*;
class TokenizerExample2
{
    static InputStreamReader input=new InputStreamReader(System.in);
    static BufferedReader keyboardInput=new BufferedReader(input);
    
    public static void main(String args[])throws IOException
    {
        int numberOfTokens=0;
        int numberArray[];
        int total=0;
        //get a string
        System.out.print("INPUT A SEQUENCE OF INTEGERS SEPERATED BY COMMAS(','):");
        StringTokenizer data=new StringTokenizer(keyboardInput.readLine(),",");
        //get number of tokens in line and initialise the array
        numberOfTokens=data.countTokens();
        System.out.println("NUMBER OF TOKENS="+numberOfTokens);
        numberArray=new int[numberOfTokens];
        System.out.println("NUMBER OF ELEMENTS"+numberOfTokens);
    }
}