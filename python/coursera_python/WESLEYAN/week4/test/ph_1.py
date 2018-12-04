"""
This was written as a basic program that did little at first.  Additional
features were added until it was finished.
Here is a first version.
phones.py
Version 1 -- builds the menu -- functions are empty
"""

def delete_phone():
    print("Deleting")

def edit_phone():
    print("Editing")

def save_phone_list():
    print("Saving")
  
def load_phone_list():
    print("Loading")

def show_phones():
    print("Showing phones")

def create_phone():
    print("Adding a phone")  
  
def menu_choice():
    """ Find out what the user wants to do next. """
    print("Choose one of the following options?")
    print("   s) Show")
    print("   n) New")
    print("   d) Delete")
    print("   e) Edit")
    print("   q) Quit")
    choice = input("Choice: ")    
    if choice.lower() in ['n','d', 's','e', 'q']:
        return choice.lower()
    else:
        print(choice +"?" + " That is an invalid option!!!")
        return None


def main_loop():
    
    load_phone_list()
    
    while True:
        choice = menu_choice()
        if choice == None:
            continue
        if choice == 'q':
            print( "Exiting...")
            break     # jump out of while loop
        elif choice == 'n':
            create_phone()
        elif choice == 'd':
            delete_phone()
        elif choice == 's':
            show_phones()
        elif choice == 'e':
             edit_phone()
        else:
            print("Invalid choice.")
            
    save_phone_list()
    

# The following makes this program start running at main_loop() 
# when executed as a stand-alone program.    
if __name__ == '__main__':
    main_loop()
