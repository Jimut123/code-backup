"""
Week 4 practice project template for Python Programming Essentials
Rock-paper-scissors-lizard-Spock
"""

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

# helper functions
    
def name_to_number(name):
    """
    Given string name, return integer 0, 1, 2, 3, or 4 
    corresponding to numbering in video
    """
    # convert name to number using if/elif/else
    # don't forget to return the result!
    
    pass
    
def number_to_name(number):
    """
    Given integer number (0, 1, 2, 3, or 4)
    corresponding name from video
    """
    
    # convert number to a name using if/elif/else
    # don't forget to return the result!
    
    pass


def rpsls(player_choice):
    """
    Given string player_choice, play a game of RPSLS 
    and print results to console
    """
    # print a blank line to separate consecutive games
    # print out the message for the player's choice
    # convert the player's choice to player_number using the function name_to_number()
    # compute random guess for comp_number using random.randrange()
    # convert comp_number to comp_choice using the function number_to_name()
    # print out message for computer's choice
    # compute difference of player_number and comp_number modulo five
    # use if/elif/else to determine winner and print winner message
    
    pass
     
    
# test your code
rpsls("rock")
rpsls("Spock")
rpsls("paper")
rpsls("lizard")
rpsls("scissors")

# always remember to check your completed program against the grading rubric


