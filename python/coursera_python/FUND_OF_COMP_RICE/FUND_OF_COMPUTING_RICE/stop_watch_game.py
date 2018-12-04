# template for "Stopwatch: The Game"
import simplegui
import math
import random
import time
# define global variables
x = 0	# no. of sucessful stops
y = 0	# no. of total stops
current_time = 0

# define helper function format that converts time
# in tenths of seconds into formatted string A:BC.D
    
def format(t):
    #print "======Time = ",t
    sec = t/10
    #print "sec :",sec 
    mil_sec = t - sec*10
    mins = sec/60
    sec = sec - 60*mins
    #print "mins : ",mins
    #print "mil sec :",mil_sec
    #print "sec left :",sec
    str_sec=""
    if sec<10:
        str_sec = '0'+str(sec)
        #print "sec :",str_sec
    else:
        str_sec = str(sec)
    str_time = str(mins)+":"+str_sec+"."+str(mil_sec)
    return str_time
    #sec_left
    
# define event handlers for buttons; "Start", "Stop", "Reset"
def start():
    timer.start()
    pass
def stop():
    global current_time
    global y
    if timer.is_running()==True:
        y = y + 1 # to increment the total no. of stops pressed
    # to get the whole no. of time
    get_time = format(current_time)
    whole_time = get_time[5:]
    #print whole_time
    global x
    if int(whole_time) == 0:
        x = x + 1
    if timer.is_running():
        timer.stop()
    pass
def reset():
    global current_time
    current_time = 0
    global x
    x = 0
    global y
    y = 0
    pass

# this timer handler just increments the timer by 0.1 sec
def timer_handler():
    global current_time
    current_time = current_time + 1
    #print current_time
    
# define event handler for timer with 0.1 sec interval


# define draw handler
def draw_handler(canvas):
    global current_time
    current_time_str = format(current_time)
    canvas.draw_text(str(current_time_str),[30,100],30,'Red')
    global x, y
    str1 = str(x)+"/"+str(y) 
    canvas.draw_text(str1,[130,20],20,'Red')


# create frame
frame = simplegui.create_frame('Stopwatch', 200, 200)
button1 = frame.add_button('start', start)
button2 = frame.add_button('stop', stop)
button3 = frame.add_button('reset', reset)

# the draw canvas handler
frame.set_draw_handler(draw_handler)

# register event handlers
timer = simplegui.create_timer(100, timer_handler)
timer.start()

# start frame

frame.start()
# Please remember to review the grading rubric
