#include <algorithm>
#include <iostream>
#include <vector>

using std::vector;

int get_majority_element(vector<int> &a, int left, int right) {
  if (left == right) return -1;
  if (left + 1 == right) return a[left];
  //write your code here
  
  return -1;
}

int main() {
  int n,t,i,j;
  std::cin >> n;
  vector<int> a(n);
  for (size_t i = 0; i < a.size(); ++i) {
    std::cin >> a[i];
  }
  int min;
  for(i=0;i<n-1;i++)
{
min=i;
for(j=i+1;j<n;j++)
{
if(a[min]>a[j])
{
min=j;
}
}
t=a[i];
a[i]=a[min];
a[min]=t;
}
  /*for(i=0;i<n-1;i++)
  {
  	for(j=i+1;j<n;j++)
  	{
  		if(a[i]>a[j])
  		{
  			t=a[i];
  			a[i]=a[j];
  			a[j]=t;
  			
		  }
	  }
  }*/
  /*for(i=0;i<n;i++)
  std::cout <<a[i] << '\n';*/
  int c=0,max=0;
  for(i=0;i<n;i++)
  {
  	c=0;
  	while(a[i]==a[i+1])
  	{
  	c++;
  	i++;
    }
  	if(c>max)
  	max=c;
  }
  max+=1;
  //std::cout <<max << '\n';
  //std::cout << (get_majority_element(a, 0, a.size()) != -1) << '\n';
  if(max>n/2)
  std::cout <<1 << '\n';
  else
  std::cout <<0 << '\n';
  
}
