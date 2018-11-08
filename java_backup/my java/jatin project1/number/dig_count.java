package number;
public class dig_count
{
  int c;
  public int digit_count(int x)
  {
      c=0;
      int y=x;
      while(y>0)
      {
          c++;
          y=y/10;
        }
        return c;
    }
}
      

