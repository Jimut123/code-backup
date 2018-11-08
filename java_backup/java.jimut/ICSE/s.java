import java.io.*;
class s
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int a=8;
        a-=++a + a++ +4;
        System.out.println(a);
    }
}