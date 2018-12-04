#!/usr/bin/env python2
# -*- coding: utf-8 -*-
"""
Created on Fri Dec 29 19:46:42 2017

@author: root
"""

# -count_words.py *- coding: utf-8 -*-
import sys

filename = sys.argv[1]
# print("\n",filename,"\n")  # You can check that the filename is correct
    
text_file = open(filename)     # open the file for reading

# Set up an empty dictionary to start a standard design pattern loop
words_dic = {}

# This loop adds each word to the dictionary and updates its count. Change 
# all words to lower case so Horse and horse are seen as the same word.
for line in text_file:         # step through each line in the text file
    for word in line.lower().split():   # split into a list of words
        word = word.strip("'?,.;!-/\"") # strip out the stuff we ignore
        if word not in words_dic:
            words_dic[word] = 0      # add word to words with 0 count
        words_dic[word] = words_dic[word] + 1    # add 1 to the count

text_file.close() 
               
# Sorts the dictionary words into a list and then print them out
print("List of words in the file with number of times each appears.")
word_list = sorted(words_dic)
for word in word_list:
    print(words_dic[word], word)
