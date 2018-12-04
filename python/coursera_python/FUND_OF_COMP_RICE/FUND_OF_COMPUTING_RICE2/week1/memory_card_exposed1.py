# simple state example for Memory

import simplegui
     
# define event handlers
def new_game():
    global state
    state = 0
    
def buttonclick():
    global state
    if state == 0:
        state = 1
    elif state == 1:
        state = 2
    else:
        state = 1
                         
def draw(canvas):
    canvas.draw_text(str(state) + " card exposed", [30, 62], 24, "White")

# create frame and add a button and labels
frame = simplegui.create_frame("Memory states", 200, 100)
frame.add_button("Restart", new_game, 200)
frame.add_button("Simulate mouse click", buttonclick, 200)


# register event handlers
frame.set_draw_handler(draw)

# get things rolling
new_game()
frame.start()
