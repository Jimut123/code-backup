function n=hcf(a,b)
    if a>b
        t=b;
        b=a;
        a=t;
    end
r=b;
    while r~=0
        r=mod(a,b);
        a=b;
        b=r;
    end
n=a;
end