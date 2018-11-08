import java.io.*;
class arrangealter
{
public static void main(String args[])throws IOException
{
int data[]=new int[100];
int i,j,n,mid,p,q,g,temp,max,min,c;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Give no. of integers :");
n=Integer.parseInt(input.readLine());
//Entering values from user into array
g=1;
for(i=0;i<n;i++)
{
System.out.print("Give integer "+g+".: ");
data[i]=Integer.parseInt(input.readLine());
System.out.println();
g++;
    }
    //Display of original array    
    System.out.println("Original array :");
    System.out.print(data[0]);
    for(i=1;i<n;i++)
    {
        System.out.print(","+data[i]);
    }
    System.out.println(" ");
    //Finding mid-point of array
    if(n%2==0)
    {
        mid=(n/2)-1;
    }
    else
    {
        mid=(n-1)/2;
    }
    //Arranging array according to ascending order
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            if(data[j+1]<data[j])
            {
                temp=data[j+1];
                data[j+1]=data[j];
                data[j]=temp;
            }
        }
    }
    //Alloting values for maximum and minimum variables
    max=data[(n-1)];
    min=data[0];
    //Re-arranging array in required alternate positioning order
    p=mid;
    q=mid;
    c=0;
    for(i=max;i>=min;i--)
    {
        for(j=0;j<n;j++)
        {
            if(data[j]==i)
            {
                c++;
                if(c==1)
                {
                    temp=data[mid];
                    data[mid]=data[j];
                    data[j]=temp;
                }
                else
                {
                    if(c%2==0)
                    {
                        //swaping values to the right of mid-point
                        q++;
                        temp=data[q];
                        data[q]=data[j];
                        data[j]=temp;
                    }
                    else
                    {
                        //swaping values to the left of mid-point
                        p--;
                        temp=data[p];
                        data[p]=data[j];
                        data[j]=temp;
                    }
                }
            }
        }
    }
    //Display of Re-arranged array
    System.out.println("Re-arranged array :");
    System.out.print(data[0]);
    for(i=1;i<n;i++)
    {
        System.out.print(","+data[i]);
    }
        System.out.println(" ");
}
    }
                    