#include <iostream>
#include <cassert>
#include <vector>

using std::vector;
using std::cin;
using std::cout;
using std::vector;
int binary_search(const vector<int> &a, int x,int left,int right) { 
	//write your code here
	int q=(left+right)/2;
	if(left>right)
	 return -1;    
	if(x==a[q])
    return q;
    if(x>=a[q])
    return binary_search(a, x,q+1,right);
    else if(x<=a[q])
    return binary_search(a, x,left,q-1);
   
}

int linear_search(const vector<int> &a, int x) {
  for (size_t i = 0; i < a.size(); ++i) {
    if (a[i] == x) return i;
  }
  return -1;
}
int main() {
  int n;
  std::cin >> n;
  vector<int> a(n);
  for (int i = 0; i < n; i++) {
    std::cin >> a[i];
  }
  int m;
  std::cin >> m;
  vector<int> b(m);
  for (int i = 0; i < m; ++i) {
    std::cin >> b[i];
  }
  for (int i = 0; i < m; ++i) {
    std::cout <<binary_search(a, b[i],0,a.size())<<' ';
  }
  return 0;
}
