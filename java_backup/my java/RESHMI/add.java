import java.io.*;
class add
  {
      int x,y,z;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      void input()throws IOException
      {
          System.out.print("Enter total");
          x=Integer.parseInt(br.readLine());
          y=Integer.parseInt(br.readLine());
          z=sum(x,y);
          System.out.print(z);
        }
        int sum(int x,int y)
        {
            int k;
            k=x+y;
            return k;
        }
    }
    


