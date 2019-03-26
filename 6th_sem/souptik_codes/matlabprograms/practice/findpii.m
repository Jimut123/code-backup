function pii=findpii()
term=1;
count=0;
flag=1;
div=1;
pii=0;
while term>1e-12
    term=1;
    term=power(3,count);
    term=1/term;
    term=term/div;
    if flag==1
        pii=pii+term;
        flag=0;
    else
        pii=pii-term;
        flag=1;
    end
    count=count+1;
    div=div+2;
end
pii=2*sqrt(3)*pii;
fprintf('%20.18f',pii);