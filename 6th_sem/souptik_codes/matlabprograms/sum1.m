function  s  = sum1(n) 
   s=0;
   for i=1:n
       if mod(i,2)~=0
           s=s+i;
       else
           s=s-i;
       end
   end
end

