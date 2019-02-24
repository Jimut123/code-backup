function []=findFrequency(a,n)
count=0;
store=0;
flag=0;
i=1;
a(n+1)=9999;
while(i<=n)
store=a(i);
flag=0;
count=1;
    for j=i+1:n+1
        if(a(j)==store)
            count=count+1;
        else
            break;
        end
    end
fprintf('\nCount of %f is %f', store, count);
i=j;
end

        
        
