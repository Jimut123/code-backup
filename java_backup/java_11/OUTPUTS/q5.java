class q5
{
    public void main()
    {
    String name="a ProFile";
    String s="";
    for(int x=0;x<name.length();x++)
    {
        char ch = name.charAt(x);
        if(Character.isLowerCase(ch))
        s+=Character.toUpperCase(ch);
        else
        if(Character.isUpperCase(ch))
        if(x%2!=0)
        s+=Character.toLowerCase(name.charAt(x-1));
        else
        s+=ch--;
    }
    System.out.println(s);
    }
}
