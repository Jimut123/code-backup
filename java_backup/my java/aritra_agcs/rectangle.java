import java .io.*;
class rectangle
      {public void main() throws IOException
          {
              BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
              int l,b,a,p;
              System.out.println("enter the lenght");
              l=Integer.parseInt(BR.readLine());
              System.out.println("enter the breadth");
              b=Integer.parseInt(BR.readLine());
              a=l*b;
              p=2*(l+b);
              System.out.println("the area of rectangle="+a);
              System.out.println("the perimeteris="+p);
            }
        }      
          