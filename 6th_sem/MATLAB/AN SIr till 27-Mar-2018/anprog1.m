%To use switch case
clc;
clear all;
close all;
m=input('\nEnter total(0-100)=');
switch m
    case {70,71,72}
        disp('A');
    case {60,61,62,63}
        disp('B');
    otherwise
        disp('C');
end
