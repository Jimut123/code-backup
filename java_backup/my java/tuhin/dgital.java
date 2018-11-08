
public class dgital
{
    public static void print(int n)
    {
        
        int k=n;
        int c=0;
        while(k>0)
        {
            c++;
            k=k/10;
        }
        int arr[]=new int [c];
        k=n;
        int m=c-1;
        while(k>0)
        {
            arr[m]=k%10;
            m--;
            k=k/10;
        }
        //for(int i=0;i<c;i++)
        //System.out.println(arr[i]);
        
    String arr1[][]={{"  @  "," @@@ "," @@@ "," @ @ "," @ "," @ "," @ "," @ "," @ "},
                     {"  @  ","   @ ","   @ "," @ @ "," @ "," @ "," @ "," @ "," @ "},
                     {"  @  "," @@@ "," @@@ "," @@@ "," @ "," @ "," @ "," @ "," @ "},
                     {"  @  "," @   ","   @ ","   @ "," @ "," @ "," @ "," @ "," @ "},
                     {"  @  "," @@@ "," @@@ ","   @ "," @ "," @ "," @ "," @ "," @ "}};
                
                for(int i=0;i<5;i++)
                {
                    for(int j=0;j<c;j++)
                    System.out.print(arr1[i][arr[j]-1]);
                    System.out.println();
                }
                
            }
                
    
    
        
}
