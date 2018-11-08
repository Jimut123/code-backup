import java.io.*;
class l
{
    int c;
    int i,j;
    void loop()
    {
        for(i=1;i<=10;i++)
        {
            c = (int)Math.random()*10;
            for(j=0;j<=c;j++)
            {
            System.out.print("Jimut ");
         }
         System.out.println("");
        }
    }
    public static void main(String args[])
    {
        l ob = new l();
        ob.loop();
    }
}