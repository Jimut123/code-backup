#!/usr/bin/env python2
# -*- coding: utf-8 -*-
"""
Created on Fri Dec 29 19:45:57 2017

@author: root
"""

# - lwc.py *- coding: utf-8 -*-
import sys

filename = sys.argv[1]
# print("\n",filename,"\n")  # You can check that the filename is correct
    
text_file = open(filename)     # open the file for reading

# initialize line, word, and char counters to 0
linect = 0
wordct = 0     
charct = 0

for line in text_file:           # step through each line in the text file
    linect = linect + 1
    for word in line.split():    # split into a list of words
        wordct = wordct + 1
    charct = charct + len(line)

text_file.close() 
               
print(linect, wordct, charct )