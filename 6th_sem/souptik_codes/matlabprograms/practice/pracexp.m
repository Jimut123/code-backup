clc;
clear all;
close all;

for i=0:0.1:1
    ex=findexp(i);
    fprintf('\n e^%f=%10.5f',i,ex);
end

