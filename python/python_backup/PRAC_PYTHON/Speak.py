import pyttsx
from .engine import Engine
from .import driver
engine = pyttsx.init()
engine.say('Good morning.')
engine.runAndWait()
