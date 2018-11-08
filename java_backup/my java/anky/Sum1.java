import java.io.*; 
class Sum1 extends Power implements fact
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num,sum=0,i=1;
        public int factorial(int p)
        {
            int f=1;
            while(i<=p)
            {
                f=f*i;
                i++;
            }
            return f;
        }
        void disp()throws IOException
        {
            System.out.println("Enter number");
            num=Integer.parseInt(br.readLine());
            for(i=1;i<=num;i++)
            {
                sum=sum+(power(i)/factorial(i));
            }
            System.out.println(sum);
        }
        public static void main()throws IOException
        {
            Sum s=new Sum();
            s.disp();
        }
    }