%xxaudio31.m: Input 2 audio files. Mix 2 audio files and then play the
%modified audio files
clc;
close all;
clear all;
file1 = input('\nEnter 1st Input Audio File Name: ', 's');
file2 = input('\nEnter 2nd Input Audio File Name: ', 's');
file3 = input('Enter Output Audio File Name: ', 's');
[x1, fs1, nbits1] = wavread(file1);
fprintf('fs = %d nbits = %d\n', fs1, nbits1);
[x2, fs2, nbits2] = wavread(file2);
if fs1 > fs2
    fs = fs1;
else
    fs = fs2;
end
[y1, n1] = size(x1);
[y2, n2] = size(x2);
fprintf('Length of 1st Audio data = %d n = %d\n', y1, n1);
fprintf('Length of 2nd Audio data = %d n = %d\n', y2, n2);
i = 1;
j = y1;
    z(i:j) = x1(1:y1);
    i = i + y1;
    j = j + y2;
    z(i:j) = x2(1:y2);
[y3, n3] = size(z);
fprintf('Length of Output Audio data = %d n = %d\n', y3, n3);
sound(z, fs);
wavwrite(z, fs, file2);
%End of Program