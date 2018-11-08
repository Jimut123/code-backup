package practical;

//displaying prime triplets between from 1 to 500
class PrimeTriplet
{
  int arr[]=new int[3];
  int c=0;
  boolean b;
  int n=1;
  
  public void find()
  {
      if(n>11)
      return;
      else
      {
   //for(int j=1;j<=11;j++) 
      triplet(n);
      n=n+1;
      find();
    }
    }
  public void triplet(int i)
  {
      if (i>11)
      {
          c=0;
       return;
    }
      b=isPrime(i);
      if (b==true)
      {
          arr[c++]=i;    
        if (c==3)
        {
            for(int j=0;j<3;j++)
             System.out.print(arr[j]+" ");
            System.out.println("");
            c=0;
           //
            //triplet(n++);
        }
        //triplet(i+1);
    }
    //i=i+1;    
    triplet(i+1);
    }
    public boolean isPrime(int n)
    {
        int i;
        for(i=2;i<n;i++)
        {
            if (n%i==0)
             return false;
            }
            return true;
        }
    }