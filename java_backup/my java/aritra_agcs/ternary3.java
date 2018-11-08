import java.io.*;
class ternary3
{
    public void main()throws IOException
    {
        BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
        int un;
        double ch;
        System.out.println("Enter any unit");
        un=Integer.parseInt(BR.readLine());
        ch=(un<=75)?0:(un<=150)?(un-75)*.50:(un<=225)?(75*.50)+(un-150)*1:(un<=300)?75*.50+75*1+(un-225)*2.5:75*.50+75*1+75*2.5+(un-300)*3.5;
        System.out.println("the value of b is "+ch);
    }
}    
    