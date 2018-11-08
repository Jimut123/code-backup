import java.io.*;
class area
    {
        void choice()throws IOException
            {
                int i,s=0,n,r,l,b,ba,h;
                System.out.println("Press 1 for Area of circle");
                System.out.println("Press 2 for Area of rectangle");
                System.out.println("Press 3 for Area of triangle");
                System.out.println("Enter choice:");
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                n=Integer.parseInt(br.readLine());
                switch(n)
                    {
                        case 1:
                            System.out.println("Give radius");
                            r=Integer.parseInt(br.readLine());
                                s=((int)(2*3.14)*r);
                                    System.out.println(s);
                                    break;
                        case 2:
                           System.out.println("Give length & breadth");
                            l=Integer.parseInt(br.readLine());
                             b=Integer.parseInt(br.readLine());
                             s=l*b;
                             System.out.println(s);
                                break;
                                 case 3:
                           System.out.println("Give base & height");
                            ba=Integer.parseInt(br.readLine());
                            h=Integer.parseInt(br.readLine());
                             s=(ba*h)/2;
                             System.out.println(s);
                                break;
                                
                        default :
                        System.out.print("error");
                    }
                }
            }
