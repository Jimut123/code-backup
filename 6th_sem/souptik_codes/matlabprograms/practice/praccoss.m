clc;
clear all;
close all;

for i=0:1:360
    cose=findcose(i);
    fprintf('\n cos%f=%10.5f',i,cose);
end
