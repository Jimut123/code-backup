%function y=sinx(x)
function y=sinx(x1)
format long;
x=pi*x1/180;
psin=0;
csin=x;
n=3;
eps=abs(csin-psin);
sf=-1;
while(eps>1e-16)
    psin=csin;
        fact=1;
    for i=2:n
       fact=fact*i; 
    end
    csin=csin+sf*(x^n)/fact;
    sf=-sf;
    eps=abs(csin-psin);
    n=n+2;
end
y=csin;
end