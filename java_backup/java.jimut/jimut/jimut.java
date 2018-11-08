import java.io.*;
class jimut
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("enter no. [max 3 digit]");        
        int n=Integer.parseInt(in.readLine());
        int d[]=new int[3];
        String w1="";
        String w2="";
        String w3="";
        String w="";
        for(int i=0;i<3;i++)
        {
            d[i]=n%10;
            n=n/10;
            if(n<0)
            {
                break;
            }
        }
        int  no=(d[1]*10)+d[0];
        switch(d[2])
        {
            case 1:
                w1="one hundred";
                break;
                case 2:
                w1="two hundred";
                break;
                case 3:
                w1="three hundred";
                break;
                case 4:
                w1="four hundred";
                break;
                case 5:
                w1="five hundred";
                break;
                case 6:
                w1="six hundred";
                break;
                case 7:
                w1="seven hundred";
                break;
                case 8:
                w1="eight hundred";
                break;
                case 9:
                w1="nine hundred";
                break;
                case 0:
                w1=" ";
            }
            if(no>19 || no<11)
            {
                switch(d[1])
                {
                case 1: 
                w2="ten";
                break;
                case 2:
                w2="twenty";
                break;
                case 3:
                w2="thirty";
                break;
                case 4:
                w2="forty";
                break;
                case 5:
                w2="fifty";
                break;
                case 6:
                w2="sixty";
                break;
                case 7:
                w2="seventy";
                break;
                case 8:
                w2="eighty";
                break;
                case 9:
                w2="ninety";
                break;
                case 0:
                w2=" ";
            }
            switch(d[0])
            {
                case 1:
                w3="one";
                break;
                case 2:
                w3="two";
                break;
                case 3:
                w3="three";
                break;
                case 4:
                w3="four";
                break;
                case 5:
                w3="five";
                break;
                case 6:
                w3="six";
                break;
                case 7:
                w3="seven";
                break;
                case 8:
                w3="eight";
                break;
                case 9:
                w3="nine";
                break;
                case 0:
                w3=" ";
            }
        }
        else
        {
          
            switch(no)
            {
                case 11:
                w="eleven";
                break;
                case 12:
                w="twelve";
                break;
                case 13:
                w="thirteen";
                break;
                case 14:
                w="fourteen";
                break;
                case 15:
                w="fifteen";
                break;
                case 16:
                w="sixteen";
                break;
                case 17:
                w="seventeen";
                break;
                case 18:
                w="eighteen";
                break;
                case 19:
                w="nineteen";
                break;
            }
        }
                int sum=d[0]+d[1]+d[2];
                if(sum==0)
                {
                    System.out.println("Zero");
                }
                else
                {
                System.out.println("The number is : ");
                System.out.println(w1+" "+w2+" "+w3+" "+w);
            }
            }
        }
                   