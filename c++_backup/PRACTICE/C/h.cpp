#include<iostream>
#include<vector>
#include<string>
#include<fstream>

using namespace std;
			// file handling in c++
int main()
{
	string steveQuote = "A day without sunshine is like, you know, night";
	ofstream writer("stevequote.txt");	// to make a file name stevequote.txt
	
	if(! writer)
	{	
		// if cannot write to the file
		cout<<"\nError opening file"<<endl;
		return -2;
	}
	else
	{
		// inserted the quote to the first line of the file and then ended the line with a newline
		writer << steveQuote<<endl;
		writer.close();
	}
	ofstream writer2("stevequote.txt",ios::app);
	// to append at the end of the file contents present
	// ios :: in = to open a file to read input
	// ios::trunc = Default
	// ios::binary = Treat the file as binary
	// ios::out = open a file to write output 
	
	if(! writer2)
	{
		cout<<"\n Error opening file"<<endl;
		return -1;
	}
	else
	{
		writer2<<"\n\t\t\t -Steve Martin"<<endl;
		writer2.close();
	}


	// Now reading the file stream
	char letter;
	ifstream reader("stevequote.txt");
	if(! reader)
	{
		cout<<"Error opening file "<<endl;
		return -1;
	}
	else
	{
		for(int i = 0; ! reader.eof(); i++)
		{
			reader.get(letter);
			cout<<letter;
		}
	}
	cout<<endl;
	reader.close();
	
	return 0;
}

