import java.io.*;
class file
{
    
    FileOutputStream fo;
    DataOutputStream de;
    FileOutputStream fo1;
    DataOutputStream de1;
    int roll,srl,avg,marks1,marks2;
    String name,add,grade,sub1,sub2;
    int c;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //System.out.print("enter the no. of students");
   //n=Integer.parseInt(br.readLine());
   file()
      {
          try
          {
     fo=new FileOutputStream("STUDENT.TXT");
     de=new DataOutputStream(fo);
     fo1=new FileOutputStream("MARKS.TXT");
     de1=new DataOutputStream(fo1);
     c=0;
    }
    catch(Exception e)
    {
    }
    }
    void input()throws IOException
    {
        String Y;
        Y="y";
        while(Y.equalsIgnoreCase("Y")==true)
        {
            c++;
            System.out.println("Enter Roll:");
            roll=Integer.parseInt(br.readLine());
            System.out.println("Enter Name:");
            name=br.readLine();
            System.out.println("Enter Address:");
            add=br.readLine();
            System.out.println("Enter Serial no:");
            srl=Integer.parseInt(br.readLine());
            System.out.println("Enter Subject:");
            sub1=br.readLine();
            System.out.println("Enter Subject:");
            sub2=br.readLine();
            marks1=Integer.parseInt(br.readLine());
            marks2=Integer.parseInt(br.readLine());
            avg=(marks1+marks2)/2;
            if(avg<30)
            {
                grade="fail";
            }
            if(avg>30)
            {
                grade="pass";
            }
            de.writeInt(srl);
            de.writeUTF(name);
            de.writeUTF(add);
            de1.writeInt(roll);
            de1.writeUTF(sub1);
            de1.writeUTF(sub2);
            de1.writeInt(avg);
            de1.writeUTF(grade);
            de1.writeInt(marks1);
            de1.writeInt(marks2);
            System.out.println("Another record press y");
            Y=br.readLine();
        }
        de.close();
            de1.close();
    }
    void display()throws IOException
    {
        FileInputStream fi=new FileInputStream("STUDENT.TXT");
        FileInputStream fi1=new FileInputStream("MARKS.TXT");
        DataInputStream di=new DataInputStream(fi);
        DataInputStream di1=new DataInputStream(fi1);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i;
        i=1;
        while(i<=c-1)
        {
           
            srl=di.readInt();
             name=di.readUTF();
            add=di.readUTF();
            
            System.out.println(name);
            System.out.println(add);
            System.out.println(srl);
            System.out.println(roll);
            roll=di1.readInt();
            sub1=di1.readUTF();
            sub2=di1.readUTF();
            avg=di1.readInt();
            grade=di1.readUTF();
            marks1=di1.readInt();
            marks2=di1.readInt();
            System.out.println(roll);
            System.out.println(sub1);
            System.out.println(sub2);
            System.out.println(avg);
            System.out.println(grade);
            System.out.println(marks1);
            System.out.println(marks2);
            i++;
        }
        //eof=false;
         //while(!eof)
        //{
            
                    //}
                    di.close();
                    di1.close();
                    
                }     
                void Search()throws IOException
                {
                 FileInputStream fr=new FileInputStream("STUDENT.TXT");
                DataInputStream de=new DataInputStream(fr);
                FileInputStream fi1=new FileInputStream("MARKS.TXT");
                 DataInputStream di1=new DataInputStream(fi1);
                System.out.println("SEARCHING CODE");
                int s2;
                s2=Integer.parseInt(br.readLine());
                int i;
                i=1;
                while(i<=c-1)
                {
                    try
                    {
                        
                        srl=de.readInt();
                        name=de.readUTF();
                        add=de.readUTF();
                        roll=di1.readInt();
            sub1=di1.readUTF();
            sub2=di1.readUTF();
            avg=di1.readInt();
            grade=di1.readUTF();
            marks1=di1.readInt();
            marks2=di1.readInt();
                        
                        if(s2==srl)
                        {
                            System.out.println("Name:"+name);
                            System.out.println("add:"+add);
                            System.out.println("Serial no:"+srl);
                            
            System.out.println(roll);
            System.out.println(sub1);
            System.out.println(sub2);
            System.out.println(avg);
            System.out.println(grade);
            System.out.println(marks1);
            System.out.println(marks2);
                            break;
                            //System.out.println("roll:"+roll);
                        }
                    }
                        catch(Exception e)
                        {
                        }
                        i++;
                    }
                    
                    de.close();
                di1.close();
            }
            void update()throws IOException
                {
                 FileInputStream fr=new FileInputStream("STUDENT.TXT");
                DataInputStream de=new DataInputStream(fr);
                FileInputStream fi1=new FileInputStream("MARKS.TXT");
                 DataInputStream di1=new DataInputStream(fi1);
                 FileOutputStream fr2=new FileOutputStream("STUDENT1.TXT");
                DataOutputStream de2=new DataOutputStream(fr2);
                FileOutputStream fr3=new FileOutputStream("MARKS1.TXT");
                DataOutputStream de3=new DataOutputStream(fr3);
                System.out.println("SEARCHING CODE");
                int s2;
                s2=Integer.parseInt(br.readLine());
                int i,f;
                i=1;
                String s5;
                f=0;
                while(i<=c-1)
                {
                    try
                    {
                        
                        srl=de.readInt();
                        name=de.readUTF();
                        add=de.readUTF();
                        roll=di1.readInt();
            sub1=di1.readUTF();
            sub2=di1.readUTF();
            avg=di1.readInt();
            grade=di1.readUTF();
            marks1=di1.readInt();
            marks2=di1.readInt();
                        
                        if(s2==srl)
                        {
                            System.out.println("Name:"+name);
                            System.out.println("add:"+add);
                            System.out.println("Serial no:"+srl);
                            
            System.out.println(roll);
            System.out.println(sub1);
            System.out.println(sub2);
            System.out.println(avg);
            System.out.println(grade);
            System.out.println(marks1);
            System.out.println(marks2);
                           System.out.println("Want to edit/update:");
                           s5=br.readLine();
                           if(s5.equalsIgnoreCase("Y")==true)
                           {
                               f=1;
                               System.out.println("Enter Roll:");
            roll=Integer.parseInt(br.readLine());
            System.out.println("Enter Name:");
            name=br.readLine();
            System.out.println("Enter Address:");
            add=br.readLine();
            System.out.println("Enter Serial no:");
            srl=Integer.parseInt(br.readLine());
            System.out.println("Enter Subject:");
            sub1=br.readLine();
            System.out.println("Enter Subject:");
            sub2=br.readLine();
            marks1=Integer.parseInt(br.readLine());
            marks2=Integer.parseInt(br.readLine());
            avg=(marks1+marks2)/2;
            if(avg<30)
            {
                grade="fail";
            }
            if(avg>30)
            {
                grade="pass";
            }
                               de2.writeInt(srl);
                               de2.writeUTF(name);
                               de2.writeUTF(add);
                               de3.writeInt(roll);
                               de3.writeUTF(sub1);
                               de3.writeUTF(sub1);
                               de3.writeInt(avg);
                               de3.writeUTF(grade);
                               de3.writeInt(marks1);
                               de3.writeInt(marks2);
                            //System.out.println("roll:"+roll);
                        }
                    }
                        else
                        {
                            de2.writeInt(srl);
                               de2.writeUTF(name);
                               de2.writeUTF(add);
                               de3.writeInt(roll);
                               de3.writeUTF(sub1);
                               de3.writeUTF(sub1);
                               de3.writeInt(avg);
                               de3.writeUTF(grade);
                               de3.writeInt(marks1);
                               de3.writeInt(marks2);
                            }
                    }
                        catch(Exception e)
                        {
                        }
                        i++;
                    }
                    
                    de.close();
                di1.close();
                de3.close();
                de2.close();
                if(f==1)
                updatefile();
            }
            void updatefile()
            {
                File f=new File("STUDENT1.TXT");
                File f1=new File("STUDENT.TXT");
                 File f2=new File("MARKS1.TXT");
                File f3=new File("MARKS.TXT");
                try
                {
                    if(f1.delete())
                     {
                         System.out.println("Updation of Student file starts....");
                         f1=new File("STUDENT.TXT");
                    if(f.renameTo(f1))
                     System.out.println("Update Student file successfully....");
                    else
                    System.out.println("Update Student file failed....");
                }
                else 
                   System.out.println("Updation of Student file cannot start....");
                   if(f3.delete())
                     {
                         System.out.println("Updation of Marks file starts....");
                         f3=new File("MARKS.TXT");
                    if(f2.renameTo(f3))
                     System.out.println("Update Marks file successfully....");
                    else
                    System.out.println("Update Marks file failed....");
                }
                else 
                   System.out.println("Updation of Marks file cannot start....");
                }
                catch(Exception e)
                {
                }
            }
            }
        
                
                  
                            

            

        
    
