#!/usr/bin/env python2
# -*- coding: utf-8 -*-
"""
Created on Fri Dec 29 19:47:05 2017

@author: root
"""

# - print_file.py *- coding: utf-8 -*-
""" Opens file and prints its contents line by line. """

#import sys     # we need this library to deal with operating system

#filename = sys.argv[1]

filename = input("Enter a filename : ")


infile = open(filename)

for line in infile:
    print(line,end="") # the file has "\n" at the end of each line already

infile.close()
