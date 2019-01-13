%number_to_words_main.m : Write main function to convert number to words
clc;
close all;
clear all;
n1=input('\nEnter lower limit=');
n2=input('Enter upper  limit=');
count=0;
    for i=n1:n2
        number_to_words(i);
        count=count+1;
        if mod(count,15)==0
            ch=input('\nPress Enter Key --->\n');
            clc;
        end
    end
    %End of program
