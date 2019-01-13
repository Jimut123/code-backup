%q72as2.m : Write a program to split one to to 2 output files
clc;
close all;
clear all;
file1=input('\nEnter Input file name=','s');
file2=input('Enter Output File-1 name=','s');
file3=input('Enter Output File-2 name=','s');
fp1=fopen(file1,'r');
fseek(fp1,0,1); % File pointer moves to end of file
n=ftell(fp1); % n=number of bytes in input file
fseek(fp1,0,-1); % File pointer moves 