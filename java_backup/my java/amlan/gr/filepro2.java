package gr;

//Reading from file
import java.io.*;
class filepro2
{
static String filename="student";
FileInputStream fw;
DataInputStream dw;
FileOutputStream fw1;
DataOutputStream dw1;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int p;
public void main()throws IOException
{
int x;
p=0;
do
{
    System.out.println("Press 1 for insert into file.....");
    System.out.println("Press 2 for display the  records.....");
    System.out.println("Press 3 for edit a record.....");
    System.out.println("Press 4 for delete a record.....");
    System.out.println("Press 5 for quit the system");
    System.out.println("Enter choice:");
    x=Integer.parseInt(br.readLine());
    switch(x)
    {
        case 1: insert();
                 break;
        case 2: disp();
                 break;
        case 3: edit();
                break;
        case 4: del();
                break;
        case 5: System.exit(0);
    }
}while(true);
}
void insert() 
{
String name,roll,cl,ch;
int mr;
try
{
fw1=new FileOutputStream(filename);
dw1=new DataOutputStream(fw1);
while(true)
{
System.out.println("Give name:");
name=br.readLine();
System.out.println("Give roll:");
roll=br.readLine();
System.out.println("Give marks:");
mr=Integer.parseInt(br.readLine());
System.out.println("Give class:");
cl=br.readLine();
dw1.writeUTF(name);
dw1.writeUTF(roll);
dw1.writeInt(mr);
dw1.writeUTF(cl);
p++;
System.out.println("Want another(Yes/NO):");
ch=br.readLine();
if(ch.compareTo("N")==0 || ch.compareTo("NO")==0 || ch.compareTo("n")==0 ||ch.compareTo("No")==0 ||ch.compareTo("nO")==0)
break;
}
System.out.println("Total Records:"+p);
dw.close();
fw.close();
}
catch(Exception e)
{
}
}
void disp()throws IOException
{

try
{
 fw=new FileInputStream(filename);
 dw=new DataInputStream(fw);
 boolean EOF=false;
 String name,roll,cl,ch;
int mr;
while(!EOF)
{
name=dw.readUTF();
roll=dw.readUTF();
mr=dw.readInt();
cl=dw.readUTF();

System.out.println("Name:"+name);
System.out.println("Roll:"+roll);
System.out.println("Marks:"+mr);
System.out.println("Class:"+cl);

}
fw.close();
dw.close();
EOF=true;
}
catch(EOFException e)
{
System.out.println("End of file.......");

}
}
void edit()throws IOException
{
    
 fw1=new FileOutputStream("s1");
dw1=new DataOutputStream(fw1);  
 fw=new FileInputStream(filename);
 dw=new DataInputStream(fw);
 boolean EOF=false;
 String name,roll,cl,r;
int mr,c;
System.out.println("Enter roll:");
r=br.readLine();
name=roll=cl="";
c=0;
while(!EOF)
{
name=dw.readUTF();
roll=dw.readUTF();
mr=dw.readInt();
cl=dw.readUTF();

if(r.equalsIgnoreCase(roll)==true)
{
 System.out.println("Your data is......");
 System.out.println("Name:"+name);
System.out.println("Roll:"+roll);
System.out.println("Marks:"+mr);
System.out.println("Class:"+cl);

System.out.println("Start editing......");
System.out.println("Give name:");
name=br.readLine();
System.out.println("Give roll:");
roll=br.readLine();
System.out.println("Give marks:");
mr=Integer.parseInt(br.readLine());
System.out.println("Give class:");
cl=br.readLine();

dw1.writeUTF(name);
dw1.writeUTF(roll);
dw1.writeInt(mr);
dw1.writeUTF(cl);

}
else
{
dw1.writeUTF(name);
dw1.writeUTF(roll);
dw1.writeInt(mr);
dw1.writeUTF(cl);

} 
c++;
System.out.println(c);
if(c==p)
break;
}   
fw1.close();
dw1.close();
fw.close();
dw.close();
EOF=true;
fw1=new FileOutputStream(filename);
dw1=new DataOutputStream(fw1);  
 fw=new FileInputStream("s1");
 dw=new DataInputStream(fw);
 EOF=false;
 c=0;
 while(!EOF)
{
   
name=dw.readUTF();
roll=dw.readUTF();
mr=dw.readInt();
cl=dw.readUTF();
dw1.writeUTF(name);
dw1.writeUTF(roll);
dw1.writeInt(mr);
dw1.writeUTF(cl);
c++;
System.out.println("Updated Record no:"+c);
if(c==p)
break;

}
 fw1.close();
dw1.close();
fw.close();
dw.close();
EOF=true;
}
void del()throws IOException
{
    
 fw1=new FileOutputStream("s1");
dw1=new DataOutputStream(fw1);  
 fw=new FileInputStream(filename);
 dw=new DataInputStream(fw);
 boolean EOF=false;
 String name,roll,cl,r,ch;
int mr,c;
System.out.println("Enter roll:");
r=br.readLine();
name=roll=cl="";
c=0;
while(!EOF)
{
name=dw.readUTF();
roll=dw.readUTF();
mr=dw.readInt();
cl=dw.readUTF();

if(r.equalsIgnoreCase(roll)==true)
{
 System.out.println("Your data is......");
 System.out.println("Name:"+name);
System.out.println("Roll:"+roll);
System.out.println("Marks:"+mr);
System.out.println("Class:"+cl);
break;
}
}
fw.close();
dw.close();
EOF=true;
System.out.println("Want to delete(y/n):");
ch=br.readLine();
if(ch.equalsIgnoreCase("y")==true)
{
fw=new FileInputStream(filename);
 dw=new DataInputStream(fw);  
 EOF=false;
 while(!EOF)
{
name=dw.readUTF();
roll=dw.readUTF();
mr=dw.readInt();
cl=dw.readUTF();
if(r.equalsIgnoreCase(roll)!=true)
{

dw1.writeUTF(name);
dw1.writeUTF(roll);
dw1.writeInt(mr);
dw1.writeUTF(cl);

}
c++;
//System.out.println(c);
if(c==p)
break;
} 
fw1.close();
dw1.close();
fw.close();
dw.close();
EOF=true;
}
else
{
 fw1.close();
dw1.close();
fw.close();
dw.close();
EOF=true;
return;
}   
fw1=new FileOutputStream(filename);
dw1=new DataOutputStream(fw1);  
 fw=new FileInputStream("s1");
 dw=new DataInputStream(fw);
 EOF=false;
 c=0;
 while(!EOF)
{
   
name=dw.readUTF();
roll=dw.readUTF();
mr=dw.readInt();
cl=dw.readUTF();
dw1.writeUTF(name);
dw1.writeUTF(roll);
dw1.writeInt(mr);
dw1.writeUTF(cl);
c++;
System.out.println("Updated Record no:"+c);
if(c==(p-1))
break;

}
 fw1.close();
dw1.close();
fw.close();
dw.close();
EOF=true;
}
}
