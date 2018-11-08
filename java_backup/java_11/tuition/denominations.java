import java.io.*;
class denominations
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int amt,k,m,t=0,l,s=0,i;
        int d,c=0;
        int deno[]={1000,500,100,50,20,10,5,2,1};
        String p = "";
        System.out.println("Enter the amount(upto 5 digits):");
        amt=Integer.parseInt(cd.readLine());
        k=amt;
        l=amt;
        while(l!=0)
        {
            d=l%10;
            s=s+1;
            l=l/10;
        }
        if(s<6)
        {
        while(k!=0)
        {
            d=k%10;
            switch(d)
            {
                case 1:
                {
                  p=" ONE "+p; 
                  break;
                }
                case 2:
                {
                  p=" TWO "+p;
                  break;
                }
                case 3:
                {
                  p=" THREE "+p; 
                  break;
                }
                case 4:
                {
                  p=" FOUR "+p;
                  break;
                }
                case 5:
                {
                  p=" FIVE "+p; 
                  break;
                }
                case 6:
                {
                  p=" SIX "+p;  
                  break;
                }
                case 7:
                {
                  p=" SEVEN "+p;
                  break;
                }
                case 8:
                {
                  p=" EIGHT "+p;  
                  break;
                }
                case 9:
                {
                  p=" NINE "+p;  
                  break;
                }
                case 0:
                {
                  p=" ZERO "+p; 
                  break;
                }
                default:System.out.println("Check your digits!");
            }
            k=k/10;
        }
        System.out.println(p);
        for(i=0;i<=8;i++)
        {
                d=amt/deno[i];
                if(d>0)
                {
                    c=c+d;
                    
                    m=deno[i]*d;
                    t=t+m;
                    
                    System.out.println(deno[i]+" x "+d+" = "+m);
                }
                amt = amt%deno[i];
        }
        System.out.println("\t TOTAL = "+t);
        System.out.println("TOTAL NUMBER OF NOTES = "+c);
    }
    else
    {
        System.out.println("INVALID AMOUNT");
    }
}
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        