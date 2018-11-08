 

import java.io.*;
class Digital
{
    int n,r;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void accept()throws IOException
    {
        System.out.println("enter a no.");
        n=Integer.parseInt(br.readLine());
        int n1=n,ch;
        r=0;
        while(n1>0)
        {
            int d=n1%10;
            r=(r*10)+d;
            n1=n1/10;
        }
        System.out.println(r);
        while(r>0)
        {
            ch=r%10;
            switch(ch)
            {
                case 1:one();
                break;
                case 2:two();
                break;
                case 3:three();
                break;
                case 4:four();
                break;
                case 5:five();
                break;
                case 6:six();
                break;
                case 7:seven();
                break;
                case 8:eight();
                break;
                case 9:nine();
                break;
                case 0:zero();
                break;
            }
            r=r/10;
        }
    }

    public void one()
    {
        String arr[][]=new String[7][4];
        int i,j;
        for(i=0;i<7;i++)
            for(j=0;j<4;j++)
                arr[i][j]=" ";
        for(i=0;i<7;i++)
        {
            arr[i][0]="*";
        }
        show(arr);
    }

    public void two()
    {
        String arr[][]=new String[7][4];
        int i,j;
        for(i=0;i<7;i++)
            for(j=0;j<4;j++)
                arr[i][j]=" ";

        for(i=0;i<4;i++)
            arr[0][i]="*";
        for(i=1;i<4;i++)
            arr[i][3]="*";
        for(i=0;i<3;i++)
            arr[3][i]="*";
        for(i=4;i<7;i++)
            arr[i][0]="*";
        for(i=1;i<4;i++)
            arr[6][i]="*";

        show(arr); 
    }

    public void three()
    {
        String arr[][]=new String[7][4];
        int i,j;
        for(i=0;i<7;i++)
            for(j=0;j<4;j++)
                arr[i][j]=" ";

        for(i=0;i<7;i++)
            arr[i][3]="*";
        for(i=0;i<3;i++)
        {
            arr[0][i]="*";
            arr[3][i]="*";
            arr[6][i]="*";
        }
        show(arr);
    }

    public void four()
    {
        String arr[][]=new String[7][4];
        int i,j;
        for(i=0;i<7;i++)
            for(j=0;j<4;j++)
                arr[i][j]=" ";

        for(i=4;i<7;i++)
            arr[i][3]="*";
        for(i=0;i<4;i++)
            arr[i][0]="*";
        for(i=1;i<3;i++)
            arr[3][i]="*";
        show(arr);
    }

    public void five()
    {
        String arr[][]=new String[7][4];
        int i,j;
        for(i=0;i<7;i++)
            for(j=0;j<4;j++)
                arr[i][j]=" ";
        for(i=0;i<4;i++)
        {
            arr[0][i]="*";
            arr[3][i]="*";
            arr[6][i]="*";
        }
        for(i=1;i<3;i++)
            arr[i][0]="*";
        for(i=4;i<6;i++)
            arr[i][3]="*";
        show(arr); 
    }

    public void six()
    {
        String arr[][]=new String[7][4];
        int i,j;
        for(i=0;i<7;i++)
            for(j=0;j<4;j++)
                arr[i][j]=" ";
        for(i=0;i<7;i++)
            arr[i][0]="*";
        for(i=1;i<4;i++)
        {
            arr[0][i]="*";
            arr[3][i]="*";
            arr[6][i]="*";
        }
        for(i=4;i<6;i++)
            arr[i][3]="*";
        show(arr); 
    }

    public void seven()
    {
        String arr[][]=new String[7][4];
        int i,j;
        for(i=0;i<7;i++)
            for(j=0;j<4;j++)
                arr[i][j]=" ";
        for(i=0;i<7;i++)
            arr[i][3]="*";
        for(i=0;i<3;i++)
            arr[0][i]="*";
        show(arr); 
    }

    public void eight()
    {
        String arr[][]=new String[7][4];
        int i,j;
        for(i=0;i<7;i++)
            for(j=0;j<4;j++)
                arr[i][j]=" ";
        for(i=0;i<7;i++)
        {
            arr[i][0]="*";
            arr[i][3]="*";
        }
        for(i=1;i<3;i++)
        {
            arr[0][i]="*";
            arr[3][i]="*";
            arr[6][i]="*";
        }
        show(arr);
    }

    public void nine()
    {
        String arr[][]=new String[7][4];
        int i,j;
        for(i=0;i<7;i++)
            for(j=0;j<4;j++)
                arr[i][j]=" ";
        for(i=0;i<7;i++)
            arr[i][3]="*";
        for(i=0;i<3;i++)
        {
            arr[0][i]="*";
            arr[3][i]="*";
            arr[6][i]="*";
        }
        for(i=1;i<3;i++)
            arr[i][0]="*";
        show(arr); 
    }

    public void zero()
    {
        String arr[][]=new String[7][4];
        int i,j;
        for(i=0;i<7;i++)
            for(j=0;j<4;j++)
                arr[i][j]=" ";
        for(i=0;i<7;i++)
        {
            arr[i][0]="*";
            arr[i][3]="*";
        }
        for(i=1;i<3;i++)
        {
            arr[0][i]="*";
            arr[6][i]="*";
        }
        show(arr);
    }

    public void show(String arr[][])
    {
        int i,j;
        for(i=0;i<7;i++)
        {
            for(j=0;j<4;j++)
            {
                if (arr[i][j].equals("*")==true)
                    System.out.print(arr[i][j]);
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
