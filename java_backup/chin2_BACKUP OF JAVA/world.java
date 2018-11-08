public class world
{
    public static void main(String args[])
    {
        String ls="WORLDSD";
        int count = 0;
        for(int i = 0; i<ls.length() ; i++)
        {
            for(int j = 0; j<ls.length() ; j++)
            {
                for(int k = 0; k<ls.length() ; k++)
                {
                    if((i == j)||(j == k)||(k == i))
                    {
                        continue;
                    }
                    else
                    {
                        System.out.println(""+ls.charAt(i)+ls.charAt(j)+ls.charAt(k));count++;
                    }
                }
            }
        }
        System.out.println("TOTAL WORDS = "+ count);
    }
}
