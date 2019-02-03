"""
Here is the extracted answer (in pseudo code) for quick reference.

Given Longitude/latitude/zoom to tile numbers :

n = 2 ^ zoom
xtile = n * ((lon_deg + 180) / 360)
ytile = n * (1 - (log(tan(lat_rad) + sec(lat_rad)) / π)) / 2

Note that log() in this pseudo code refers to natural log (often "ln()" in common math syntax, but often "log()" in many programming languages).

Given Tile numbers to longitude/latitude :

n = 2 ^ zoom
lon_deg = xtile / n * 360.0 - 180.0
lat_rad = arctan(sinh(π * (1 - 2 * ytile / n)))
lat_deg = lat_rad * 180.0 / π

"""
def ret_max_latlon():
    import math
    from os import listdir
    from os.path import isfile, join
    mypath = "./satellite_data"
    onlyfiles = [f for f in listdir(mypath) if isfile(join(mypath, f))]
    max_file = max(onlyfiles)
    #print()
    print(max_file)
    _ = max_file.find('_')
    jp = max_file.find('.jpeg')
    x_tyle = max_file[:_]
    y_tyle = max_file[_+1:jp]

    print(x_tyle,y_tyle)
    """
    n = 2 ^ zoom
    lon_deg = xtile / n * 360.0 - 180.0
    lat_rad = arctan(sinh(π * (1 - 2 * ytile / n)))
    lat_deg = lat_rad * 180.0 / π
    """
    zoom = 19
    n = 2**zoom
    lon_deg = int(x_tyle)/n * 360.0 - 180.0
    print(lon_deg)

    lat_rad = math.atan(math.asinh(math.pi * (1 - 2 * int(y_tyle)/n)))
    lat_deg = lat_rad * 180.0 / math.pi

    print(lat_deg)
    return lat_deg, lon_deg

if __name__ == "__main__":
    ret_max_latlon()
