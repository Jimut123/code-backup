import java.io.*;
class abc3
{DataInputStream d=new DataInputStream(System.in);
 public static void main(String args[])throws IOException
  {   int f;
     vowelcheck obj=new vowelcheck();
     obj.input();
     obj.disp();
     f=obj.vow_chk();
     System.out.println("no of vowels="+f);
    
    }
}
   
      
