import java.io.*;
class concat
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s,r,j;
        System.out.println("Enter two String::");
        s=cd.readLine();
        r=cd.readLine();
        j=s.concat(r);
        System.out.println(j);
        }
    }