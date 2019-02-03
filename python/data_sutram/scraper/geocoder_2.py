import geocoder
import unicodecsv
import logging
import time
import csv

pcode=[]

with open('locs2.csv', 'rb') as f:
    reader = csv.DictReader(f)
    for line in reader:            
        lat = float(line['lat'])
        lon = float(line['lon'])
        g = geocoder.mapquest([lat,lon], method='reverse')
        attempts = 1  # number of lookups
        while not(g.ok) and attempts < 4:
            logging.warning('Geocoding ERROR: {}'.format(g.debug()))
            time.sleep(2)  # 2 seconds are specified in the API. If you still get errors, it's because you've reached the daily quota.
            g = geocoder.mapquest([lat,lon], method='reverse')
            attempts += 1
        if attempts > 3:
            logging.warning('Daily quota of google lookups exceeded.')
            break
        pcode.extend(g.postal)
        logging.info('Geocoding SUCCESS: ({},{},{})'.format(lat,lon,pcode))