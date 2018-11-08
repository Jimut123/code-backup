class rr
{
    public static void main(int purchase)
    {
        int discount;
        discount=0;
        if(purchase<=10000)
        discount=(purchase*10)/100;
        else
        if(purchase<=25000)
        discount=(purchase*15)/100;
        else
        if(purchase<=50000)
        discount=(purchase*25)/100;
        else
        if(purchase>=50000)
        discount=(purchase*35)/100;
        System.out.print(discount);
    }
}