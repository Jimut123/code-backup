import java.io.*;
class Batsman
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String bm[] = new String[20];
        String cn[] = new String[20];
        int tnoc[] = new int[20];
        int i,v=1,j,k;
        char ch;
        System.out.println("Enter ten Names of world class batsmen:");
        System.out.println("Enter ten Countries of world class batsmen:");
        System.out.println("Enter total no of century:");
        for(i=0;i<20;i++)
        {
            System.out.println("Enter the "+(i+1)+" th Name:");
            bm[i]=cd.readLine();
            System.out.println("Enter the "+(i+1)+" th Country:");
            cn[i]=cd.readLine();
            System.out.println("Enter the"+(i+1)+"th century:");
            tnoc[i]=Integer.parseInt(cd.readLine());
        }
        System.out.println("Enter the first letter of the name of the country you want to search of:");
        char con = (char)(cd.read());
        for(i=0;i<20;i++)
        {
            ch = cn[i].charAt(0);
            if(ch==con)
            {
                System.out.println("Name of the country:"+cn[i]);
                System.out.println("Name of the player:"+bm[i]);
                System.out.println("No. of centuries:"+tnoc[i]);
                v=0;
              
        }
       }
       if(v==1)
       {
        System.out.println("Search unsucessful, name not enlisted.");
       }
}
}