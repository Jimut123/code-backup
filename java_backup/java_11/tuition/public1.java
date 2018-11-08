class public1
{
    public void main()
    {
        String name = "a ProFiLe";
        String S="";
         System.out.println("\f");
        for(int x=0;x<name.length();x++)
        {
            char ch = name.charAt(x);
            if(Character.isLowerCase(name.charAt(x)))
            {
              S+=Character.toUpperCase(name.charAt(x));
               //System.out.println(S);
            }
            else
            if(Character.isUpperCase(name.charAt(x)))
            {
            if(x%2!=0)
            {
                S+=Character.toLowerCase(name.charAt(x-1));
                 //System.out.println(S);
                }
            }
                else
                {
                S+=ch--;
                 
            }
            }
            System.out.println(S);
        }
        
    }