clc;
close all;
clear all;

n=input('Enter the number of elements');

for i=1:n 
    a(i)=input('Enter %d element');
end

sumElem=sumArray(a,n);
avgElem=avgArray(a,n);
stdElem=stdArray(a,n);
fprintf('\nSum of elements= %f',sumElem);
fprintf('\nAverage of elements= %f',avgElem);
fprintf('\nStandard Deviation of elements= %f',stdElem);
