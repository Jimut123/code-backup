clc;
clear all;
close all;

for i=0:1:360
    sine=findsine(i);
    fprintf('\n sin%f=%10.5f',i,sine);
end

