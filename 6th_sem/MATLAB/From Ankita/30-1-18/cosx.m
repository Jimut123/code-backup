%function y=cosx(x)
function y=cosx(x1)
format long;
x=pi*x1/180;
pcos=0;
ccos=1;
n=2;
eps=abs(ccos-pcos);
sf=-1;
while(eps>1e-16)
    pcos=ccos;
        fact=1;
    for i=2:n
       fact=fact*i; 
    end
    ccos=ccos+sf*(x^n)/fact;
    sf=-sf;
    eps=abs(ccos-pcos);
    n=n+2;
end
y=ccos;
end