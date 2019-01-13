%sine.m : Write a function to calculate sin(x) using Taylor series
%expansion
function [y]=sine(x)
format long;
xrad=x*pi/180;
csin=xrad;
psin=1;
eps=abs(csin-psin);
n=3;
sf=-1;
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
    y=csin;
end
