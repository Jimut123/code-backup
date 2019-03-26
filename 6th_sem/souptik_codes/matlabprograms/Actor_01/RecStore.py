import python_speech_features as psf
import matplotlib.pyplot as plt 
from scipy.io import wavfile as wav
import argparse
import numpy as np
import scipy as sp
from scipy import signal


parser=argparse.ArgumentParser(description="TO PROCESS A SOUND FILE")
parser.add_argument("FILE",type=str)
args=parser.parse_args()



(rate,sig)=wav.read("/media/souptik/6E61AA6F559D66EC/PROJECT/"+args.FILE)

plt.plot(sig) 
plt.title('Original Signal Spectrum')
plt.xlabel('Frequency(Hz)')
plt.ylabel('Amplitude')
plt.show()

FourierTransform=sp.fft(sig)
scale=sp.linspace(0,rate,len(sig))

plt.stem(scale[0:5000], np.abs(FourierTransform[0:5000]), 'r')  # The size of our diagram
plt.title('Signal spectrum after FFT')
plt.xlabel('Frequency(Hz)')
plt.ylabel('Amplitude')
plt.show()

GaussNoise=np.random.rand(len(FourierTransform))
NewSound=GaussNoise + sig

b,a = signal.butter(5, 1000/(rate/2), btype='highpass')
filteredSignal = signal.lfilter(b,a,NewSound)
plt.plot(filteredSignal) # plotting the signal.
plt.title('Highpass Filter')
plt.xlabel('Frequency(Hz)')
plt.ylabel('Amplitude')
plt.show()


c,d = signal.butter(5, 380/(rate/2), btype='lowpass') # ButterWorth low-filter
newFilteredSignal = signal.lfilter(c,d,filteredSignal) # Applying the filter to the signal
plt.plot(newFilteredSignal) # plotting the signal.
plt.title('Lowpass Filter')
plt.xlabel('Frequency(Hz)')
plt.ylabel('Amplitude')
plt.show()

wav.write("New-Filtered-Signal.wav", rate, newFilteredSignal) # Saving it to the file.


mfcc_coeff=psf.mfcc(newFilteredSignal,rate,numcep=13,nfft=1103)
plt.plot(mfcc_coeff)
#plt.ylabel("Frequnecy/Rate")
plt.title("MFCC Plot of Filtered Signal")
plt.show()
print(mfcc_coeff)
