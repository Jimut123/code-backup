import java.io.*;
class Bestfour extends IscScore
{
void bestsubjects()throws IOException
{
    int s=0,temp;
    InputMarks();
    for(i=0;i<6;i++)
    s=s + point(number[i][1]);
    System.out.println("TOTAL POINTS ="+s);
    
     for(i=0;i<6;i++)   
     {
        for(j=0;j<6-i-1;j++)   
     {
        if(number[j][1]>number[j+1][1])
        {
            temp=number[j][1];
            number[j][1]=number[j+1][1];
            number[j+1][1]=temp;
            temp=number[j][0];
            number[j][0]=number[j+1][0];
            number[j+1][0]=temp;
        }}
        
    }
    disp();
}
void disp()
{   System.out.println("top four subject codes are ");
    for(i=5;i>=0;i--)
    {
        System.out.println(number[i][1]+" ");
    }
}
}