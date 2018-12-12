#include<iostream>
#define MAX 6

using namespace std;

class gauss_elm{
    int n;
    float a[MAX][MAX], b[MAX], x[MAX];
    public:
    void inp ();
    void slv ();
    void out ();
};

void gauss_elm::inp (){
    cout<<"n?: ";
    cin>>n;
    
    cout<<"enter co-effs matrix:\n";
    for (int i=0; i<n; i++)
        for (int j=0; j<n; j++)
            cin>>a[i][j];
    
    cout<<"enter b:";
    for (int i=0; i<n; i++)
        cin>>b[i];
}

void gauss_elm::slv (){
    for (int i=0; i<n; i++)
        for (int k=i+1; k<n; k++){
            float m = a[k][i] / a[i][i];
            for (int j=0; j<n; j++)
                a[k][j] -= m*a[i][j];
            b[k] -= m*b[i];
        }

    for(int i=n-1; i>=0; i--){
        x[i] = b[i];
        for(int j=i+1; j<n; j++)
            x[i] -= a[i][j] * x[j];
        x[i] /= a[i][i];
    }
}

void gauss_elm::out (){
    cout<<"the roots are:\n";
    for (int i=0; i<n; i++)
        cout<<"x"<<i+1<<": "<<x[i]<<endl;
}


int main(){
    gauss_elm ge;
    ge.inp ();
    ge.slv ();
    ge.out ();
    return 0;
}
