%sum=1+(1+2)+(1+2+3)+(1+2+3+..+n) using a function
function s=sum1(n)
    s=0;
    count=0;
        while(1)
            s=s+(n-count);
            count=count+2;
            if((n-count)<0)
                break;
            end
        end 
end  
