class Conversion {
public void DecimalToBinary(int n) {
    int n1=(int)n,t=0;
    int a[]=new int[10];
    t=0;
    while(n1>0)
    {
        a[t++]=n1%2;
        n1=n1/2;
    }
    for(int i=t-1;i>=0;i--)
    System.out.print(a[i]);
}

public void DecimalToOctal(int n) {
    int n1=(int)n,t=0;
    int a[]=new int[10];
    t=0;
    while(n1>0)
    {
        a[t++]=n1%8;
        n1=n1/8;
    }
    for(int i=t-1;i>=0;i--)
    System.out.print(a[i]);
}

public void DecimalToHexadecimal(int n) {
    
    int n1=(int)n,t=0;
    int a[]=new int[10];
    t=0;
    while(n1>0)
    {
        a[t++]=n1%16;
        n1=n1/16;
    }
        for(int i=t-1;i>=0;i--)
    {
        if(a[i]==10)
        { System.out.print('A');
            }
        else    
        if(a[i]==11)
        {  System.out.print('B');
             }
       else      
        if(a[i]==12)
        { System.out.print('C');
            }
        else    
        if(a[i]==13)
        { System.out.print('D');
            }
        else    
        if(a[i]==14)
        { System.out.print('E');
             }
        else     
        if(a[i]==15)
        { System.out.print('F');
             }
            else
        System.out.print(a[i]);
    }
}
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        