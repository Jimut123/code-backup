import java.io.*;
public class switchcase
{
    public static void main(String args[]) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter number:");
      number=Integer.parseInt(br.readLine());
      switch(ch)
      {
        case'A':
        case'a':
        case'E':
        case'e':
        case'I':
        case'i':
        case'O':
        case'o':
        case'U':
        case'u':vowels++;
        break;
        case'':
        spaces++;
        break;
        default:consonants++;
        break;
      }
       
        System.out.println("The word has consonants:" +consonants );
        System.out.println("The word has vowels:" +vowels );
     }
    }
        
        
                   