import java.io.*;
class num_to_wrd
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String a[]={" "," ONE "," TWO "," THREE "," FOUR "," FIVE "," SIX "," SEVEN "," EIGHT "," NINE "," TEN "};
        String b[]={" "," TEN "," TWENTY "," THIRTY "," FOURTY "," FIFTY "," SIXTY "," SEVENTY "," EIGHTY "," NINETY "};
        String c[]={" "," ELEVEN "," TWELVE "," THIRTEEN "," FOURTEEN "," FIFTEEN "," SIXTEEN "," SEVENTEEN "," EIGHTEEN "," NINETEEN "};
        String d[]={" "," ONE HUNDRED "," TWO HUNDRED "," THREE HUNDRED "," FOUR HUNDRED "," FIVE HUNDRED "," SIX HUNDRED "," SEVEN HUNDRED "," EIGHT HUNDRED "," NINE HUNDRED "};
        String e[]={" "," ONE THOUSAND"," TWO THOUSAND"," THREE THOUSAND"," FOUR THOUSAND"," FIVE THOUSAND"," SIX THOUSAND"," SEVEN THOUSAND"," EIGHT THOUSAND"," NINE THOUSAND"}; 
        int k=0,n=0,p=0;
        System.out.println(" INPUT : ");
        n=Integer.parseInt(cd.readLine());
        System.out.println(" OUTPUT : ");
        if(n<=10)
        {
              System.out.println(a[n]);
        }
        else if((n>10)&&(n<21))
        {
              System.out.println(b[n%10]);
        }
        else if((n>20)&&(n<100))
        {
              System.out.println(b[n/10]+" "+a[n%10]);
        }
        else if((n>99)&&(n<1000))
        {
            k=n%100;
            if(k<11)
              System.out.println(d[n/100]+" " +a[k%10]);
            else if((k>10)&&(k<21))
              System.out.println(d[n/100]+" "+b[k%10]);
            else 
                System.out.println(d[n/100]+" "+c[k/10]+" "+a[k%10]);
            }
            else
            {
                p=n%1000;
                k=p%1000;
                if((p/100 == 0)&&((p%100)/10 == 0))
                  System.out.println(e[n/1000]+" "+a[n%10]);
                  else
                  {
                      if(k<11)
                        System.out.println(e[n/1000]+" " +d[p/100]+" "+a[k%10]);
                        else if((k>10)&&(k<21))
                          System.out.println(e[n/1000]+" "+d[p/100]+" "+b[k%10]);
                          else
                            System.out.println(e[n/1000]+" "+d[p/100]+" "+e[k/10]+" "+a[k%10]);
                        }
                    }
                }
            }
                      
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        

              
               