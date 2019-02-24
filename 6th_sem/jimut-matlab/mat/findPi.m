function mypii= findPi()
mypii=0;
term=1;
c=0;
flag=1;
div=1;
while(term>1e-10)
    term=1;
    for i=1:c
        term=term*3;
    end
    term=1/term;
    term=term/div;
    if flag==1
        mypii=mypii+term;
        flag=0;
    else
        mypii=mypii-term;
        flag=1;
    end
    div=div+2;
    c=c+1;
end
mypii=2*mypii*sqrt(3);
fprintf('Value of pi=%16.12f',mypii);
end

