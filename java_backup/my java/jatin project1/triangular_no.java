class triangular_no
    {
        public static void main(int n)
            {
                int i,j,s,k;
                for(i=1;i<=n;i++)
                    {
                        s=0;
                        for(j=1;j<i;j++)
                            {
                                 
                                s=s+j;
                                if(s==i)
                                {
                                    for(k=1;k<=j;k++)
                                    {
                                    System.out.print(k);
                                    if(k<j)
                                    System.out.print("+");
                                   
                                      
                                    }
                                     System.out.print("="+s);
                                    System.out.println("");
                                    break;
                                }
                                 if(s>i)
                                {
                                    
                                    break;
                                }
                            }
                                        
                        
                      
                                              
                    }
                }
            }