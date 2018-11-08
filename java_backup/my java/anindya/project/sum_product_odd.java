package project;
//Print the sum and product of all the odd number upto 100.\\
 class sum_product_odd
 {
    public static void main()
    {
     int a,b,s,p;
     s= 0;
     p = 1;
     for(a=1;a<=100;a++)
     {
         if (a%2!=0)
         {
             s = s+a;
             p = p*a;
            }
        }
        System.out.println(s);
        System.out.println(p);
    }
}

