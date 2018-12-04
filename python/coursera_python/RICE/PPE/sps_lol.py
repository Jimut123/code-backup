# Mini-project 1 -- Rock-paper-scissors-lizard-Spock 
# Run the final version in CodeSkulptor at http://www.codeskulptor.org/#user39_reeDwnJRui_4.py
# mini-project 1 template: http://www.codeskulptor.org/#examples-rpsls_template.py
# name2number template: http://www.codeskulptor.org/#examples-name_to_number_template.py
# name2number function: http://www.codeskulptor.org/#user39_S4YP1ISNyK_3.py
# number2name template: http://www.codeskulptor.org/#examples-number_to_name_template.py
# number2name function: http://www.codeskulptor.org/#user39_sulErDfX1g_0.py

import random

# The key idea of this program is to equate the strings
# "rock", "paper", "scissors", "lizard", "Spock" to numbers
# as follows:
#
# 0 - rock
# 1 - Spock
# 2 - paper
# 3 - lizard
# 4 - scissors

# Helper functions

def name_to_number(name):
    # It converts the string name into a number between 0 and 4 using if/elif/else
    # Don't forget to return the result!
    
    if name == "rock":
        num = 0
    elif name == "Spock":
        num = 1
    elif name == "paper":
        num = 2
    elif name == "lizard":
        num = 3
    elif name == "scissors":
        num = 4
    else:
        print "Not match, error."
    return num

def number_to_name(number):
    # It converts a number in the range 0 to 4 into its corresponding name as a string using if/elif/else.
    # Don't forget to return the result!
    
    if number == 0:
        nam = "rock"
    elif number == 1:
        nam = "Spock"
    elif number == 2:
        nam = "paper"
    elif number == 3:
        nam = "lizard"
    elif number == 4:
        nam = "scissors"
    else:
        print "Number out of range."
    return nam
    
def rpsls(player_choice):     
    # Print a blank line to separate consecutive games
    print 
    
    # Print out the message for the player's choice
    print "Player chooses: " + player_choice
    
    # Convert the player's choice to player_number using the function name_to_number()
    player_number = name_to_number(player_choice)
    
    # Compute random guess for comp_number using random.randrange()
    comp_number = random.randrange(0, 5)
    
    # Convert comp_number to comp_choice using the function number_to_name()
    comp_choice = number_to_name(comp_number)
    
    # Print out the message for computer's choice
    print "Computer chooses: " + comp_choice
    
    # Compute difference of comp_number and player_number modulo five
    diff = (comp_number - player_number) % 5

    # Use if/elif/else to determine winner, print winner message
    if diff == 1 or diff == 2:
        print "Computer wins!"
    elif diff == 3 or diff == 4:
        print "Player wins!"
    else:
        print "Player and computer tie!"
    
# Test your code - THESE CALLS MUST BE PRESENT IN YOUR SUBMITTED CODE
rpsls("rock")
rpsls("Spock")
rpsls("paper")
rpsls("lizard")
rpsls("scissors")

