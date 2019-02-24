%Function to calculate exp(x)=1+x/1!+x^2/2!
function [s]=func1(x)
s=1;
num=1;
den=1;
prev=1;
i=1;
h=0;
while(1)
    num=1;
    den=1;
    for j=1:i
        num=num*x;
        den=den*j;
    end
    s=s+num/den;
    h=s-prev;
    if(h<0) 
        h=-h;
    end
    if(h<1e-10)
        break;
    end
    prev=s;
    i=i+1;
    
end
end
    
    
