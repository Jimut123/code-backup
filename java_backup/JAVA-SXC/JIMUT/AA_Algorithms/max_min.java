import java.io.*;
class max_min
{
	//int n;
    public static void main(String args[])throws IOException
    {
            InputStreamReader ab = new InputStreamReader(System.in);
            BufferedReader cd = new BufferedReader(ab);
	    int n;
            System.out.println("\n Enter the size of the array : ");
            n=Integer.parseInt(cd.readLine());
            System.out.println("\n n : "+n);
	    System.out.println("\n Enter the elements of the array : ");

    }
    void Maxmin(int i,int j,int max,int min)
    {
        if(i==j)
            max=min=a[i];
        else if (i==j-1)
        {
            if(a[i]<a[j])
            {
                max=a[j];
                min=a[i];
            }
	    else
	    {
		    min=a[j];
		    max = a[i];
	    }
	}
	    else
	    {
		    mid = (int)((i+j)/2);
		    Maxmin(i,mid,max,min);
		    Maxmin(mid+1,max1,min1);
		    if(max1>max)
			    max=max1;
		    if(min1<min)
			    min=min1;
	    }
        }
}
