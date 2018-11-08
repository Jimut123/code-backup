class mm
{
    public static void main(int basic)
    {
        int da;
        int tax;
        da=0;
        tax=0;
        if(basic<=5000)
        {
            da=(basic*20)/100;
            tax=(basic*5)/100;
        }
        else
        if(basic<=10000)
        {
            da=(basic*28)/100;
            tax=(basic*8)/100;
            }
            else
            if(basic<=25000)
            {
                da=(basic*35)/100;
                tax=(basic*12)/100;
            }
            else
            if(basic>=250000)
            {
                da=(basic*45)/100;
                tax=(basic*25)/100;
            }
            System.out.print(da);
            System.out.print(tax);
        }
    }