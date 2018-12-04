# template for "Guess the number" mini-project
# input will come from buttons and an input field
# all output for the game will be printed in the console
import random
import simplegui
import math
global secret_number

chances = 8
num_range = 100

# helper function to start and restart the game
def new_game():
    # initialize global variables used in your code here
    global secret_number
    global num_range
    secret_number = random.randint(0,num_range)
    global chances
    chances = 8
    # remove this when you add your code    
    #pass


# define event handlers for control panel
def range100():
    # button that changes the range to [0,100) and starts a new game 
    global num_range
    num_range = 100
    # remove this when you add your code  
    new_game()

def range1000():
    # button that changes the range to [0,1000) and starts a new game     
    global num_range
    num_range = 1000
    new_game()
    
def input_guess(guess):
    # main game logic goes here	
    print ""
    int_guess = int(guess)
    print "Guess was ",int_guess
    global secret_number
    if int_guess < secret_number:
        print "Higher"
    elif int_guess > secret_number:
        print "Lower"
    else:
        print "Correct"
        print "You Won!"
        new_game()
    global chances
    chances = chances - 1
    print "No. of chances remaining : ",chances
    if chances == 0:
        print "No. of chances left : ",chances
        new_game()
    # remove this when you add your code
    #pass

    
# create frame
frame = simplegui.create_frame('Guess The no.', 200, 200)

# register event handlers for control elements and start frame
frame.add_button("Range is [0,100) ",range100,200)
frame.add_button("Range is [0,1000) ",range1000,200)
inp = frame.add_input('Enter a guess ', input_guess, 50)
#print inp
# call new_game 
new_game()


# always remember to check your completed program against the grading rubric
