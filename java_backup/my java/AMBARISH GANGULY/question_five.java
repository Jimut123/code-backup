import java.io.*;
class question_five
 {
   void choice()throws IOException
    {int i,s=0,n,r,l,b,ba,h;
     System.out.println("Press 1 for area of circle");
     System.out.println("press 2 for area of rectangle");
     System.out.println("press 3 for area of triangle");  
     System.out.println("enter choice");  
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
     n=Integer.parseInt(br.readLine());
    switch(n)
        {
            case 1:System.out.print("Give radius");
                    r=Integer.parseInt(br.readLine());
                    s=(int)((2*3.14)*r);
                    System.out.print(s);
                    break;
            case 2: System.out.print("Give length and breadth");      
                    l= Integer.parseInt(br.readLine());
                    b= Integer.parseInt(br.readLine());
                    s=l*b;
                    System.out.print(s);
                    break;
            case 3: System.out.print("Give base and height");
                    ba= Integer.parseInt(br.readLine());
                    h=  Integer.parseInt(br.readLine());
                    s=((ba*h)/2);
                    break;
                default :
                        System.out.print("error");
                    }
                }
            }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

