import java.io.*;
 class char_check
    {
        public static void main(String args[])throws IOException
            {
                char ch;
                System.out.println("Give characterr:");
                ch=(char)System.in.read();
                if((int)ch>=65 && (int)ch<=90)
                System.out.println("Uppercase");
                else
                 if((int)ch>=97 && (int)ch<=122)
                System.out.println("Lowercase");
                else
                 if((int)ch>=48 && (int)ch<=57)
                System.out.println("Digits");
                else
                 if((int)ch==32 )
                System.out.println("Space/Blank");
                else
                System.out.println("Special");
            }

}
