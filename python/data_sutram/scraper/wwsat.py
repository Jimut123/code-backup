import urllib2
import os
import re

try:
        import Image
except:
        print 'You do not have PIL installed'
        print 'www.pythonware.com/products/pil/'
        sys.exit(2)
import sys, getopt

hBox = .0021
size = 512
filetype = 'png'
folderbase = 'wwsat'
foldercounter = 0
folderfinal = ''

input_format = 'python wwsat.py --center=<lat,long> --range=<lat,long> --quality=<l,m,h,xh> --block-size=<block size> --file-type=<jpeg,png> -f folder_name\npython wwsat.py --top-left=<lat,long> --bottom-right=<lat,long> --quality=<l,m,h,xh> --block-size=<block size> --file-type=<jpeg,png> -f folder_name'
def make_exists(n):
    if not os.path.exists(n):
        os.makedirs(n)

def get_truncation(x,y, startlat, startlong, name):
    temp = urllib2.urlopen("http://worldwind27.arc.nasa.gov/wms/virtualearth?service=WMS&request=GetMap&version=1.1.1&srs=EPSG:4326&layers=ve&styles=&transparent=FALSE&format=image/%s&width=%d&height=%d&bbox=%f,%f,%f,%f"% (filetype, size, size, startlong + hBox * (x ), startlat + hBox* (y), startlong + hBox * (x + 1), startlat + hBox *(y + 1)),timeout=100000)
    print "http://worldwind27.arc.nasa.gov/wms/virtualearth?service=WMS&request=GetMap&version=1.1.1&srs=EPSG:4326&layers=ve&styles=&transparent=FALSE&format=image/%s&width=%d&height=%d&bbox=%f,%f,%f,%f"% (filetype, size, size, startlong + hBox * (x ), startlat + hBox* (y), startlong + hBox * (x + 1), startlat + hBox *(y + 1))
    output = open(folderfinal + '/%s.%s' % (name, filetype),'wb')
    output.write(temp.read())
    output.close()

def get_truncation(name, startlat, startlong, endlat, endlong):
    temp = urllib2.urlopen("http://worldwind27.arc.nasa.gov/wms/virtualearth?service=WMS&request=GetMap&version=1.1.1&srs=EPSG:4326&layers=ve&styles=&transparent=FALSE&format=image/%s&width=%d&height=%d&bbox=%f,%f,%f,%f"% (filetype, size, size, startlong, startlat, endlong, endlat))
    print "http://worldwind27.arc.nasa.gov/wms/virtualearth?service=WMS&request=GetMap&version=1.1.1&srs=EPSG:4326&layers=ve&styles=&transparent=FALSE&format=image/%s&width=%d&height=%d&bbox=%f,%f,%f,%f"% (filetype, size, size, startlong, startlat, endlong, endlat)
    output = open(folderfinal + '/%s.%s' % (name, filetype),'wb')
    output.write(temp.read())
    output.close()


def prep_folder(opts):
        fopt = False
        global foldercounter
        global folderfinal
        for opt, arg in opts:
                if opt.lower() == '-f':
                        fopt = True
                        folderfinal = arg


        if not fopt: 
                while (os.path.exists(folderbase + str(foldercounter))):
                        foldercounter += 1
                folderfinal = folderbase + str(foldercounter)

        make_exists(folderfinal)

def check_mode(opts):
        c = False;
        s = False;
        for opt, args in opts:
                if opt.lower() == '--center':
                        c = True
                elif opt.lower() == '--top-left':
                        s = True
        if c and s:
                raise Exception()
        elif c:
                return 1
        elif s:
                return 2
        else:
                raise Exception()
def get_vars(opts):
        coords = dict()
        global size
        global filetype
        global hBox
        for opt, arg in opts:
                if opt.lower() in ('--center','--range','--top-left','--bottom-right'):
                        coords[opt.lower()[2:] + 'lat' ] = float(re.split(',',arg)[0])
                        coords[opt.lower()[2:] + 'long' ] = float(re.split(',',arg)[1])
                elif opt.lower() == '--block_size':
                        size = int(arg)
                        if (not arg > 0):
                                raise Exception()
                elif opt.lower() == '--file-type':
                        if (not arg == 'png' and not arg == 'jpeg'):
                                raise Exception()
                        else:
                                filetype = arg
                elif opt.lower() == '--quality':
                        print arg
                        if (arg == 'l'):
                                hBox = .003
                        elif (arg == 'h'):
                                hBox = .001
                        elif (arg == 'xh'):
                                hBox = .0005
                        else:
                                hBox = .0021
        if len(coords) < 4:
                raise Exception()
        else:
                return coords


