#include "stdio.h"
 
int letterCounter[8];
char validCharacters[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890!@#$%^&*()_+[]{}:;<>,./?'";
char bruteString[9];  // One more to null terminate.
 
bool evaluateString(char *testString)
{
	// Do something here, to test the zero terminated string testString, and if it is valid, return true.
	//printf("%s\n", testString);
	return false;
}
 
int main()
{
 
	int nDigits = 1;
	int maxDigits = -1;
	int validResult = -1;
	int letterIndex = 0;
 
	while (!((maxDigits < 8) && (maxDigits > 0)) && (validResult != 1))
	{
		printf("\nHow many characters to brute force ? ");
		validResult = scanf_s("%d", &maxDigits);
	}
 
	for (int i = 0; i < maxDigits;i++)
	{
		letterCounter[i] = -1;		// Initialize them all to nill.
		bruteString[i+1] = 0;		// Null terminate the string.
	}
	letterCounter[0] = 0;			// But we will initialize the first counter to 0.
	int wordLength = 0;
 
	while (true)
	{
		// First thing we do, is update the text string with the character that changed.
		bruteString[letterIndex] = validCharacters[letterCounter[letterIndex]];
		if (evaluateString(&bruteString[0]) == true)
		{
			printf("%d character String \"%s\" has been found\n", wordLength+1, &bruteString[0]);
			return 0;
		}
		
		// We always start incrementing the first character.
		letterIndex = 0;
		// And if it overflows, then we start walking up the letterCounter stack.
		while (++letterCounter[letterIndex] == sizeof(validCharacters)-1)
		{
			letterCounter[letterIndex] = 0;	
			
			// Update the text string, at the stack position.
			bruteString[letterIndex] = validCharacters[0];
 
			// Let's check the next position on the stack.
			letterIndex++;
 
			// If we are starting a new wordlength.  We need to update that counter.
			if (letterIndex > wordLength)
			{
				wordLength++;
 
				// If we have searched all characters, for all wordlengths, we are done.
				if (wordLength >= maxDigits)
				{
					printf("No valid password found.\n");
					return -1;
				}
			}
		}
	}
}
 
