//this class will verify the new OS code
import java.util.*;
class CheckCode
{
    private String code;
    private int l;
    public void check()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input:\nN=");
        l=sc.nextInt();
        if(l>6) msg("Error: Length should not exceed 6 characters");
        code=sc.next();
        if(l!=code.length()) msg("Invalid: Code length does not match given length");
        if(!code.toUpperCase().equals(code)) msg("Invalid: Only upper case letters are permitted");
        if(!isAlt()) msg("Invalid: Only alternate letters are permitted");
        if(!isRepeat()) msg("Invalid: Repeatation not permitted");
        msg("Valid Code");
    }
    
    public boolean isAlt()
    {
        for(int i=0; i<code.length(); i++)
            if("ACEGIK".indexOf(code.charAt(i))==-1) return false;
        return true;
    }
    
    public boolean isRepeat()
    {
        for(int i=0; i<code.length()-1; i++)
            for(int j=i+1; j<code.length(); j++)
                if(code.charAt(i)==code.charAt(j)) return false;
        return true;
    }
    
    public void msg(String output)
    {
        System.out.println(output);
        System.exit(0);
    }
}

public class Verify_OS_Code
{
    public static void main(String args[])
    {
        new CheckCode().check();
    }
}