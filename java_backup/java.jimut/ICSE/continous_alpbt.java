import java.io.*;
class continous_alpbt
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s,m="",p;
        int l,i,ap=0,vp=0;
        char ch,c;
        System.out.println("Enter a TEXT::");
        s = cd.readLine();
        s=s+" ";
        l = s.length();
          for(i=0;i<l-1;i++)
        {
            ch=s.charAt(i);
            c=s.charAt(i+1);
            if(((int)(ch+1))==((int)c))
            {
                ap=ap+1;
            }
            if(((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))&&((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')))
            {
                vp=vp+1;
            }
        }
        
       
             System.out.println("No. of alphabet pairs : "+ap);
             System.out.println("No. of vowels pairs : "+vp);
       
       
} 
}