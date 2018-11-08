class t1

{

public static void main(String args[])

{

int i,j,a=65,k=1;

for (i=5;i>0;i--)

{

 for(j=0;j<i;j++)

 {
  
  System.out.print((char)a);

  a=a+1;

 }

  a=a-1;

  if (i<5)

  {

   for (j=1;j<=k;j++)

   System.out.print(" ");

   k=k+2;

  }

   for (j=1;j<i;j++)

   {

    a=a-1;

    System.out.print((char)a);

   }

    System.out.println("");

}

}

}
  0
