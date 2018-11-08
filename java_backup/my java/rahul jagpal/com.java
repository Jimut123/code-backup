class com
{
    public static void main(int sales)
    {
        int com;
        com=0;
        if(sales<=10000)
        com=(sales*10)/100;
        else
        if(sales<=25000)
        com=(sales*15)/100;
        else
        if(sales<=40000)
        com=(sales*30)/100;
        else
        if(sales>=40000)
        com=(sales*40)/100;
        System.out.print(com);
    }
}