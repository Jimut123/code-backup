class decreasng
{
 public static void main()
 {
     int i,j=13,k=1,sp=13;
     for(i=1;i<=4;i++)
     {
         for(int m=1;m<=sp;m++)
          System.out.print(" ");
         for(int t=k;t<=j;t=t+2)
         System.out.print(t+" ");
         k=k+2;
         j=j-2;
         System.out.println("");
         sp=sp+2;
         

    }
}
     
}