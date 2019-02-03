from __future__ import print_function
import sys
from PIL import Image
from PIL import ImageFilter
from PIL import ImageEnhance

for infile in sys.argv[1:]:
    try:
        im = Image.open(infile)
        """
        box = (100, 100, 400, 400)
        region = im.crop(box)
        #region.show()
        out = im.resize((128, 128))
        out = im.rotate(45) # degrees counter-clockwise
        out.show()
        
        out = im.transpose(Image.FLIP_LEFT_RIGHT)
        out.show()
        
        out = im.transpose(Image.FLIP_TOP_BOTTOM)
        out.show()
        
        out = im.transpose(Image.ROTATE_90)
        out.show()
        
        out = im.transpose(Image.ROTATE_180)
        out.show()
        
        out = im.transpose(Image.ROTATE_270)
        out.show()
        
        out = im.convert("L")
        out.show()
        
        out = im.filter(ImageFilter.DETAIL)
        out.show()
        
        # multiply each pixel by 1.2
        out = im.point(lambda i: i * 1.2)
        out.show()
        
        # split the image into individual bands
        source = im.split()

        R, G, B = 0, 1, 2

        # select regions where red is less than 100
        mask = source[R].point(lambda i: i < 100 and 255)

        # process the green band
        out = source[G].point(lambda i: i * 0.7)

        # paste the processed band back, but only where red was < 100
        source[G].paste(out, None, mask)

        # build a new multiband image
        im = Image.merge(im.mode, source)
        im.show()
        
        enh = ImageEnhance.Contrast(im)
        enh.enhance(1.3).show("30% more contrast")
        """

        
    except:
        print("?")
