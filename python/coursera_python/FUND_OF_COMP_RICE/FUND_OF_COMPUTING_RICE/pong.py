# Implementation of classic arcade game Pong

import simplegui
import random

# initialize globals - pos and vel encode vertical info for paddles
WIDTH = 600
HEIGHT = 400       
BALL_RADIUS = 20
PAD_WIDTH = 8
PAD_HEIGHT = 80
HALF_PAD_WIDTH = PAD_WIDTH / 2
HALF_PAD_HEIGHT = PAD_HEIGHT / 2
LEFT = False
RIGHT = True
ball_pos = [WIDTH / 2, HEIGHT / 2]
ball_vel = [2, 0] # pixels per update (1/60 seconds)


# initialize ball_pos and ball_vel for new bal in middle of table
# if direction is RIGHT, the ball's velocity is upper right, else upper left
def spawn_ball(direction):
    global ball_pos, ball_vel # these are vectors stored as lists
    ball_pos = [WIDTH / 2, HEIGHT / 2]
    
    
    if direction == RIGHT:
        ball_vel = [2, -2] # pixels per update (1/60 seconds)
    if direction == LEFT:
        ball_vel = [-2, -2] # pixels per update (1/60 seconds)
    


# define event handlers
def new_game():
    global paddle1_pos, paddle2_pos, paddle1_vel, paddle2_vel  # these are numbers
    global score1, score2  # these are ints
    
    
    paddle1_pos = [HEIGHT/2-PAD_HEIGHT/2, HEIGHT/2+PAD_HEIGHT/2]
    paddle2_pos = [HEIGHT/2-PAD_HEIGHT/2, HEIGHT/2+PAD_HEIGHT/2]
    
    paddle1_vel = 0
    paddle2_vel = 0
    
    # THIS PART NEEDS TO BE REVISITED
    spawn_ball(LEFT)
    

def draw(canvas):
    global score1, score2, paddle1_pos, paddle2_pos, ball_pos, ball_vel
    global paddle1_vel, paddle2_vel
    # draw mid line and gutters
    canvas.draw_line([WIDTH / 2, 0],[WIDTH / 2, HEIGHT], 1, "White")
    canvas.draw_line([PAD_WIDTH, 0],[PAD_WIDTH, HEIGHT], 1, "White")
    canvas.draw_line([WIDTH - PAD_WIDTH, 0],[WIDTH - PAD_WIDTH, HEIGHT], 1, "White")
        
    # update ball
    ball_pos[0] += ball_vel[0]
    ball_pos[1] += ball_vel[1]        
    
    # draw ball
    canvas.draw_circle(ball_pos, BALL_RADIUS, 2, "Red", "White")
    
    # to make the ball bounce off the walls
    if ball_pos[0] == BALL_RADIUS or ball_pos[0] == WIDTH:
        ball_vel[0] = -ball_vel[0]

    if ball_pos[1] == BALL_RADIUS or ball_pos[1] == HEIGHT:
        ball_vel[1] = -ball_vel[1]
    
    # code to determine the collission with gutter and spawn accordingly
    
    if ball_pos[0] == BALL_RADIUS:
        if 
        new_game()
        spawn_ball(RIGHT)
    if ball_pos[0] == (WIDTH - PAD_WIDTH):
        new_game()
        spawn_ball(LEFT)
    
    # update paddle's vertical position, keep paddle on the screen
    if (paddle1_pos[0] + paddle1_vel) >=0 and (paddle1_pos[1] + paddle1_vel) <= HEIGHT:
        paddle1_pos[0] += paddle1_vel
        paddle1_pos[1] += paddle1_vel
        
    if (paddle2_pos[0] + paddle2_vel) >= 0 and (paddle2_pos[1] + paddle2_vel) <= HEIGHT:
        paddle2_pos[0] += paddle2_vel
        paddle2_pos[1] += paddle2_vel
    
    # draw paddles
    canvas.draw_line([0, paddle1_pos[0]],[0,paddle1_pos[1]], PAD_WIDTH, "White")
    canvas.draw_line([WIDTH, paddle2_pos[0]],[WIDTH,paddle2_pos[1]], PAD_WIDTH, "White")
    
    # determine whether paddle and ball collide    
    
    # draw scores
        
def keydown(key):
    global paddle1_vel, paddle2_vel
    vel = 4		# the velocity of the paddles
    
    if key == simplegui.KEY_MAP["w"]:
        paddle1_vel -= vel
    if key == simplegui.KEY_MAP["up"]:
        paddle2_vel -= vel
   
def keyup(key):
    global paddle1_vel, paddle2_vel
    vel = 4		# the velocity of the paddles
    if key == simplegui.KEY_MAP["s"]:
        paddle1_vel += vel
    if key == simplegui.KEY_MAP["down"]:
        paddle2_vel += vel


# create frame
frame = simplegui.create_frame("Pong", WIDTH, HEIGHT)
frame.set_draw_handler(draw)
frame.set_keydown_handler(keydown)
frame.set_keyup_handler(keyup)


# start frame
new_game()
frame.start()
