class practise 
{public static void main (float c)
{double a;
if (c<5)
a = 100 *c/2;
else if (c>5  && c<=15)
a = 100*c/5;
else if (c>15 && c <=30)
a = 200 * c/10;
else
a=250 * c/5;
System.out.println(a);
}
}