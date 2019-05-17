/*
 *
 *    Position the cursor where you want to begin cutting.
    Press v to select characters, or uppercase V to select whole lines, or Ctrl-v to select rectangular blocks (use Ctrl-q if Ctrl-v is mapped to paste).
    Move the cursor to the end of what you want to cut.
    Press d to cut (or y to copy).
    Move to where you would like to paste.
    Press P to paste before the cursor, or p to paste after. 
 *
 *
 *
 */

#include <algorithm>
#include <iostream>
#include <list>
 
int main()
{
    // Create a list containing integers
    std::list<int> l = { 7, 5, 16, 8 };
 
    // Add an integer to the front of the list
    l.push_front(25);
    // Add an integer to the back of the list
    l.push_back(13);
 
    // Insert an integer before 16 by searching
    auto it = std::find(l.begin(), l.end(), 16);
    if (it != l.end()) {
        l.insert(it, 42);
    }
 
    // Iterate and print values of the list
    for (int n : l) {
        std::cout << n << '\n';
    }
}


