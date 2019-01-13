%function [y]=expx1(x) : Function to calculate exp(x)
function [y]=expx1(x)
format long;
ce=1;
pe=0;
n=1;
fact=1;
xp=1;
eps=abs(ce-pe);
    while eps>1e-16
        pe=ce;
        fact=fact*n;
        xp=xp*x;
        ce=ce+xp/fact;
        eps=abs(ce-pe);
        n=n+1;
    end
    y=ce;
end