function cose=findcose(x)
x=x*pi/180;
term=1;
count=2;
cose=0;
flag=0;
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
        cose=cose+term;
        flag=0;
    else
        cose=cose-term;
        flag=1;
    end
    count=count+2;
end
cose=1-cose;
end
    