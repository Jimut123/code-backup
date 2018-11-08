import java.io.*;
class n_daysahead
{//declaration of class
   public static void main(String args[])throws IOException
   {//declaration of main
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("DAY NUMBER");
        int d=Integer.parseInt(br.readLine());     
        if(d<1||d>366)
        {//checking validity of day number
            System.out.println("error: enter a number between 1 to 366");//printing error
            System.exit(1);
        }//end of loop
        System.out.println("YEAR");
        int y=Integer.parseInt(br.readLine());//inisialisation of variable
        int p=0;//inisialisation of variable
        int x=d;//inisialisation of variable
        int m[]={31,28,31,30,31,30,31,31,30,31,30,31};//inisialisation of variables
        String b[]={"January","February","March","April","May","June","July","August","September","October","November","December"};//inisialisation of variable
        if(y%4==0)//checking for leap year
        m[1]=29;
        for(int i=0;i<12;i++)
        {//loop to find and print the date
            if(d>=0&&d<=m[i])
            {//loop to find the month and print date
                if (d==1||d==21||d==31)
                System.out.println(d+"st "+b[i]+","+y);
                else
                if (d==2||d==22)
                System.out.println(d+"nd "+b[i]+","+y);
                else
                if (d==3)
                System.out.println(d+"rd "+b[i]+","+y);
                else
                System.out.println(d+"th "+b[i]+","+y);
                break;
            }
            else
            {//checking for next month
                d=d-m[i];
                p++;
            }//end of loop
        }//end of loop
        System.out.println("DATE AFTER(N)");
        int n=Integer.parseInt(br.readLine());
        if(n<1||n>100)
        {//checking validity of year
            System.out.println("error: enter a number between 1 to 100");
            System.exit(1);
        }//end of loop
        System.out.println("DATE AFTER "+n+" DAYS");
        x=x+n;
        int k=0;
        if(x>=366)
        {//bringing x in limit
            x=x-366;
            k++;
        }//end of loop
        for(int i=0;i<12;i++)
        {//loop to find and print the date
            if(x>=0&&x<=m[i])
            {//loop to find the month and print date
                if(k!=0)
                {//loop to print date if the date goes to the next year
                     if (x==1||x==21||x==31)
                     System.out.println(x+"st "+b[i]+","+(y+1));
                     else
                     if (x==2||x==22)
                     System.out.println(x+"nd "+b[i]+","+(y+1));
                     else
                     if (x==3)
                     System.out.println(x+"rd "+b[i]+","+(y+1));
                     else
                     System.out.println(x+"th "+b[i]+","+(y+1));
                    }//end of loop
                else
                {//loop to print date if the date remains in the same year
                    if (x==1||x==21||x==31)
                    System.out.println(x+"st "+b[i]+","+y);
                    else
                    if (x==2||x==22)
                    System.out.println(x+"nd "+b[i]+","+y);
                    else
                    if (x==3)
                    System.out.println(x+"rd "+b[i]+","+y);
                    else
                    System.out.println(x+"th "+b[i]+","+(y));
                }//end of loop
                break;
            }//end of loop
            else
            {//checking for next month
                x=x-m[i];
            }//end of loop
        }//end of loop
   }//end of main
}//end of class