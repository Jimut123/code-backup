%function s= sum_of_digits(n) : Function to calculate sum of digits in any
%integer n
 function s=sum_of_digits(n)
   s=0;
    while n ~=0
    d=mod(n,10);
    s=s+d;
    n=fix(n/10);
    end
   end
