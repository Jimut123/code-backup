function sine=findsine(x)
x=x*pi/180;
term=1;
count=1;
sine=0;
flag=1;
while term>=1e-06
    term=1;
    for i=1:count
        term=term*x;
    end
    fact=1;
    for i=1:count
        fact=fact*i;
    end
    term=term/fact;
    
    if flag==1
        sine=sine+term;
        flag=0;
    else
        sine=sine-term;
        flag=1;
    end
    count=count+2;
end
end
    