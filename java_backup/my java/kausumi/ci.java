
 class ci
{
   public static void main(int p,int r,int t)
   {
       double ci=p*Math.pow((1+r/100),t);
       System.out.println("Compound interest="+ci);
       
    }
}
