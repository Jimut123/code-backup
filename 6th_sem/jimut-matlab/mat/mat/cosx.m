function [cx] = cosx(theta)
    %format long;
    x_rad = (theta*pi)/180;
    k=0;
    c=0;
    cx=0;
    for i=1:200
       
       %fprintf("k = %d",k);
       if(mod(c,2)==0)
           cx=cx+(x_rad^k)/factorial(k);
       else 
           cx=cx-(x_rad^k)/factorial(k);
       end
       k=k+2;
       c=c+1;
    end
end