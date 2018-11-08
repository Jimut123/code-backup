#include<stdio.h>
int max(int a, int b) {
    return a>b?a:b;
}
int min(int a, int b) {
    return a<b?a:b;
}
int maxCoins(int arr[], int i, int j, int turn) {
    int a,b;
    if(i==j) {
        if(turn == 1) return arr[i];
        else return 0;
    }
    if(turn) {
        a = arr[i] +maxCoins(arr,i+1,j,0);
        b = arr[j] + maxCoins(arr,i,j-1,0);
        return max(a,b);
    } else {
        return min(maxCoins(arr,i+1,j,1), maxCoins(arr,i,j-1,1));
    }
}
int main() {
	int n,m,i,a[1000];
	scanf("%d",&n);
	scanf("%d",&m);
	for(i=0;i<m;i++)
	scanf("%d",&a[i]);
    //int arr[3] = {1,4,8};//{6,7,4,1,10,5,4,9,20,8}; //{2,3,4,5,6,7,8,9,10,11};
    printf("%d\n",maxCoins(a,0,m,1));
}    
