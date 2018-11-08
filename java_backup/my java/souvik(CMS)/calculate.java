class calculate
{
public static void main(int a)
  {
      double fare; 
      fare=0;
      if(a<=5)
          fare=20;
       else
          if(a<=15)
          fare=20+(a-5)*2.50;
       else
          if(a<=30)
          fare=20+25+(a-15)*2.00;
       else
          if(a<=60)
          fare=20+25+30+(a-30)*1.50;
       else
          if(a>60)
          fare=20+25+30+45+(a-60)*1.00;
             System.out.println(fare);
            }
        }