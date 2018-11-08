import java.io.*;
class six_digit_recursive
{ //declaration of class
    int n,k,k1,s1,s,f;  //inisialisation of class variables  
    void input()throws IOException
    {// method to input a six number and check its validity
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a six digit number");
        n=Integer.parseInt(br.readLine());
        if(n>=100000 && n<=999999)
                {//loop for checking validity and calling other functions
                k=0;
                rec(k,n);
                s=0;
                s1=0;
                f=0;
                sum(n,s,s1,f);
            }//end of loop
        else
        System.out.println("Error: enter six digit number only");//printing error
        }//end of method
        void rec(int k,int n)
        {//method to print the frequency of each digit seperately
            if(k>9)
              return;
            else
            {
            int m=n;
            int s=0;
            int x=countfreq(k,m,s);//calling fuction
            if(x>0)
            System.out.println("Total Frequency of Digit "+k+" is "+x);//printing result
            rec(k+1,n);
        }
    }//end of method
    int countfreq(int k,int m,int s)
    {//method to find the frequency of a digit
        if(m==0)
          return s;
        else
        {//loop to find the frequency of a digit
            if(k==m%10)
            s++;
            return countfreq(k,m/10,s);
        }//end of loop
    }//end of method
    void sum(int n,int s,int s1,int f)
    {//method to find the sum of alternate digits
        if(n<=0)
        {//loop to print result   
            System.out.println("Sum:"+s);
            System.out.println("Sum:"+s1);
            return;
        }//end of loop
        if(f==0)
        {//loop to add one set of digits
            s=s+n%10;
            f=1;
        }//end of loop
        else
        {//loop to add another set of digits
            s1=s1+n%10;
            f=0;
        }//end of loop
        sum(n/10,s,s1,f);
        }//end of method 
    }//end of class    
