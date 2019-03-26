%steganography to hide a secret message within  a .bmp file;

clc;
clear all;
close all;


file1=input('Enter image file name','s');
text=input('Enter secret message','s');
fp1=fopen(file1,'r+');
fseek(fp1,0,1);
n=ftell(fp1);
fseek(fp1,0,-1);
i=1;

%convert text to bits

text_length=length(text);
for i=1:text_length
    bits()
