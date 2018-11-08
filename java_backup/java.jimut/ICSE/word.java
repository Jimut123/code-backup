import java.io.*;
class word
{
    String w,m="";
    int i,l;
    char ch;
    InputStreamReader ab = new InputStreamReader(System.in);
    BufferedReader cd = new BufferedReader(ab);
    void accept()throws IOException
    {
        System.out.println("Enter a word:");
        w = cd.readLine();
    }
    void palin()
    {
        l=w.length();
        for(i=l-1;i>=0;i--)
        {
            ch =w.charAt(i);
            m=m+ch;
        }
    }
    void display()
    {
        if(m.equalsIgnoreCase(w))
        {
            System.out.println("PALINDROME");
        }
        else
        {
            System.out.println("NOT PALINDROME");
        }
    }
    public static void main(String args[])throws IOException
    {
        word ob = new word();
        ob.accept();
        ob.palin();
        ob.display();
    }
}