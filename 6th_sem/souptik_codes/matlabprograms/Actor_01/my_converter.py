#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Dec 23 18:01:34 2018

@author: souptik
"""
import python_speech_features as psf
import matplotlib.pyplot as plt 
from scipy.io import wavfile as wav
import soundfile as sf
import glob as gl
import os
wav_path="/home/souptik/Audio_Speech_Actors_01-24/Actor_01/"
for filename in gl.glob(os.path.join(wav_path,"*.wav")):
    data, samplerate = sf.read(filename)
    sf.write(filename+"conv.wav", data, samplerate, subtype='PCM_16')
(rate,sig)=wav.read("/home/souptik/Audio_Speech_Actors_01-24/Actor_01/03-01-01-01-01-01-01.wavconv.wav")
mfcc_coeff=psf.mfcc(sig,rate)
plt.plot(mfcc_coeff)
plt.show()
extract=mfcc_coeff[90,:]
print(mfcc_coeff)
print(extract)
