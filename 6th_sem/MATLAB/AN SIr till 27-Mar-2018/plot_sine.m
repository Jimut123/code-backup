%plot sine(x) function
clc;
close all;
clear all;
j=1;
for i=-540:5:540
    y(j)=sine(i);
    j=j+1;
end
plot(y);
