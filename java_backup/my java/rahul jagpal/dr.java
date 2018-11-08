class dr
{
    public static void main(int a,int b,int c,int d,int e)
   {
       int total,average;
       char grade;
       total=a+b+c+d+e;
        average=a+b+c+d+e/5;
        grade=' ';
        if(average<=30)
        grade='F';
        else
        if(average<=50)
        grade='P';
        else
        if(average<=70)
        grade='G';
        else
        if(average<=90)
        grade='S';
        else
        if(average>=90)
        grade='E';
        System.out.print(grade);
    }
}