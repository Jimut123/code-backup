#include<stdio.h>
#ifndef AUTOCORRECT_H
#define AUTOCORRECT_H

#include <stdbool.h>
**
 * autocorrect.h
 * 
 * Header file with the functionality of the autocorrect feature
 *
 * AUTOCORR_LENGTH_MAX - store maximum permitted word length
 * AUTOCORR_check_word - check frequency of word in trie
 * AUTOCORR_upload - add words and frequencies to trie
 * AUTOCORR_correct_word - give correct spelling of misspelled word
 * AUTOCORR_size_data - give number of unique words in word frequency data
 * AUTOCORR_unload_words - unload word hash table to free memory
 *
 * Copyright (C)   2016    Madhav Datt
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 *
 */



// Assumed maximum word length in dictionary
// (pneumonoultramicroscopicsilicovolcanoconiosis)
#define AUTOCORR_LENGTH_MAX 45

/**
 *
 * Checks if word is present in word data trie.
 * Returns word frequency if word is in present in trie, else returns -1.
 *
 */
int AUTOCORR_check_word (const char* word);

/**
 *
 * Loads word frequency data from file into trie data structure. 
 * Returns true if successful else false.
 *
 */
bool AUTOCORR_upload (void);

/**
 *
 * Edit distance between two words: number of edits to turn one into the other.
 * Can be deletion (remove one letter), transposition (swap adjacent letters), 
 * alteration (change one letter to another) or insertion (add a letter)
 *
 * Finds words with edit distance = 1
 * Returns word with highest probability value as per word frequency data trie as suggested
 * correction for misspelled word.
 * Returns NULL in case of error.
 *
 */
char* AUTOCORR_correct_word (const char* word);

/**
 *
 * Gives size of word frequncy data
 * Returns number of unique words in dictionary/word frequency data if loaded else 0 if not yet loaded.
 *
 */
unsigned int AUTOCORR_size_data (void);

/**
 *
 * Unloads word data from memory. 
 * Frees allocated memory blocks.
 *
 */
void AUTOCORR_unload_words (void);

#endif // AUTOCORRECT_H
char a[35]={"WELCOME TO THE FUTURE "};
char b[35]={"Starting up ZARVIS ...."};
char d[5]={"..."};
int p=0,v=1;
void delay()
{
int i,j;
for(i=0;i<10000;i++)
for(j=0;j<7500;j++);
}
void small_delay()
{
int i,j;
for(i=0;i<1000;i++)
for(j=0;j<7500;j++);
}
void delaysec()
{
int i,j;
for(i=0;i<15000;i++)
for(j=0;j<20000;j++);
}
int compare(char *c)
{
	int x=0;
	if(*(c+x)!=' ')
	{

		printf("%c",*(c+x));
		x++;
	}
	else
	return 0;
	return 0;
}
void display_scene_1()
{
int l,i,p=0,v=1;
for(l=1;l<=3;l++)
{
for(i=0;a[i]!='\0';i++)
{
p++;
printf("%c",a[i]);
if(v==1)
{
delay();
}
}
v=0;
if(p>=22)
{
for(i=0;d[i]!='\0';i++)
{
printf("%c",d[i]);
delaysec();
}
clrscr();
}
}
for(i=0;b[i]!='\0';i++)
{
printf("%c",b[i]);
delay();
}
clrscr();
}
