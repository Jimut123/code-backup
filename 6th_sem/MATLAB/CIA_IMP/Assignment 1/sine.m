%function csin=sine(x) : Function to calculate sin(x) using Taylor Series
%expansion
function csin=sine(x)
format long;
xrad=x*pi/180;
csin=xrad;
psin=1;
eps=abs(csin-psin);
sf=-1;
n=3;
while eps>1e-16
    psin=csin;
    fact=1;
    for i=1:n
        fact=fact*i;
    end
    csin=csin+sf*xrad^n/fact;
    eps=abs(csin-psin);
    n=n+2;
    sf=-sf;
end
end