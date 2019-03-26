#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Dec 23 18:01:34 2018

@author: souptik
"""
import numpy as np
from numpy import array
from numpy import zeros,newaxis
import python_speech_features as psf
import matplotlib.pyplot as plt 
from scipy.io import wavfile as wav
#import soundfile as sf
import glob as gl
import os

framearray=[[]]
b=[0]
#this is the coefficient extractor file
#for 20th frame : 
wav_path="/home/souptik/Audio_Speech_Actors_01-24/Actor_01/"
for filename in gl.glob(os.path.join(wav_path,"angry*.wavconv.wav")):
    (rate,sig)=wav.read(filename)
    mfcc_coeff=psf.mfcc(sig,rate,nfft=1200)
    twentiethframe=mfcc_coeff[:350,:]
    #twentiethframe=np.concatenate((twentiethframe,[1]),axis=0)
    framearray.append(twentiethframe)   


wav_path="/home/souptik/Audio_Speech_Actors_01-24/Actor_01/"
for filename in gl.glob(os.path.join(wav_path,"sad*.wavconv.wav")):
    (rate,sig)=wav.read(filename)
    mfcc_coeff=psf.mfcc(sig,rate,nfft=1200)
    twentiethframe=mfcc_coeff[:350,:]
    #twentiethframe=np.concatenate((twentiethframe,[2]),axis=0)
    framearray.append(twentiethframe) 

wav_path="/home/souptik/Audio_Speech_Actors_01-24/Actor_01/"
for filename in gl.glob(os.path.join(wav_path,"plain*.wavconv.wav")):
    (rate,sig)=wav.read(filename)
    mfcc_coeff=psf.mfcc(sig,rate,nfft=1200)
    twentiethframe=mfcc_coeff[:350,:]
    #twentiethframe=np.concatenate((twentiethframe,[0]),axis=0)
    framearray.append(twentiethframe) 


framearray=framearray[1:]
nframearray=array(framearray)
nframearray=np.concatenate((nframearray,np.ones(#think about this,np.int64)))
#onee=np.ones((13,1),int)
#nframearray=np.column_stack((nframearray,onee))
    

#for 40th frame:

secframearray=[[]]
wav_path="/home/souptik/Audio_Speech_Actors_01-24/Actor_01/"
for filename in gl.glob(os.path.join(wav_path,"angry*.wavconv.wav")):
    (rate,sig)=wav.read(filename)
    mfcc_coeff=psf.mfcc(sig,rate,nfft=1200)
    fortiethframe=mfcc_coeff[40,:3]
    fortiethframe=np.concatenate((fortiethframe,[1]),axis=0)
    secframearray.append(fortiethframe) 
    
wav_path="/home/souptik/Audio_Speech_Actors_01-24/Actor_01/"
for filename in gl.glob(os.path.join(wav_path,"sad*.wavconv.wav")):
    (rate,sig)=wav.read(filename)
    mfcc_coeff=psf.mfcc(sig,rate,nfft=1200)
    fortiethframe=mfcc_coeff[40,:3]
    fortiethframe=np.concatenate((fortiethframe,[2]),axis=0)
    secframearray.append(fortiethframe) 
    
    wav_path="/home/souptik/Audio_Speech_Actors_01-24/Actor_01/"
for filename in gl.glob(os.path.join(wav_path,"plain*.wavconv.wav")):
    (rate,sig)=wav.read(filename)
    mfcc_coeff=psf.mfcc(sig,rate,nfft=1200)
    fortiethframe=mfcc_coeff[40,:3]
    fortiethframe=np.concatenate((fortiethframe,[0]),axis=0)
    secframearray.append(fortiethframe) 

secframearray=secframearray[1:]
nsecframearray=array(secframearray)

X = nframearray[:,:13]
y = nframearray[:,-1]

from sklearn.model_selection import train_test_split
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size = 0.2, random_state = 0)

# Feature Scaling
from sklearn.preprocessing import StandardScaler
sc = StandardScaler()
X_train = sc.fit_transform(X_train)
X_test = sc.transform(X_test)

# Fitting classifier to the Training set
# Create your classifier here
from sklearn.neighbors import KNeighborsClassifier
classifier=KNeighborsClassifier(n_neighbors=5,metric="minkowski",p=2)
classifier.fit(X_train,y_train)

y_pred = classifier.predict(X_test)



from sklearn.metrics import confusion_matrix
cm = confusion_matrix(y_test, y_pred)



from matplotlib.colors import ListedColormap
X_set, y_set = X_train, y_train
X1, X2 = np.meshgrid(np.arange(start = X_set[:, 0].min() - 1, stop = X_set[:, 0].max() + 1, step = 0.01),
                     np.arange(start = X_set[:, 1].min() - 1, stop = X_set[:, 1].max() + 1, step = 0.01))
plt.contourf(X1, X2, classifier.predict(np.array([X1.ravel(), X2.ravel()]).T).reshape(X1.shape),
             alpha = 0.75, cmap = ListedColormap(('red', 'green','blue')))
plt.xlim(X1.min(), X1.max())
plt.ylim(X2.min(), X2.max())
for i, j in enumerate(np.unique(y_set)):
    plt.scatter(X_set[y_set == j, 0], X_set[y_set == j, 1],
                c = ListedColormap(('red', 'green','blue'))(i), label = j)
plt.title('K-NN (Training set)')
plt.xlabel('X1')
plt.ylabel('X2')
plt.legend()
plt.show()






from matplotlib.colors import ListedColormap
X_set, y_set = X_test, y_test
X1, X2 = np.meshgrid(np.arange(start = X_set[:, 0].min() - 1, stop = X_set[:, 0].max() + 1, step = 0.01),
                     np.arange(start = X_set[:, 1].min() - 1, stop = X_set[:, 1].max() + 1, step = 0.01))
plt.contourf(X1, X2, classifier.predict(np.array([X1.ravel(), X2.ravel()]).T).reshape(X1.shape),
             alpha = 0.75, cmap = ListedColormap(('red', 'green','blue')))
plt.xlim(X1.min(), X1.max())
plt.ylim(X2.min(), X2.max())
for i, j in enumerate(np.unique(y_set)):
    plt.scatter(X_set[y_set == j, 0], X_set[y_set == j, 1],
                c = ListedColormap(('red', 'green','blue'))(i), label = j)
plt.title('KNN (Test set)')
plt.xlabel('X1')
plt.ylabel('X2')
plt.legend()
plt.show()

