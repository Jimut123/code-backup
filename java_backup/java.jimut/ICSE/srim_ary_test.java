import java.io.*;
class srim_ary_test
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int Arr1[] = new int[10];
        int Arr2[] = new int[10];
        int Arr3[] = new int[10];
        System.out.println("Enter ten elements of Arr1:");
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the"+(i+1)+"th element:");
            Arr1[i]=Integer.parseInt(cd.readLine());
        }
        System.out.println("Enter ten elements of Arr2:");
          for(i=0;i<10;i++)
        {
            System.out.println("Enter the"+(i+1)+"th element:");
            Arr2[i]=Integer.parseInt(cd.readLine());
        }
        for(i=0;i<10;i++)
        {
            Arr3[i]=(Arr1[i]*Arr1[i])+(Arr2[9-i]*Arr2[9-i]);
        }
        System.out.println("Elements of Arr3:");
         for(i=0;i<10;i++)
        {
               System.out.println(Arr3[i]);
        }
    }
}