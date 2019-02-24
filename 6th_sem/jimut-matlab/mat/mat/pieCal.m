% PI = 3^(1/2)*2*(1-(3^(-1)/3)+(3^(-2)/5)+(3^(-3)/7)+(3^(-4)/9)
% PI = 3.1415926

function [pie] = pieCal()
    s=0;
    c=0;
    k=1;
    for i=1:2000
        if mod(c,2)==0
            s=s+((3^(c))/k); 
            %fprintf('+ s=%d,c=%d,k=%d\n ',s,c,k);
        else
            s=s-((3^(c))/k);
            %fprintf('- s=%d,c=%d,k=%d\n ',s,c,k);
        end
        k=k+2;
        c=c-1; 
    end
    %fprintf('s = %d',s);
    pie=(3^0.5)*2*s;
    fprintf("Our pie == %3.19f\n",pie);
    fprintf("Their pie == %3.19f\n",pi);
end
