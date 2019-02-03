from __future__ import print_function
from PIL import Image

im = Image.open("img_1.jpg")
print(im.format, im.size, im.mode)
im.show()