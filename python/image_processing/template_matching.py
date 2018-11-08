import cv2
import numpy as np
form matplotlib import pyplot as plt

img = cv2.imread('city.jpg',0)
img2 = img.copy()

template = cv2.imread('template.jpg',0)
