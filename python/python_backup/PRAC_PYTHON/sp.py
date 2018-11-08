""" 
pyttsx deadlocks in certain conditions.

This code has been tested and runs on:
Python 3.4.3, Windows 32-bit.
Python 3.5.1, Windows 64-bit.
Python 3.6.1, Windows 64-bit.

This code, below, is strongly based on @shark3y's answer on Stack Overflow:
http://stackoverflow.com/a/39069269/8014
"""

import sys
print(sys.version)

import pyttsx

class VoiceAssistant():
    def __init__(self):
        self.engine = pyttsx.init()

    def add_say(self, msg):
        self.engine.say(msg)

        print("runAndWait starts.")
        try:
            self.engine.runAndWait()
        except:
            print("runAndWait had an exception.")  # Doesn't happen
        print("runAndWait completes.")  # Happens


if __name__ == '__main__':
    va = VoiceAssistant()
    for i in range(0, 3):
        va.add_say('Sally sells seashells by the seashore.')
    print("Done")