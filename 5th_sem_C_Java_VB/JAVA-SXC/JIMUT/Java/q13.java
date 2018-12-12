import java.io.*;
class q13
{
    public static void main(String args[])throws IOException
    {
        String file1;
        int ch,nol,ns,v,c;
        nol=1;
        ns=v=c=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter Input File Name = ");
        file1=br.readLine();
        FileInputStream fp1 = new FileInputStream(file1);
        while((ch=fp1.read())!=-1)
        {
            if(ch==13)
              nol=nol+1;
            else if(ch==32)
               ns=ns+1;
            else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
              v=v+1;
            else 
              c=c+1;
         }
         System.out.println("Number of Vowels = "+v);
         System.out.println("Number of Consonants = "+c);
         System.out.println("Number of lines = "+nol);
         System.out.println("Number of spaces = "+ns);
         fp1.close();
    }
}