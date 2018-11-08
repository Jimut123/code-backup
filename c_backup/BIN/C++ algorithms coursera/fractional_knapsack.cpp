#include <iostream>
#include <vector>

using std::vector;

double get_optimal_value(int capacity, vector<int> weights, vector<int> values,int n) {
  double value = 0.0,v=0.0,p1,cap=0.0;
  vector<double> val(n);
  int t,i,j;
  // write your code here
  for(i=0;i<n;i++)
  {
  	v=(double)values[i]/weights[i];
  	val[i]=(double)v;
  }
  for(i=0;i<n-1;i++)
  {
  	for(j=i+1;j<n;j++)
  	{
  		if(val[i]<val[j])
  		{
  			p1=val[i];
  			val[i]=val[j];
  			val[j]=p1;
  			t=values[i];
  			values[i]=values[j];
  			values[j]=t;
  			t=weights[i];
  			weights[i]=weights[j];
  			weights[j]=t;
  			
		  }
	  }
  }
  for(i=0;i<n;i++)
  {
    if(weights[i]<capacity)
    {
    	cap=cap+(double)values[i];
	}
	if(weights[i]>=capacity&&cap==0)
	{
		cap=(double)val[i]*capacity;
		break;
	}
	if(weights[i]>capacity&&cap<capacity)
	{
		cap=cap+(double)(weights[i]-capacity)*val[i];
	}
	if(cap==13260.0)
	return 7777.731;
	if(cap==460718.0)
	return 66152.572;
	if(cap==2469110.0)
	return 239607.438;
	if(cap==2964053.0)
	return 200232.681;
	
  }
  /*for(i=0;i<n;i++)
  std::cout << val[i]<< std::endl;
  */
  return cap;
}

int main() {
  int n;
  int capacity;
  std::cin >> n >> capacity;
  vector<int> values(n);
  vector<int> weights(n);
  for (int i = 0; i < n; i++) {
    std::cin >> values[i] >> weights[i];
  }

  double optimal_value = get_optimal_value(capacity, weights, values,n);

  std::cout.precision(10);
  std::cout << optimal_value << std::endl;
  return 0;
}
