
import java.io.*;
class booking
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,n;
    class book
    {
    String rc;
    String tc;
    String tnm;
    String rt;
    String cc;
    String cusname;
    String age; 
    String date;
    String dtime;
    int seat;
    int cno;
    int sno;
   double price;
   book()
   {
       cno=1;
       sno=0;
    }
    void input()throws IOException
    {
     
        System.out.println("Enter Route-Code:");
        rc=br.readLine();
        System.out.println("Enter Train-Code:");
        tc=br.readLine();
        System.out.println("Enter Train Name:");
        tnm=br.readLine();
        System.out.println("Enter Train Route:");
        rt=br.readLine(); 
        System.out.println("Enter Customer Code:");
        cc=br.readLine();  
        System.out.println("Enter Name:");
        cusname=br.readLine();
        System.out.println("Enter Age:");
        age=br.readLine();
        System.out.println("Enter Date of Journey:");
        date=br.readLine();  
        System.out.println("Enter Departure-Time:");
        dtime=br.readLine();   
     System.out.println("Enter no. of seat:");
     seat=Integer.parseInt(br.readLine());
     System.out.println("Enter price:");
     price=Double.parseDouble(br.readLine());
     sno++;
     if(sno>50)
     cno++;
    }
    
    int display()
    {
 System.out.println("Routecode \t\t Traincode \t\t Trainname \t\t TrainRoute \t\t Customer Code\t\t cusname \t\t age \t\t Date\t\t DepertureTime\t\t Seat\t\t Coach no\t\t Seat No \t\t Price");
 System.out.println(rc+"\t"+"\t"+tc+"\t"+"\t"+tnm+"\t"+"\t"+rt+"\t"+"\t"+cc+"\t"+"\t"+cusname+"\t"+"\t"+age+"\t"+"\t"+date+"\t"+"\t"+dtime+"\t"+"\t"+seat+"\t"+"\t"+"C"+cno+"\t"+"\t"+"S"+sno+"\t"+"\t"+price);
 return 0;
}
}
book tt[];  
void insert1()throws IOException
{
    
    System.out.println("Enter numbers of Customer to be entered:");
    n=Integer.parseInt(br.readLine());
    tt=new book[n];
    for(i=0;i<n;i++)
    {
     tt[i]=new book();
        tt[i].input();
    }
    }
void show1()
{
   for(i=0;i<n;i++)
   System.out.println(tt[i].display());
}
public  void main()throws IOException
    {
      
trainentry1 tt =new trainentry1();
tt.insert();
    tt.show();
        booking t=new booking();
      t.insert1();
      t.show1();
      //t.display();
    }
    
}
