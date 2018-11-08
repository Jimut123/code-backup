class  fare
{public static void main(double u)
{double f;
{if (u>50 &&  u<=100)
f = (2*u)+(2/100 * u);
else if (u>100 && u<=150)
f= (2*100)+3*(u-100)+(2/100 * u);
else if (u>150 && u<=200)
f=(2*100)+(3*150)+4*(u-150)+(2/100 * u);
else
f= (2*100)+(3*150)+(4*200)+4.5*(u-200)+(2/100 * u);
System.out.println("The fare is "+f);
}
   }
}