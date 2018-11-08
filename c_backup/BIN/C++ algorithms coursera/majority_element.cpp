#include <algorithm>
#include <iostream>
#include <vector>

using std::vector;
int c=0;
int get_majority_element(vector<int> &a, int left, int right) {
 	int q=(left+right)/2;
	if(left>right)
	 return -1;    
	if(x==a[q])
    c++;
    if(x>=a[q])
    return binary_search(a, x,q+1,right);
    else if(x<=a[q])
    return binary_search(a, x,left,q-1);
    if(c>n/2)
    return 1;
    else return 0;
}

int main() {
  int n;
  std::cin >> n;
  vector<int> a(n);
  for (size_t i = 0; i < a.size(); ++i) {
    std::cin >> a[i];
  }
  std::cout << (get_majority_element(a, 0, a.size()) != -1) << '\n';
}
