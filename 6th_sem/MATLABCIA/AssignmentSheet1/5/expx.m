%function ce=expx(x):Function to calculate expx(x) using Taylor series
%expansion
function ce=expx(x)
format long
ce=1;
pe=0;
eps=abs(ce-pe);
n=1;
fact=1;
px=1;
while eps>1e-06
    pe=ce;
    fact=fact*n;
    px=px*x;
    ce=ce+px/fact;
    eps=abs(ce-pe);
    n=n+1;
end
end