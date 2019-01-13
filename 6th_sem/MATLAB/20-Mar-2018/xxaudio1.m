%xxaudio1.m: Write a program in MATLAB to read and to play some audio file

clc;
close all;
clear all;
file1 = input('\nEnter Input Audio File Name: ', 's');
file2 = input('Enter Output Audio File Name: ', 's');
[x, fs, nbits] = wavread(file1);
fprintf('fs = %d nbits = %d\n', fs, nbits);
[y, n] = size(x);
fprintf('Length of Audio data = %d n = %d\n', y, n);
sound(x, 1.2 * fs);
wavwrite(x, fs, file2);
%End of Program