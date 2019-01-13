%xxaudio3.m: Copy a sound file multiple times. Play the modified sound file
clc;
close all;
clear all;
file1 = input('\nEnter Input Audio File Name: ', 's');
file2 = input('Enter Output Audio File Name: ', 's');
m = input('Enter how many times you want to copy audio file: ');
[x, fs, nbits] = wavread(file1);
fprintf('fs = %d nbits = %d\n', fs, nbits);
[y, n] = size(x);
fprintf('Length of Audio data = %d n = %d\n', y, n);
i = 1;
j = y;
for k = 1 : m
    z(i:j) = x(1:y);
    i = i + y;
    j = j + y;
end
sound(z, fs);
wavwrite(z, fs, file2);
%End of Program