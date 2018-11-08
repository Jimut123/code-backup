import java.io.*;
class trainfare
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,n;
    class book
    {
    String rc;
    String tc;
    String tnm;
    String rt;
    String type;
    int seat;
    int cno;
    int sno;
   double price;
   
}
trainfare()
{    
}
void show1()
{
  
    book tt[]=new book[100];
    tt[0]=new book();
     tt[0].rc="HOWDEL";
     tt[0].tc="T0001";
     tt[0].tnm= "RAJDHANI";
     tt[0].rt="HOWRAH TO DELHI VIA PATNA";
     tt[0].type="A.C-2";
     tt[0].seat=100;
     tt[0].cno=2;
     tt[0].sno=50;
     tt[0].price=1200;
      tt[1]=new book();
     tt[1].rc="HOWDEL";
     tt[1].tc="T0002";
     tt[1].tnm= "KALKA";
     tt[1].rt="HOWRAH TO DELHI";
     tt[1].type="A.C-2";
     tt[1].seat=150;
     tt[1].cno=2;
     tt[1].sno=75;
     tt[1].price=1000;
      tt[2]=new book();
     tt[2].rc="HOWMUM";
     tt[2].tc="T0001";
     tt[2].tnm= "GITANJALI";
     tt[2].rt="HOWRAH TO MUMBAI VIA NAGPUR";
     tt[2].type="A.C-2";
     tt[2].seat=110;
     tt[2].cno=2;
     tt[2].sno=55;
     tt[2].price=1100;
      tt[3]=new book();
      tt[3].rc="HOWMUM";
     tt[3].tc="T0002";
     tt[3].tnm= "MUMBAI MAIl";
     tt[3].rt="HOWRAH TO MUMBAI VIA ALLAHABAD";
     tt[3].type="A.C-2";
     tt[3].seat=120;
     tt[3].cno=2;
     tt[3].sno=60;
     tt[3].price=1500;
     tt[4]=new book();
      tt[4].rc="HOWCHEN";
     tt[4].tc="T0001";
     tt[4].tnm= "KARAMANDAL";
     tt[4].rt="HOWRAH TO CHENNAI";
     tt[4].type="A.C-2";
     tt[4].seat=160;
     tt[4].cno=2;
     tt[4].sno=80;
     tt[4].price=1300;
      tt[5]=new book();
      tt[5].rc="HOWCHEN";
     tt[5].tc="T0002";
     tt[5].tnm= "CHENNAI MAIL";
      tt[5].rt="HOWRAH TO CHENNAI";
      tt[5].type="A.C-2";
      tt[5].seat=210;
      tt[5].cno=2;
      tt[5].sno=110;
      tt[5].price=1500;
      tt[6]=new book();
      tt[6].rc="HOWBAN";
     tt[6].tc="T0001";
     tt[6].tnm= "YASHWANTPUR";
      tt[6].rt="HOWRAH TO BENGALURU";
      tt[6].type="A.C-2";
      tt[6].seat=100;
      tt[6].cno=2;
      tt[6].sno=50;
      tt[6].price=980;
      tt[7]=new book();
      tt[7].rc="HOWBAN";
     tt[7].tc="T0002";
     tt[7].tnm= "HOWRAH GUWAHATI BANGALORE";
      tt[7].rt="HOWRAH TO GUWAHATI TO BANGALURU";
      tt[7].type="A.C-2";
     tt[7].seat=150;
      tt[7].cno=2;
      tt[7].sno=75;
      tt[7].price=1300;
      tt[8]=new book();
      tt[8].rc="HOWPUR";
     tt[8].tc="T0001";
     tt[8].tnm= "JAGANNATH";
      tt[8].rt="HOWRAH TO PURI";
      tt[8].type="A.C-2";
     tt[8].seat=300;
      tt[8].cno=2;
      tt[8].sno=150;
      tt[8].price=1390;
      tt[9]=new book();
      tt[9].rc="HOWPUR";
     tt[9].tc="T0002";
     tt[9].tnm= "PURI EXPRESS";
      tt[9].rt="HOWRAH TO PURI";
      tt[9].type="A.C-2";
     tt[9].seat=400;
      tt[9].cno=2;
      tt[9].sno=200;
      tt[9].price=1040;
    String s;
String s1[]=new String[100];
int x,y,y1,f1;
y1=0;
for(x=0;x<10;x++)
{
    //for(y=0;y<4;y++)
        //{
             
            //System.out.println("Routecode \t\t Traincode \t\t Trainname \t\t TrainRoute \t\t Type\t\t Seat \t\t Number of coachs \t\t Number of seat\t\t Price");
 //System.out.println(tt[y].rc+"\t"+"\t"+tt[y].tc+"\t"+"\t"+tt[y].tnm+"\t"+"\t"+tt[y].rt+"\t"+"\t"+tt[y].type+"\t"+"\t"+tt[y].seat+"\t"+"\t"+tt[y].cno+"\t"+"\t"+tt[y].sno+"\t"+"\t"+tt[y].price);

//}
    s=tt[x].rc;
    f1=0;
    for(int z=0;z<y1;z++)
    {
        if(s.equalsIgnoreCase(s1[z])==true)
        {
            f1=1;
            break;
        }
    }
    if(f1==0)
    {
        for(y=0;y<10;y++)
        {
              if(s.equalsIgnoreCase(tt[y].rc)==true)
              {
            System.out.println("Routecode \t\t Traincode \t\t Trainname \t\t TrainRoute \t\t Type\t\t Seat \t\t Number of coachs \t\t Number of seat\t\t Price");
 System.out.println(tt[y].rc+"\t"+"\t"+tt[y].tc+"\t"+"\t"+tt[y].tnm+"\t"+"\t"+tt[y].rt+"\t"+"\t"+tt[y].type+"\t"+"\t"+tt[y].seat+"\t"+"\t"+tt[y].cno+"\t"+"\t"+tt[y].sno+"\t"+"\t"+tt[y].price);
}
}
 s1[y1++]=s;   
}
}
    
}     

public  void main()throws IOException
    {
      
trainfare tt3 =new trainfare();
    tt3.show1();
        
      //t.display();
    }
    
}
