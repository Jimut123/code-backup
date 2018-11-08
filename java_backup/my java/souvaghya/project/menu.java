package project;

import java.io.*;
class menu
{
    public static void main()throws IOException
    {
        int x;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do
        {
        System.out.println("Press 1 for check Magic number...");
        System.out.println("Press 2 for calculate tax...");
        System.out.println("Press 3 for calculate L.C.M...");
        System.out.println("Press 4 print special no 100-999");
        System.out.println("Press 5  check a number is Prime or Palindrom");
        System.out.println("Press 6  check a number is Automorphic or not");
        System.out.println("Press 7  print a pattern");
        System.out.println("Press 8  power calculate");
        System.out.println("Press 9  binary search of Array elements");
        System.out.println("Press 10  Selection sort of Array elements");
        System.out.println("Press 11  Bubble sort of Array elements");
        System.out.println("Press 12  calculate rank of students");
        System.out.println("Press 13  calculate telephone bill");
        System.out.println("Press 14  Hcf of 2 numbers");
        System.out.println("Press 15  factorial of a number");
        System.out.println("Press 16  Area of rectangle,triangle,square,circle");
        System.out.println("Press 17  Print series.........");
        System.out.println("Press 18  Calculate Sum of series.........");
        System.out.println("Press 19  Print Tribonaccie  series.........");
        System.out.println("Press 20  Print Another Pattern.........");
        System.out.println("Press 21  Example of Do-While Loop");
        System.out.println("Press 22  Example of Constructor Overloading");
        System.out.println("Press 23  Exit");
        System.out.println("Enter Your Choice:");
        x=Integer.parseInt(br.readLine());
        switch(x)
        {
            case 1:magic m=new magic();
            m.main1();
            break;
            case 2:tax m1=new tax();
            m1.main1();
            break;
            case 3:lcm m2=new lcm();
            m2.main1();
            break;
            case 4:specialno m3=new specialno();
            m3.main1();
            break;
            case 5:check m4=new check();
            m4.main1();
            break;
            case 6:automorphic m5=new automorphic();
            m5.main1();
            break;
            case 7:ftoo m6=new ftoo();
            m6.main1();
            break;
            case 8:power m7=new power();
            m7.main1();
            break;
            case 9:binary m8=new binary();
            m8.main1();
            break;
            case 10:selectionsort m9=new selectionsort();
            m9.main1();
            break;
            case 11:bubble m10=new bubble();
            m10.main1();
            break;
            case 12:rank m11=new rank();
            m11.main();
            break;
            case 13:bill m12=new bill();
            m12.main();
            break;
            case 14:hcf m13=new hcf();
            m13.main();
            break;
            case 15:funcfactorial m14=new funcfactorial();
            m14.main();
            break;
             case 16:area m15=new area();
            m15.main();
            break; 
            case 17:seriespro m16=new seriespro();
            m16.main();
            break;
            case 18:seriesproj m17=new seriesproj();
            m17.main();
            break;
            case 19:tribonacci m18=new tribonacci();
            m18.main();
            break;
            case 20:pattern m19=new pattern();
            m19.main();
            break;
            case 21:dowhilefact m20=new dowhilefact();
            m20.main();
            break;
            case 22:add m21=new add();
            m21.main();
            break;
           case 23:System.exit(0);
            }
    }while(true);
}
}
        