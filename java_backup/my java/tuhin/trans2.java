


public class trans2
{
    public static void main(String args[])
    {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr1[][]=new int [3][3];
        for(int j=2;j>=0;j--)
        {
            for(int i=0;i<=2;i++)
            {
                arr1[i][2-j]=arr[j][i];
            }
        }
        for(int i=0;i<3;i++)
	 {
	  for(int j=0;j<3;j++)
	  {
	      System.out.print("  "+arr1[i][j]+"  ");
	   }
	   System.out.println();
	   
}
    }
}
