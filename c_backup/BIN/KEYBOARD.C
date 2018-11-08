

#include <stdio.h>
#include <bios.h>
#include <ctype.h>

#define RIGHT  0x01
#define LEFT   0x02
#define CTRL   0x04
#define ALT    0x08

int main(void)
{
  int key, modifiers;

  /* Wait until a key is pressed */
  while (_bios_keybrd(_KEYBRD_READY) == 0);



  /* Fetch the key that is waiting */
  key = _bios_keybrd(_KEYBRD_READ);

  /* Determine if shift keys are used */
  modifiers = _bios_keybrd(_KEYBRD_SHIFTSTATUS);
  if (modifiers)
  {
    printf("[");
    if (modifiers & RIGHT) printf("RIGHT");
    if (modifiers & LEFT)  printf("LEFT");
    if (modifiers & CTRL)  printf("CTRL");
    if (modifiers & ALT)   printf("ALT");
    printf("]");
  }

  /* print out the character read */
  if (isalnum(key & 0xFF))
    printf("'%c'\n", key);
  else
    printf("%#02x\n", key);
  return 0;
}
