
class lcm
    {
        int a, b, k;
        void input(int a,int b)
            {
                k=lcm(a, b);
                System.out.print("lcm" +k);
            }
            int lcm(int a,int b)
            {
                 
            int i=1;
            while((a*i)%b !=0)
            i++;
            return(a*i);
        }
    }
