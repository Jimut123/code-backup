class linebyline
{
    public static void main(String str)
    {
        str=str+"";
        int len=str.length();
        String w="";
        for(int i=0;i<len;i++)
        {
            char k=str.charAt(i);
            w=w+k;
            w=w.trim();
            if(k==' ')
            {
                System.out.println(w+"..."+w.length());
                w="";
            }
        }
    }
}