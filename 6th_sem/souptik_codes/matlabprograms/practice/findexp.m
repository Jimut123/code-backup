function ex=findexp(x)
term=1;
count=1;
ex=1;
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
    ex=ex+term;
    count=count+1;
end
end
    