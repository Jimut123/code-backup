package project;
//Write a program in java to make a calculated program in which 2 integer
//numbers and 1 character type of operator(+,-,/,*)will be given by the 
//user as input.According to the operator given the relevant operation 
//should be performed on the given integer.Proper error message should be 
//displayed if wrong operator is given.

class check
{
    public static void main(int a,int b,int c)
    {
        int m;
        switch(c)
        {
            case'+':m=a+b;
            System.out.println(m);
            break;
            case'-':m=a-b;
            System.out.println(m);
            break;
            case'/':m=a/b;
            System.out.println(m);
            break;
            case'*':m=a*b;
            System.out.println(m);
            break;
            default:System.out.println("error");
        }
    }
}
    