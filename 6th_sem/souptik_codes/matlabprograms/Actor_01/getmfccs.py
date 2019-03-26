#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Dec 17 09:08:51 2018

@author: souptik
"""

#get mfcc for all wav files
from librosa.feature import mfcc
#from python_speech_features import mfcc
from python_speech_features import logfbank
import scipy.io.wavfile as wav
import numpy
import os
#CHUNK_SIZE = 1024 !!
# directory of wav files
directoryName = "/home/souptik/Audio_Speech_Actors_01-24/Actor_02" # put your own directory here
# directory of results
resultsDirectory = directoryName + "/MFCCresults"

# creating directory
if not os.path.exists(resultsDirectory):
    os.makedirs(resultsDirectory)
#we have to first convert the wav files to wav files with chunk size 1024
# get MFCCs for every .wav file in our specified directory 
for filename in os.listdir(directoryName):
    if filename.endswith('.wav'): # only get MFCCs from .wavs
        # read in our file
        (rate,sig) = wav.read(directoryName + "/" +filename)

        # get mfcc
        mfcc_feat = mfcc(sig,rate,numcep=13,nfft=1103)

        # get filterbank energies
        fbank_feat = logfbank(sig,rate)

        # create a file to save our results in
        outputFile = resultsDirectory + "/" + os.path.splitext(filename)[0] + ".csv"
        file = open(outputFile, 'w+') # make file/over write existing file
        numpy.savetxt(file, fbank_feat, delimiter=",") #save MFCCs as .csv
file.close() # close file