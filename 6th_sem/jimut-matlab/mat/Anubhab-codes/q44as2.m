%q44as2.m : Write a program to implement towers of hanoi problem
clc;
close all;
clear all;
global n;
nd=input('\nEnter number of disks to be moved = ');
n=0;
hanoi(nd,1,2,3);
fprintf('\nTotal number of operations performed = %d\n',n);
%end of Towers of Hanoi program