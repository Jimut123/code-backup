%function to calculate hcf of two numbers

function h=hcf1(a,b)
r=mod(a,b);
    while r~=0
        a=b;
        b=r;
        r=mod(a,b);
    end
    h=b;
end

