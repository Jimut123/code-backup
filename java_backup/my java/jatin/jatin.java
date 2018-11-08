class jatin
    {
        public static void main()
            {
                int i,j,k,l=5,m=0;
                for(i=1;i<=5;i++)
                    {
                 for(j=1;j<=l;j++)
                        System.out.print(j+" ");
                 for(k=1;k<=m;k++)
                        System.out.print(" ");
                 if(i==1)
                        j=j-2;
                        else
                        j=j-1;
                 while(j>=1)
                             {
                                System.out.print(j+" ");
                                j--;
                            }
                 System.out.println("");
                 l=l-1;
                 m=m+2;
                    }
               
            }
        }
