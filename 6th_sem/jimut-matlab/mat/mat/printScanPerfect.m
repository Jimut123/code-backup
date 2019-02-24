% To scan and print all the perfect numbers
clc;
%clear all;
for i=1:999999
    if(checkPerfect(i)==1)
        fprintf(i+" ")
    end
    %fprintf("\n")
end