def seconds_difference(time_1, time_2):
    return time_2 - time_1    

def hours_difference(time_1, time_2):
    return (time_2 -  time_1)/3600

def to_float_hours(hours, minutes, seconds):
    return (hours*60*60+minutes*60+seconds)/3600.0

def to_24_hour_clock(hours):
    return hours % 24

### Write your get_hours function definition here:

def get_hours(number):
    hr =  number//3600
    return to_24_hour_clock(hr)

### Write your get_minutes function definition here:

def get_minutes(number):
    mn = (number % 3600)//60
    return mn

### Write your get_seconds function definition here:

def get_seconds(number):
    sec = (number % 3600)%60
    return sec



def time_to_utc(utc_offset, time):
    """ (number, float) -> float

    Return time at UTC+0, where utc_offset is the number of hours away from
    UTC+0.

    >>> time_to_utc(+0, 12.0)
    12.0
    >>> time_to_utc(+1, 12.0)
    11.0
    >>> time_to_utc(-1, 12.0)
    13.0
    >>> time_to_utc(-11, 18.0)
    5.0
    >>> time_to_utc(-1, 0.0)
    1.0
    >>> time_to_utc(-1, 23.0)
    0.0
    """
    return to_24_hour_clock(time - utc_offset)


def time_from_utc(utc_offset, time):
    """ (number, float) -> float

    Return UTC time in time zone utc_offset.

    >>> time_from_utc(+0, 12.0)
    12.0
    >>> time_from_utc(+1, 12.0)
    13.0
    >>> time_from_utc(-1, 12.0)
    11.0
    >>> time_from_utc(+6, 6.0)
    12.0
    >>> time_from_utc(-7, 6.0)
    23.0
    >>> time_from_utc(-1, 0.0)
    23.0
    >>> time_from_utc(-1, 23.0)
    22.0
    >>> time_from_utc(+1, 23.0)
    0.0
    """
    return to_24_hour_clock(time + utc_offset)


