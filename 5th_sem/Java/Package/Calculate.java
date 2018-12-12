//Calculate.java : Class file to calculate sum, product and average of two numbers
package akr_package;
public class Calculate
{
  public int sum(int a, int b)
  {
    int s;
    s=a+b;
    return s;
  }
  public int product(int a, int b)
  {
    int p;
    p=a*b;
    return p;
  }
  public float average(int a, int b)
  {
    float avg;
    avg=(float)(a+b)/2.0F;
    return avg;
  }
}