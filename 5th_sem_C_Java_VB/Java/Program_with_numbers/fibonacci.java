import java.io.*;
class fibonacci 
{ 
    public int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    }     
    public static void main (String args[])throws IOException 
    { 
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      fibonacci ob = new fibonacci();
      int n;
      System.out.print("Enter n-th term of fibonacci series : ");
      n=Integer.parseInt(br.readLine());
      System.out.println("The "+n+"-th term of fibonacci series is : "+ob.fib(n)); 
    } 
} 