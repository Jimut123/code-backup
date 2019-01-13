function it=sump1(a,b,n)
h=(b-a)/n;
yon=sump(a)+sump(b);
y1=0;
y2=0;
for i=1:n
    r=mod(i,2);
    if r==0
    y1=y1+sump(a+i*h);
    else
       y2=y2+sump(a+i*h);
    end
end
it=0.3333333*h*(yon+4*y2+2*y1);
end
