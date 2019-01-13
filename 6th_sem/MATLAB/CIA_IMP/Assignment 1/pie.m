%function cp=pie() : Function to calculate value of pi using Taylor series
%expansion
function cp=pie()
format long;
cp=1;
pp=0;
eps=abs(cp-pp);
n=3;
sf=-1;
p3=1;
while eps>1e-16
pp=cp;
p3=p3*3;
cp=cp+sf/(p3*n);
eps=abs(cp-pp);
sf=-sf;
n=n+2;
end
cp=2*sqrt(3)*cp;
end