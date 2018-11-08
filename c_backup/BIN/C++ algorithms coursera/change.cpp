#include <iostream>

int get_change(int m) {
  //write your code here
  int a[3]={1,5,10};
  int k,d=m,c=2,g,l=0;
  while(d!=0)
  {
  	k=d%a[c];
  	g=d/a[c];
  	l=l+g;
  	d=d%a[c];
  	c--;
  }
  // std::cout << l << '\n';
  return l;
}

int main() {
  int m;
  std::cin >> m;
  std::cout << get_change(m) << '\n';
}
