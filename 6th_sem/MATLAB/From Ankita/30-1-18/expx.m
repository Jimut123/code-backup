%function y=exp(x):Function to calculate exp(x) using Taylor seies
%expansion
function y=expx(x)
format long;
ce=1;
pe=0;
eps=abs(ce-pe);
fact=1;
px=1;
n=1;
while eps>1e-16
    pe=ce;
    fact=fact*n;
    ce=ce+x^n/fact;
    eps=abs(ce-pe);
    n=n+1;
end
y=ce;
end