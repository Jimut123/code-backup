package project;
//Write a program in java to print the cubes of all the odd numbers and 
//squares of all the even numbers upto 15.
class square
{
    public static void main()
    {
        int i;
        for(i=1;i<=15;i++)
        {
            if(i%2!=0)
                System.out.println(i*i*i);
            else
                System.out.println(i*i);
        }
    }
}