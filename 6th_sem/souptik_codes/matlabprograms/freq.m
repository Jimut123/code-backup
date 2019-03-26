clc;
close all;
clear all;

n=input('Enter size of your aray');

for i=1:n
    a(i)=input('Enter %d Element');
end

findfreq(a,n);
