import java.io.*;
public class volumesandareas
 {
     public static void main (String args[])throws IOException
        {

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int tsac,vc,tsacu,vcu,b,c,d,e;
            double pa,vp,vcy,vco,vsp;
            System.out.println("PRESS 1 FOR AREA AND VOLUME OF CUBE");
            System.out.println("PRESS 2 FOR AREA AND VOLUME OF CUBOID");
            System.out.println("PRESS 3 FOR AREA AND VOLUME OF CYLINDER");
            System.out.println("PRESS 4 FOR AREA AND VOLUME OF CONE");
            System.out.println("PRESS 5 FOR AREA AND VOLUME OF SPHERE");
            System.out.println("PRESS 6 FOR AREA AND VOLUME OF PYRAMID");
            e = Integer.parseInt(br.readLine());
            switch(e)
            {
                case 1: System.out.println("ENTER THE SIDE OF CUBE : ");
                b = Integer.parseInt(br.readLine());
                tsac = 6*b*b;
                System.out.println(" TOTAL SURFACE AREA OF CUBE : "+tsac);
                vc = b*b*b;
                System.out.println(" VOLUME OF CUBE : "+vc);
                break;
                
                case 2:
                System.out.println("ENTER THE THREE SIDE OF CUBOID");
                b = Integer.parseInt(br.readLine());
                c = Integer.parseInt(br.readLine());
                d = Integer.parseInt(br.readLine());
                tsacu = 2*((b*c) + (c*d) + (d*b));
                System.out.println(" TOTAL SURFACE AREA OF CUBOID : "+tsacu);
                vcu = b*c*d;
                System.out.println(" VOLUME OF CUBOID : "+vcu);
                break;
                
                case 3: 
                System.out.println("ENTER THE RADIUS OF CYLINDER");
                b = Integer.parseInt(br.readLine());
                System.out.println("ENTER THE HEIGHT OF CYLINDER");
                c = Integer.parseInt(br.readLine());
                vcy = 22*b*b*c/7;
                System.out.println(" VOLUME OF CYLINDER : "+vcy);
                break;
                
                case 4: 
                System.out.println("ENTER THE RADIUS OF CONE");
                b = Integer.parseInt(br.readLine());
                System.out.println("ENTER THE HEIGHT OF CONE");
                c = Integer.parseInt(br.readLine());
                vco = 22*b*b*c/21;
                System.out.println(" VOLUME OF CONE : "+vco);
                break; 
                
                case 5: 
                System.out.println("ENTER THE RADIUS OF SPHERE");
                b = Integer.parseInt(br.readLine());
                vsp = 4*b*b*b*22/21;
                System.out.println(" VOLUME OF SPHERE : "+vsp);
                break; 
                
                case 6: 
                System.out.println("ENTER THE SIDE OF BASE OF PYRAMID");
                b = Integer.parseInt(br.readLine());
                pa = 3.14*b*b;
                System.out.println("ENTER THE HEIGHT OF PYRAMID");
                c = Integer.parseInt(br.readLine());
                vp = 1*pa*c/3;
                System.out.println(" VOLUME OF PYRAMID : "+vp);
                break; 
                
                default:
            }
            System.out.println(" THANKS ");
           
        }
    }
                
              
                
                
                