function sinex = findSin(x)
x=pi*x/180;
sinex=0;
term=1;
c=1;
flag=1;
while(term>1e-10)
    term=1;
    for i=1:c
        term=term*x;
    end
    fact=1;
    for i=1:c
        fact=fact*i;
    end
    term=term/fact;
    if flag==1
        sinex=sinex+term;
        flag=0;
    else
        sinex=sinex-term;
        flag=1;
    end
    c=c+2;
end
end
