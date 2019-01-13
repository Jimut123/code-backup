%xxaudio2.m: Write a program in MATLAB to reverse a sound file and then
%play the reverse sound file
clc;
close all;
clear all;
file1 = input('\nEnter Input Audio File Name: ', 's');
file2 = input('Enter Output Audio File Name: ', 's');
[x, fs, nbits] = wavread(file1);
fprintf('fs = %d nbits = %d\n', fs, nbits);
[y, n] = size(x);
fprintf('Length of Audio data = %d n = %d\n', y, n);
z(1:y) = x(y : -1 : 1);
sound(z, fs);
wavwrite(z, fs, file2);
%End of Program