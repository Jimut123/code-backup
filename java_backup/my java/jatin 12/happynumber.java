import java.io.*;
class happynumber
{//declaration of class
    public static void main(String args[])throws Exception
    {//declaration of main 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i,j,m,n,k;//insialisation of variables
        happynumber obj=new happynumber();
        System.out.print("Enter the lower limit for happy number series : ");
        m=Integer.parseInt(br.readLine());           
        System.out.print("Enter the upper limit for happy number series : ");
        n=Integer.parseInt(br.readLine());           
        for(k=m;k<n;k++)
        {//loop to find happy numbers
            i=k;
            while((j= obj.happy(i))/10 !=0)    
            {
                i=j;               
            }
            if(j==1)
            System.out.print(k+",");
        }//end of loop
    }//end of main
    int happy (int n)
    {//function to return sum of square of digits
        if(n/10==0)
        return n*n;
        else
        return (int)Math.pow(n%10,2)+ happy(n/10);
    }//end of function
}//end of class