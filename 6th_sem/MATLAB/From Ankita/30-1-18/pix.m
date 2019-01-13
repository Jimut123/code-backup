function y=pix()
format long;
cval=1;
pval=0;
i=-1;
n=3;
sf=-1;
eps=abs(cval-pval);
while(eps>1e-16)
   pval=cval;
   cval=cval+sf*(3^i)/n;
   sf=-sf;
   i=i-1;
   n=n+2;
   eps=abs(cval-pval);
end
y=cval*2*(3^(1/2));
end