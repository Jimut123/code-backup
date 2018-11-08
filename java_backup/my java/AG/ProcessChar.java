//Write a short program to find whether the given character is a digit or a letter.
class ProcessChar
{
    public static void digOrLetter(char ch)
    {
        if(Character.isDigit(ch))
        System.out.println("The character represents a digit");
        else if(Character.isLetter(ch))
        System.out.println("The character represents a letter");
        else
        System.out.println("The character represents neither a digit nor a letter");
    }
    public static void main(String args[])
    {
        digOrLetter('3');
        digOrLetter('M');
    }
}
