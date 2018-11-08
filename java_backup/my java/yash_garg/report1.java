import java.io.*;
class report1
{
    /* This program displays the marks of a student */
    public void main()throws IOException
    {
        BufferedReader inp= new BufferedReader( new InputStreamReader(System.in));
        System.out.println(" Enter the name,class,section and marks of a student ");
        String nm=inp.readLine();
        int cl=Integer.parseInt(inp.readLine());
        String c;
        c=inp.readLine();
        char s=c.charAt(0);
        double m1=Double.parseDouble(inp.readLine());
        double m2=Double.parseDouble(inp.readLine());
        double m3=Double.parseDouble(inp.readLine());
        double tm=m1+m2+m3;
        double avg=tm/3;
        System.out.println(" Name: "+nm);
        System.out.println(" Class: "+cl);
        System.out.println(" Sec: "+s);
        System.out.println(" Total Marks: "+tm);
        System.out.println(" Average: "+avg);
    }
}
        