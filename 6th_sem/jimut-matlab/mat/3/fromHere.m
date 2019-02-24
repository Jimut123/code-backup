clc;
close all;
clear all;
global n;
nd=input('ENter the value of n: ');
n=hanoi(1,2,3,nd);
fprintf('The number of moves is %d', n);
