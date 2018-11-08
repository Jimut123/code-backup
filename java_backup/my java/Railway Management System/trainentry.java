import java.io.*;
class trainentry
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String trainname,route,arrivalday,departureday,arrivaltime,departuretime,routecode,traincode;
    int seat;
    String ch;
    void input()throws IOException
    {
      ch="YES";
        while(ch.equalsIgnoreCase("YES")==true ||ch.equalsIgnoreCase("yes")==true ||ch.equalsIgnoreCase("Yes")==true)   
       {
        System.out.println("Enter Route-Code:");
        routecode=br.readLine();
        System.out.println("Enter Train-Code:");
        traincode=br.readLine();
        System.out.println("Enter Train Name:");
        trainname=br.readLine();
        System.out.println("Enter Train Route:");
        route=br.readLine();  
        System.out.println("Enter Arrival-Day:");
        arrivalday=br.readLine();
        System.out.println("Enter Departure-Day:");
        departureday=br.readLine();
        System.out.println("Enter Arrival-Time:");
        arrivaltime=br.readLine();  
        System.out.println("Enter Departure-Time:");
        departuretime=br.readLine();   
     System.out.println("Enter no. of seat:");
     seat=Integer.parseInt(br.readLine());
     save();
     System.out.println("Enter Another Record:");
     ch=br.readLine();
     //if(ch.equalsIgnoreCase("NO")==true ||ch.equalsIgnoreCase("no")==true ||ch.equalsIgnoreCase("No")==true)
      //break;
      }
      display();
    }
    void display()throws IOException
    {
        

 boolean EOF=false;
 String filename="train_Entry";
FileInputStream fr=new FileInputStream(filename);
DataInputStream de=new DataInputStream(fr);
routecode="";
while(!EOF)
{
routecode=de.readUTF();
traincode=de.readUTF();
trainname=de.readUTF();
route=de.readUTF();
arrivalday=de.readUTF();
departureday=de.readUTF();
arrivaltime=de.readUTF();
departuretime=de.readUTF();
seat=de.readInt();
System.out.println("Route-Code:"+routecode);
     System.out.println("Train-Code:"+traincode);   
     System.out.println("Train-Name:"+trainname);   
     System.out.println("Route:"+route);   
     System.out.println("Arrival-Day:"+arrivalday);   
     System.out.println("Departure-Day:"+departureday);   
     System.out.println("Arrival-Time:"+arrivaltime);   
     System.out.println("Departure-Time:"+departuretime);   
     System.out.println("Seat:"+seat);
}
de.close();  
fr.close();
    
    //EOF=true;
    

  
}

    void save()throws IOException
    {
        String filename="train_Entry";
        FileOutputStream fw=new FileOutputStream(filename,true);
DataOutputStream dw=new DataOutputStream(fw);
//System.out.println(routecode+"rc");
//System.out.println(traincode+"tc");
//System.out.println(trainname+"tn");
//System.out.println(route+"rt");
//System.out.println(arrivalday+"ad");
//System.out.println(departureday+"dd");
//System.out.println(arrivaltime+"at");
//System.out.println(departuretime+"dt");
//System.out.println(seat+"st");
dw.writeUTF(routecode);
//dw.flush();
dw.writeUTF(traincode);

dw.writeUTF(trainname);
dw.writeUTF(route);
dw.writeUTF(arrivalday);
dw.writeUTF(departureday);
dw.writeUTF(arrivaltime);
dw.writeUTF(departuretime);
dw.writeInt(seat);
//dw.writeUTF("");
dw.close();
fw.close();


}
        
    public static void main(String args[])throws IOException
    {
      trainentry t=new trainentry();
      t.input();
      //t.display();
    }
    
}     
        