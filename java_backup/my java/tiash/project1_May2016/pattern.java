package project1_May2016;

//To print a pattern
import java.io.*;
class pattern
{
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j;
        //checking the loop
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                
                
                    System.out.print(j);
                }
                System.out.println("");
            }
        }
    }
