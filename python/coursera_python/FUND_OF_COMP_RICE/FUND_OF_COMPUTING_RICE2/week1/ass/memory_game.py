# implementation of card game - Memory

import simplegui
import random

# for repeatition check

# helper function to initialize globals
def new_game():
    cards1 = range(0,8)
    cards2 = range(0,8)
    random.shuffle(cards1)
    random.shuffle(cards2)
    global cardDeck
    cardDeck = cards1 + cards2
    random.shuffle(cardDeck)
    global exposed
    exposed = [False] * 16
    global turns, count
    turns = [-1] * 2
    count = 0
    label.set_text("Turns = " + str(count))
    
# define event handlers
def mouseclick(pos):
    # add game state logic here
    global turns, count
    # if its 1st Turn just flip (state 0)
    if turns[0] == -1 and exposed[pos[0] / 50] == False:
        turns[0] = pos[0] / 50
        exposed[turns[0]] = True
        
    # if its 2nd Turn (state 1)
    elif turns[1] == -1 and exposed[pos[0] / 50] == False:
        turns[1] = pos[0] / 50
        exposed[turns[1]] = True
        #increase overall count of turns after end of both turns 
        count += 1
        label.set_text("Turns = " + str(count))
        if False not in exposed:
            label.set_text("Won the Game in " + str(count) + " Turns, Press Reset for New Game!" )
    
    # if its 1st Turn (state 2)
    elif turns[1] != -1 and exposed[pos[0] / 50] == False:
        # if cards doesn't pair flip back both
        if cardDeck[turns[0]] != cardDeck[turns[1]]:
            exposed[turns[1]] = False
            exposed[turns[0]] = False
            turns[1] = -1
            turns[0] = pos[0] / 50
            exposed[turns[0]] = True
        else:
            turns[1] = -1
            turns[0] = pos[0] / 50
            exposed[turns[0]] = True
        
        

                        
# cards are logically 50x100 pixels in size    
def draw(canvas):
    for index, card in enumerate(cardDeck):
        if exposed[index] == True:
            canvas.draw_polygon([(index*50, 0), ((index*50) + 50, 0), ((index*50) + 50, 100), (index*50 , 100)], 1, 'Black', 'White')
            canvas.draw_text(str(card), ((index*50) + 10, 70), 65, 'Red')
        else:
            canvas.draw_polygon([(index*50, 0), ((index*50) + 50, 0), ((index*50) + 50, 100), (index*50 , 100)], 1, 'Black', 'Green')


# create frame and add a button and labels
frame = simplegui.create_frame("Memory", 800, 100)
frame.add_button("Reset", new_game)
label = frame.add_label("Turns = 0")

# register event handlers
frame.set_mouseclick_handler(mouseclick)
frame.set_draw_handler(draw)

# get things rolling
new_game()
frame.start()


