import java.io.*;
class Average extends Sum
{
	float avgA(int arr[],int n)
	{
		Sum ob = new Sum();
		float k = ob.sumA(arr,n);
		return (float)(k/n);
	}
}