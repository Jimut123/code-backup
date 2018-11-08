import java.io.*;
class day
{
    public static void main(String args[])throws IOException
    {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new  BufferedReader(isr);
    int p,d;
    p=Integer.parseInt(br.readLine());
    System.out.println("Enter the Purchase");
    if(p<=10000)
    d=(p*10)/100;
    else
    if(p<=25000)
    d=(p*15)/100;
    else
    if(p<=50000)
    d=(p*25)/100;
    else
    if(p>50000)
    d=(p*35)/100;
    System.out.println("d");
}
}
    
    