def main(argv):
        try:
                opts, args = getopt.getopt(argv, 'cf:s',['center=','range=','top-left=','bottom-right=','quality=','file-type=','block-size='])
                mode = check_mode(opts)

                coords = get_vars(opts)
        except:
                print input_format
                sys.exit(0)

        if mode == 1:
                print 'Center mode enabled.'

                try: 
                        center = [coords['centerlat'],coords['centerlong']]
                        rangel = [coords['rangelat'],coords['rangelong']]

                        top_left = [center[0] + rangel[0],center[1] - rangel[1]]
                        bottom_right = [center[0] - rangel[0],center[1] + rangel[1]]
                except:
                        print input_format
                        sys.exit(0)
        else:
                print 'Selection mode enabled.'
                
                try: 
                        top_left = [coords['top-leftlat'],coords['top-leftlong']]
                        bottom_right = [coords['bottom-rightlat'],coords['bottom-rightlong']]
                except:
                        print input_format
                        sys.exit(0)

        print

        print 'Top left corner coordinates:', top_left
        print 'Bottom right corner coordinates:', bottom_right

        bottom_left = [bottom_right[0],top_left[1]]
        
        print

        diflat = top_left[0] - bottom_right[0]
        diflong = bottom_right[1] - top_left[1]


        if (diflat <= 0 or diflong <= 0):
                print 'Invalid coordinates. Exiting.'
                sys.exit(0)

        print 'Latitude difference:',diflat
        print 'Longitude difference:',diflong
        print

        latdim = int(diflat/hBox) + 1
        longdim = int(diflong/hBox) + 1
        total = latdim * longdim

        print 'Latitude units to capture:',latdim
        print 'Longitude units to capture:',longdim
        print 'Total units:',total
        print
        print 'Preparing folder.'

        prep_folder(opts)

        print 'Created folder', folderfinal
        print
        print 'Beginning download.'
        print 'Starting capture from {%f,%f}' % (bottom_left[0],bottom_left[1])
        counter = 0
        
        for lat in range(latdim):
                for longi in range(longdim):
                        while True:
                            try:
                                lati = latdim - lat - 1
                                print 'Capturing %d.%d from {%f,%f} to {%f,%f}: %.1f%% finished.' % (latdim - lat - 1, longi, bottom_left[0] + hBox*(lat), bottom_left[1] + hBox*(longi), bottom_left[0] + hBox*(lat + 1),bottom_left[1] + hBox*(longi + 1),float(100 * counter)/total)         
                                get_truncation('%s.%s'%(str(lati),str(longi)),bottom_left[0] + hBox*(lat), bottom_left[1] + hBox*(longi), bottom_left[0] + hBox*(lat + 1),bottom_left[1] + hBox*(longi + 1))
                                im = Image.open('%s/%d.%d.%s' % (folderfinal,lati,longi,filetype))
                                counter += 1
                                break
                            except:
                                print "Image invalid. Trying again."

        print 'Finished download. 100% finished.'                
        print 'Compiling image.'
        new_im = Image.new('RGB', (size * longdim, size*latdim))

        for n in range(longdim):
            for m in range(latdim):
                print 'Pasting %s/%d.%d.%s' % (folderfinal,m,n,filetype)
                try:
                        im = Image.open('%s/%d.%d.%s' % (folderfinal,m,n,filetype))
                        new_im.paste(im,(n*size,m*size))
                except:
                        try:
                                print 'Error occurred: substituting %s/%d.%d.%s' % (folderfinal,m,n - 1,filetype)
                                im = Image.open('%s/%d.%d.%s' % (folderfinal,m,n - 1,filetype))
                                new_im.paste(im,(n*size,m*size))
                        except:
                                print 'Well, that didn\'t work either. Leaving it blank, then'
        
        pwidth, pheight = new_im.size
        
        width_crop = float(diflong)/(float(longdim)*hBox) * pwidth
        height_crop = float(diflat)/(float(latdim)*hBox) * pheight

        tempim = new_im.crop((0,pheight - int(height_crop),int(width_crop),pheight))
        tempim.show()
        tempim.save(folderfinal + '/compiled.%s' %(filetype))

        awidth, aheight = tempim.size
        print 'Image original size:%d,%d' % (pwidth,pheight)
        print 'Image cropped to:%d,%d' % (awidth,aheight)
        print 'Image saved.'
        
if __name__ == '__main__':
        main(sys.argv[1:])
