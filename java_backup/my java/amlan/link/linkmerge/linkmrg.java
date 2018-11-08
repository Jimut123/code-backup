package link.linkmerge;

import java.io.*;
class linkmrg
{
 link1 l1;
  int i;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 linkmrg()
 {
i=0;
    }
    
    void start()throws IOException
    {
       
               do
        {
             l1=new link1();
            System.out.println("Press 1 for input vslues into first & second list:");
            System.out.println("Press 2 for display final list:");
            System.out.println("Press 3 for exit");
            System.out.println("Enter choice:");
            i=Integer.parseInt(br.readLine());
            switch(i)
            {
                case 1: l1.insert1();
                break;
                case 2: l1.disp1();
                break;
                case 3: System.exit(0);
                }
            }while(true);
                
}
}
