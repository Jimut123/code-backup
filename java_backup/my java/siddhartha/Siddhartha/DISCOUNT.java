class DISCOUNT
{public static void main(int p,int d)
{if (p > 1000)
{d = p - 250;
}
else if ( p > 575 &&  p<= 1000)
{d = p - 200;
}
else if (p >500  &&  p <= 575)
{d = p-150;
}
else if (p < 500);
{d = p -50;
}
System.out.println(d);
   }
}