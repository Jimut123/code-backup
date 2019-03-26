function  s  = sum2(n) 
   s=0;
   c=0;
   while(1)
      s=s+n-c;
      c=c+2;
      if(n-c<0)
          break;
      end
   end
end