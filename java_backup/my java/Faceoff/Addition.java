class Addition
{
    public static void main (int x)
        {double i=0;   
        if (x<=200000)
        i=0;
        
        else if (x<=500000)
        i=0+((i-200000)*0.20);
        
        else if (x<=1000000)
        i=0+((500000-200001)*0.20)+((i-500000)*0.30);
        
        else if (x>1000000)
        i=0+((500000-200001)*0.20)+((1000000-500001)*0.30)+((i-1000000)*0.70);
        
                System.out.println("Income tax" +i);
            }
        }
        