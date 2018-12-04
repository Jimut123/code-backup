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
ball_pos = 300,200
ball_vel = 2,-7
paddle1_pos= 200
paddle2_pos = 200
paddle1_vel =  0
paddle2_vel =  0
PADDLE_VEL = 7
score1 = 0
score2 = 0

# initialize ball_pos and ball_vel for new ball in middle of table
# if direction is RIGHT, the ball's velocity is upper right, else upper left
def spawn_ball(direction):
    global ball_pos, ball_vel # these are vectors stored as lists
    ball_pos = 300,200
    direction_sign = 1
    if direction == LEFT:
        direction_sign = -1
    ball_vel = direction_sign * random.randrange(2, 7), -random.randrange(2, 7)

def ball_bounce():
    global ball_pos, ball_vel, BALL_RADIUS, HEIGHT, WIDTH, paddle1_pos, paddle2_pos, HALF_PAD_HEIGHT, score1, score2
    if ball_pos[1] - BALL_RADIUS < 0 or ball_pos[1] + BALL_RADIUS > HEIGHT:
        ball_vel = ball_vel[0], -ball_vel[1] 
        
    if ball_pos[0] - BALL_RADIUS < 0 + PAD_WIDTH:
        if paddle1_pos - HALF_PAD_HEIGHT < ball_pos[1] < paddle1_pos + HALF_PAD_HEIGHT:
            ball_vel = round(-ball_vel[0] * 1.1), round(ball_vel[1] * 1.1)
        else:
            spawn_ball(RIGHT)
            score2 = score2 + 1
            
    if ball_pos[0] + BALL_RADIUS > WIDTH - PAD_WIDTH:
        if paddle2_pos - HALF_PAD_HEIGHT < ball_pos[1] < paddle2_pos + HALF_PAD_HEIGHT:
            ball_vel = -ball_vel[0] * 1.1, ball_vel[1] * 1.1
        else:
            spawn_ball(LEFT)
            score1 = score1 + 1
   
# define event handlers
def new_game():
    global paddle1_pos, paddle2_pos, paddle1_vel, paddle2_vel  # these are numbers
    global score1, score2  # these are ints
    spawn_ball(LEFT)
    score1 = 0
    score2 = 0
    
def draw(canvas):
    global score1, score2, paddle1_pos, paddle2_pos, ball_pos, ball_vel
     
    # draw mid line and gutters
    canvas.draw_line([WIDTH / 2, 0],[WIDTH / 2, HEIGHT], 1, "Red")
    canvas.draw_line([PAD_WIDTH, 0],[PAD_WIDTH, HEIGHT], 1, "Red")
    canvas.draw_line([WIDTH - PAD_WIDTH, 0],[WIDTH - PAD_WIDTH, HEIGHT], 1, "White")
        
    # update ball
    ball_pos = ball_pos[0] + ball_vel[0], ball_pos[1] + ball_vel[1] 
    ball_bounce()
    
    # draw ball
    canvas.draw_circle(ball_pos, BALL_RADIUS, 10, 'White', 'White')
    
    # update paddle's vertical position, keep paddle on the screen
    paddle1_pos = paddle1_pos + paddle1_vel
    paddle2_pos = paddle2_pos + paddle2_vel
    if paddle1_pos - HALF_PAD_HEIGHT < 0:
        paddle1_pos = 0 + HALF_PAD_HEIGHT
        
    if paddle1_pos + HALF_PAD_HEIGHT > HEIGHT:
        paddle1_pos = HEIGHT - HALF_PAD_HEIGHT
    
    if paddle2_pos - HALF_PAD_HEIGHT < 0:
        paddle2_pos = 0 + HALF_PAD_HEIGHT
        
    if paddle2_pos + HALF_PAD_HEIGHT > HEIGHT:
        paddle2_pos = HEIGHT - HALF_PAD_HEIGHT
       
    # draw paddles
    canvas.draw_line((HALF_PAD_WIDTH, (paddle1_pos - HALF_PAD_HEIGHT)), (HALF_PAD_WIDTH, (paddle1_pos + HALF_PAD_HEIGHT)), PAD_WIDTH, 'White')
    canvas.draw_line((WIDTH - HALF_PAD_WIDTH, (paddle2_pos - HALF_PAD_HEIGHT)), (WIDTH - HALF_PAD_WIDTH, (paddle2_pos + HALF_PAD_HEIGHT)), PAD_WIDTH, 'White')    
    
    # draw scores
    canvas.draw_text(str(score1), (230, 50), 40, 'Red')
    canvas.draw_text(str(score2), (350, 50), 40, 'Red')
    
def keydown(key):
    global paddle1_vel, paddle2_vel, PADDLE_VEL
    if key == simplegui.KEY_MAP['w']:
        paddle1_vel = -PADDLE_VEL
    if key == simplegui.KEY_MAP['s']:
        paddle1_vel = PADDLE_VEL
    if key == simplegui.KEY_MAP['up']:
        paddle2_vel = -PADDLE_VEL
    if key == simplegui.KEY_MAP['down']:
        paddle2_vel = PADDLE_VEL
   
def keyup(key):
    global paddle1_vel, paddle2_vel, PADDLE_VEL
    if key == simplegui.KEY_MAP['w']:
        paddle1_vel = 0
    if key == simplegui.KEY_MAP['s']:
        paddle1_vel = 0
    if key == simplegui.KEY_MAP['up']:
        paddle2_vel = 0
    if key == simplegui.KEY_MAP['down']:
        paddle2_vel = 0

# create frame
frame = simplegui.create_frame("Pong", WIDTH, HEIGHT)
frame.set_draw_handler(draw)
frame.set_keydown_handler(keydown)
frame.set_keyup_handler(keyup)
button1 = frame.add_button('Reset', new_game)

# start frame
new_game()
frame.start()
