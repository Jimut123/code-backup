%q72as2.m : Write a program to split 1 file to 2 output files
clc;
close all;
clear all;
file1=input('\nEnter Input File name = ','s');
file2=input('\nEnter Output File name = ','s');
file3=input('\nEnter Output File name = ','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
fp3=fopen(file3,'w');
fseek(fp1,0,1); %Moving file pointer to end of file
n=ftell(fp1);
n1=fix(n/2);
fseek(fp1,0,-1); %moving file