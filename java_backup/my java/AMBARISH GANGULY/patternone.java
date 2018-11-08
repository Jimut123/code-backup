class patternone
{
   public static void main (int n)
      {
          int ch=65;int ch1=1;int j;
          for(int i=1;i<=n;i++)
          { if(i%2!=0)
              {
                  for(j=1;j<=i;j++)
                  System.out.print(ch1);
                  ch1++;
                }
                else
                   { for(j=1;j<=i;j++)
                      { System.out.print((char)ch);
                        }
                        ch++;
                    }
                    System.out.println("  ");
                }
            }
        }
            