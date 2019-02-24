%Main function for array calculations
clc;
close all;
clear all;
n=input('Enter n: ');

for i=1:n
    a(i)=input('Enter the elements: ');
end
total=sumArray(a,n);
fprintf('\nTotal sum is: %f', total);
largestValue=largestValueArray(a,n);
fprintf('\nLargest value is: %f', largestValue);
fprintf('\nAverage is: %f', total/n);
fprintf('\nStandard deviation is: %f' , standardDev(a,n));

