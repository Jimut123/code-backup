#include<iostream.h>
#include<fstream.h>
#include<iomanip.h>
const char *fn="binary";
int main()
{
    int i;
    float h[4]={17.2,15.4,16.7,16.7};
    ofstream outfile;
    outfile.open(fn);
    outfile.write((char *)&h,sizeof (h));
    outfile.close();
    for(i=0;i<4;i++)
    {
                    h[i]=0;
                    }
                    ifstream infile;
                    infile.open(fn);
                    infile.read((char*)&h,sizeof(h));
                    for(i=0;i<4;i++)
                    {
                                    cout.setf(ios::showpoint);
                                    cout<<setw(10)<<setprecision(2)<<h[i];
                                    }
                                    infile.close();
                                    return 0;
                                    }
