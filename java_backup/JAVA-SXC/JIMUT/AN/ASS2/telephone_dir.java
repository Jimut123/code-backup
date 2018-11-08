/*
* Author : Jimut Bahan Pal
* Prog : Telephone directory
* July, 2018
*/
import java.io.*;
import java.lang.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/****************************************

Name : Length : 20 chars
E-mail : 45 chars
Phone : 13 chars 
Menu :
	1. Add record(s)
	2. Display Record(s)
	3. Search Record(s)
	4. Modify Record(s)
	5. Delete Record(s)
	6. Backup Copy File
	7. Exit

****************************************/

class Telephone_Dir 
{
	public static void main(String args[])throws IOException
	{
		int choice;
		int choice1=1;
		String inpfname;
		char ch;
		long i;
		String rec[] = new String[100];
		InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);

        Telephone_Dir ob = new Telephone_Dir();
        System.out.println("\n Enter the file name to be stored : ");
	    inpfname = cd.readLine();
        
        while(choice1==1)
        {
        	System.out.println("\nEnter :\n[1] Add record(s)\n[2] Display Record(s)\n[3] Search Record(s)\n ");
       		System.out.println("[4] Modify Record(s)\n[5] Delete Record(s)\n[6] Backup Copy File\n[7] Exit  :::\n");
        	choice=Integer.parseInt(cd.readLine());
	        switch(choice)
	        {
	        	case 1:
	        	{
	        		System.out.println("\n Enter the records : ");
	        		String email,name,phone;
					System.out.println("\n Enter the name :");
					name = cd.readLine();
					System.out.println("\n Enter the e-mail :");
					email = cd.readLine();
					System.out.println("\n Enter the phone :");
					phone = cd.readLine();
					File file = new File(inpfname);
     			    FileWriter fw = new FileWriter(file,true);
					fw.write(name+"    "+email+"    "+phone+"\n");
					fw.flush();
					fw.close();
	        	}
	        	break;
	        	case 2:
	        	{
	        		System.out.println("\n Existing records :: \n");
					RandomAccessFile fp1 = new RandomAccessFile (inpfname,"r");
					for(i=0;i<fp1.length();i++)
					{
						fp1.seek(i);
						ch = (char)fp1.read();
						System.out.print(ch);
					}
	        	}
	        	break;
	        	case 3:
	        	{
	        		String emsr;
	        		System.out.println("\n Searching records :: \n");
	        		System.out.println("\n enter an email addr to search records :: \n");
	        		emsr = cd.readLine();

	        	}
	        	break;
	        	case 4:
	        	{

	        	}
	        	break;
	        	case 5:
	        	{

	        	}
	        	break;
	        	case 6:
	        	{
	        		System.out.println("Backing up db file :");
	        		System.out.println("Enter the backing up db file name :");
	        		String bckup = cd.readLine();
	        		FileInputStream fp1_1 = new FileInputStream(inpfname);
			        FileOutputStream fp2_1 = new FileOutputStream(bckup);
			        long n=0;
			        char ch2;
			        while((ch2=(char)fp1_1.read())!=-1)	//EOF is -1
			        {
			        	ch2 = (char)ch2;
			        	fp2_1.write(ch2);
			        	System.out.println("dd");
			        	n++;
			        }
			        fp1.close();
			        fp2.close();
			        System.out.println("Size of < "+bckup+" >= "+n+" Bytes");
	        	}
	        	break;
	        	case 7:
	        	{
	        		System.out.println("Exiting ... by saving progress ..");
	        		choice1=1;
	        	}
	        	break;
	        	default: System.out.println("Wrong choice!");
	        }
	        System.out.println("\n Enter 1 to continue : ");
	        choice1 = Integer.parseInt(cd.readLine());
	        if(choice1 == 1)
	        {
	        	System.out.println("Exiting ... by saving progress ..");
	        }
	    
	    }
	}
}
