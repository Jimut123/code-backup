%number_to_word_main.m : Write main program to convert number to words
clc;
close all;
clear all;
n1=input('\nEnter lower limit=');
n2=input('Enter upper limit=');
count=0;
for i=n1:n2
number_to_word(i);
count=count+1;
if mod(count,15)==0
    ch=input('\nPress enter key to continue--->\n','s');
    clc;
end
end
%end of program

