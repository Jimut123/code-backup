%prog_1.m : Write a program to enter your name,email,phone number
clc;
close all;
clear all;
name=input('\nEnter Your name=','s');
email=input('Enter Your e-mail=','s');
phone=input('Enter Your Phone number=','s');
fprintf('Your name=%s\n',name);
fprintf('Your email=%s\n',email);
fprintf('Your Phone number=%s\n',phone);
