class mersenne
    {
        public static void main()
        {
            int i,s=0;
            for(i=1;;i++)
                {
                  s=(int)(Math.pow(2,i)-1);
                  if(s<=20)
                    System.out.println(+s);
        }
    }
    }