class da
{
    public static void main(int basic)
    {
        int da;
        int hra;
        int ta;
        da=hra=ta=0;
        if(basic<=30000)
        {
da=(basic*10)/100;
hra=5000;
ta=(da*(int)8.5)/100;
}
else
if(basic<=100000)
{
    da=(basic*15)/100;
    hra=7500;
    ta=(da*(int)12.9)/100;
}
else
if(basic>=100000)
{
    da=(basic*25)/100;
    hra=12500;
    ta=(da*20)/100;
}
System.out.println(da);
System.out.println(hra);
System.out.println(ta);
}
}