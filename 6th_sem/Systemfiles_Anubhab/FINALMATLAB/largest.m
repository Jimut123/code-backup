clc;
close all;
clear all;
a=input('\nEnter 1st number = ');
b=input('\nEnter 2nd number = ');
c=input('\nEnter 3rd number = ');
%To get largest value
big=a;
if b>big
    big=b;
end
if c>big
    big=c;
end
fprintf('a = %d b = %d c = %d largest value = %d\n',a,b,c,big);
%end of program