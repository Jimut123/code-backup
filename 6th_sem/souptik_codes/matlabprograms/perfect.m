clc;
close all;
n=input('Enter Limit n : ');

for i=1:n
    sum=sumOfFactors(i);
    if i==sum 
        fprintf(' %d\n',i);
    end
end
