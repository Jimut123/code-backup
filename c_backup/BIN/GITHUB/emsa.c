/*
 *  Simulated Annealing Implementation for the n-Queens Problem
 *
 *  ./software/ch2/emsa/emsa.c
 *
 *  mtj@cogitollc.com
 *
 */

#include <stdio.h>
#include <string.h>
#include <time.h>
#include <math.h>
#include "common.h"


/*
 *  tweakSolution()
 *
 *  Randomly perturb an encoded solution.
 *
 */

void tweakSolution( memberType *member )
{
  int temp, x, y;

  x = getRand(MAX_LENGTH);
  do {
    y = getRand(MAX_LENGTH);
  } while (x == y);

  temp = member->solution[x];
  member->solution[x] = member->solution[y];
  member->solution[y] = temp;
}


/*
 *  initializeSolution()
 *
 *  Randomly initialize an encoded-solution.
 *
 */

void initializeSolution( memberType *member )
{
  int i;

  /* Initial setup of the solution */
  for (i = 0 ; i < MAX_LENGTH ; i++) {
    member->solution[i] = i;
  }

  /* Randomly perturb the solution */
  for (i = 0 ; i < MAX_LENGTH ; i++) {
    tweakSolution( member );
  }

}


/*
 *  emitSolution()
 *
 *  Emit the passed solution as an N by N board.
 *
 */

void emitSolution( memberType *member )
{
  char board[MAX_LENGTH][MAX_LENGTH];
  int x, y;

  bzero( (void *)board, MAX_LENGTH * MAX_LENGTH );

  for (x = 0 ; x < MAX_LENGTH ; x++) {
    board[x][member->solution[x]] = 'Q';
  }

  printf("board:\n");
  for (y = 0 ; y < MAX_LENGTH ; y++) {
    for (x = 0 ; x < MAX_LENGTH ; x++) {
      if (board[x][y] == 'Q') printf("Q ");
      else printf(". ");
    }
    printf("\n");
  }
  printf("\n\n");
}


/*
 *  computeEnergy()
 *
 *  Calculate the energy of the passed solution.  The energy is the 
 *  the number of conflicts on the board.  Note that only diagonals
 *  are checked.  The encoding ensures that no veritical or horizontal
 *  conflicts are possible.
 *
 */

void computeEnergy( memberType *member )
{
  int  i, j, x, y, tempx, tempy;
  char board[MAX_LENGTH][MAX_LENGTH];
  int conflicts;
  const int dx[4] = {-1,  1, -1,  1};
  const int dy[4] = {-1,  1,  1, -1};

  bzero( (void *)board, MAX_LENGTH * MAX_LENGTH );

  for (i = 0 ; i < MAX_LENGTH ; i++) {
    board[i][member->solution[i]] = 'Q';
  }

  /* Walk through each of the Queens, and compute the number of conflicts */
  conflicts = 0;

  for (i = 0 ; i < MAX_LENGTH ; i++) {

    x = i; y = member->solution[i];

    /* NOTE: Based upon the encoding, horizontal and vertical conflicts will 
     * never occur!!! 
     */

    /* Check diagonals */
    for (j = 0 ; j < 4 ; j++) {

      tempx = x ; tempy = y;
      while(1) {
        tempx += dx[j]; tempy += dy[j];
        if ((tempx < 0) || (tempx >= MAX_LENGTH) ||
               (tempy < 0) || (tempy >= MAX_LENGTH)) break;
        if (board[tempx][tempy] == 'Q') conflicts++;
      }

    }

  }

  member->energy = (float)conflicts;
}


/*
 *  copySolution
 *
 *  Copy the src member structure to the dest member structure.
 *
 */

void copySolution( memberType *dest, memberType *src )
{
  int i;

  for (i = 0 ; i < MAX_LENGTH ; i++) {
    dest->solution[i] = src->solution[i];
  }
  dest->energy = src->energy;
}


/* 
 *  main()
 *
 *  Main function for the simulated annealing demonstration.
 *
 */

int main()
{
  int  timer=0, step, solution=0, useNew, accepted;
  float temperature = INITIAL_TEMPERATURE;
  memberType current, working, best;
  FILE *fp;

  fp = fopen("stats.txt", "w");

  srand(time(NULL));

  initializeSolution( &current );
  computeEnergy( &current );
  best.energy = 100.0;

  copySolution( &working, &current);

  while (temperature > FINAL_TEMPERATURE) {

    printf("Temperature : %f\n", temperature);

    accepted = 0;

    /* Monte Carlo Step */
    for (step = 0 ; step < STEPS_PER_CHANGE ; step++) {

      useNew = 0;

      tweakSolution( &working );
      computeEnergy( &working );

      if (working.energy <= current.energy) {

        useNew = 1;

      } else {

        float test = getSRand();
        float delta = working.energy - current.energy;
        float calc = exp(-delta/temperature);

        if (calc > test) {

          accepted++;
          useNew = 1;

        }

      }

      if (useNew) {
        useNew = 0;
        copySolution( &current, &working );

        if (current.energy < best.energy) {
          copySolution( &best, &current );
          solution = 1;
        }

      } else {

        copySolution( &working, &current);

      }

    }

    fprintf(fp, "%d %f %f %d\n", timer++, temperature, best.energy, accepted);

    printf("Best energy = %f\n", best.energy);

    temperature *= ALPHA;
  }

  fclose(fp);

  if (solution) {
    emitSolution( &best );
  }

  return 0;
}

/*
 *  Copyright (c) 2003 Charles River Media.  All rights reserved.
 * 
 *  Redistribution and use in source and binary forms, with or 
 *  without modification, is hereby granted without fee provided 
 *  that the following conditions are met:
 * 
 *    1.  Redistributions of source code must retain the above 
 *        copyright notice, this list of conditions and the 
 *        following disclaimer.
 *    2.  Redistributions in binary form must reproduce the above
 *        copyright notice, this list of conditions and the 
 *        following disclaimer in the documentation and/or other 
 *        materials provided with the distribution.
 *    3.  Neither the name of Charles River Media nor the names of 
 *        its contributors may be used to endorse or promote 
 *        products derived from this software without specific 
 *        prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY CHARLES RIVER MEDIA AND CONTRIBUTORS 
 * 'AS IS' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT 
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTIBILITY AND FITNESS 
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL CHARLES
 * RIVER MEDIA OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS 
 * OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED 
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT 
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN 
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE.
 */

