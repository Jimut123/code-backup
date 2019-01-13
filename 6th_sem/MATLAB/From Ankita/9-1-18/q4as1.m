%q4as1.m
clc;
close all;
clear all;
a=input('\na=');
b=input('\nb=');
h=hcf(a,b);
l=lcm(a,b);
fprintf('\nThe hcf of %d and %d is %d',a,b,h);
fprintf('\nThe lcm of %d and %d is %d',a,b,l);