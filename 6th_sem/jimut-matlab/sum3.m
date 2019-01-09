%function s=sum3(n): Function to calculate s=n+(n-2)+...+upto 1 or 2
%depending on the input
function s=sum3(n)
    s=0;
    check_1 = oddoreven(n);
    if check_1 == 0
        for i=n:-2:0
            s=s+i;
        end
    else
        for i=n:-2:1
            s=s+i;
        end
    end
end


