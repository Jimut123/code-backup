#include<iostream>
#include<cstring>

#define INSERT_COST 1
#define DELETE_COST 1
#define REPLACE_COST 1

using namespace std;

int min(int a,int b) {
   return ((a < b) ? a : b);
}

/* convert str1 to str2 with minimum edits(insert,delete,replace)
   suppose length(str1) = m and length(str2) = n
   cost(i,j) -> cost of converting str1[0...i-1] to str2[0...j-1]
   cost(m,n) -> cost of converting str1 to str2 
   Standard recursive formula for computing cost(m,n) :-
   cost(i,j) = min[cost(i-1,j)+D, cost(i,j-1)+I, cost(i-1,j-1)+R]
   D -> delete cost, I -> insert cost, R -> replace cost  */

int editDistance(char str1[],int size1,char str2[],int size2) {
   // cost matrix
   // row -> str1 & col -> str2
   int cost[size1][size2];
   int i,j;
   // initialize the cost matrix
   for (i=0;i<size1;i++) {
      for(j=0;j<size2;j++) {
         if (i == 0) {
            // source string is NULL
            // so we need 'j' insert operations
            cost[i][j] = j*INSERT_COST;
         } else if (j == 0) {
            // target string is NULL
            // so we need 'i' delete operations
            cost[i][j] = i*DELETE_COST;
         } else {
            cost[i][j] = -1;
         }
      }
   } //initialization done

   //compute cost(i,j) and eventually return cost(m,n)
   for(i=1;i<size1;i++) {
      for(j=1;j<size2;j++) {
         int x = cost[i-1][j] + DELETE_COST;
         int y = cost[i][j-1] + INSERT_COST;
         // if str1(i-1) != str2(j-1), add the replace cost
         // we are comparing str1[i-1] and str2[j-1] since
         // the array index starts from 0
         int z = cost[i-1][j-1] + (str1[i-1] != str2[j-1])*REPLACE_COST;
         // as per our recursive formula
         cost[i][j] = min(x, min(y,z));
      }
   }

   // last cell of the matrix holds the answer
   return cost[size1-1][size2-1];
}

//main
int main() {
   char str1[100];
   char str2[100];
   
   int size1;
   int size2;
   int min_cost;
   gets(str1);
   gets(str2);
   size1 = strlen(str1);
   size2 = strlen(str2);
   min_cost = editDistance(str1,size1+1,str2,size2+1);
   cout<<min_cost;
   cout<<endl;
   return 0;
}
