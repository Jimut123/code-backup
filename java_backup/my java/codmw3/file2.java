import java.io.*;
public class file2
{
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,fl,b,k,cc=0;
        FileOutputStream f=new FileOutputStream("data3.txt");
        
        for(a=1;a<=100;a++)
        {
            fl=0;
            for(b=2;b<=(a/2);b++)
            {
                if(a%b==0)
                {
                    fl=1;
                    break;
                }
            }
            if(fl==0)
            {
                cc++;
                f.write(a);
            }
        }
        f.close();
        FileInputStream fs=new FileInputStream("data3.txt");
        for(a=1;a<=cc;a++)
        {
             System.out.println(k=(int)(fs.read()));
            }
            fs.close();
        }
    }

            
        
        
    