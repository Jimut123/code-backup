class conversion
{
    public static void main(String args[])
    {
        String a="1234567890";
        System.out.println("\f");
        char c,c1,c2;
        int i,o,l = a.length();
        String s,s1,s2;
        c=a.charAt(0);
        c1=a.charAt(1);
        c2=a.charAt(2);
        s=(String)c;
        s1=c1;
        s2=c2;
        o=Integer.parseInt(c)+Integer.parseInt(c1)+Integer.parseInt(c2);
        System.out.println(o);
    }
}