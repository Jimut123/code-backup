clc;
close all;
clear all;
for i=0:360
    sinex=findSin(i);
    fprintf('sin %d = %f \n',i,sinex);
end
