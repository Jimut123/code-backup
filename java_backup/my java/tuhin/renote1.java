
public class renote1
{
    public static void main(int n)
    {
        int a[]={1000,500,100,50,20,10,5,2,1};
       
        int c=0;
        int no;
        int rem=0;
        do{
            no=n/a[c];
            n=n%a[c];
            
            if(c>8)
            break;
            System.out.println("Note  "+a[c]+" is "+no);
            c=c+1;
        }while(n!=0);
    }
}
