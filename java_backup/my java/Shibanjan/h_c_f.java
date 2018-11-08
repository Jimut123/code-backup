import java.io.*;
class h_c_f
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a,b,k;
    void input()throws IOException
    {
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        hcf(a,b);
       //int k;
       //k=hcf(b);
        //System.out.println(k);
    }
    void hcf(int a,int b)
    {
        
        if(a%b==0)
        {
           System.out.println(+b);
            return;
        }
        else
        {
            
            hcf(b,a%b);
        }
    }
}
            