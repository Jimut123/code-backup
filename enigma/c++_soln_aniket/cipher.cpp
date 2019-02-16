#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main() {
    const string s = "Q SECFKJUH MEKBT TUIUHLU JE RU SQBBUT YDJUBBYWUDJ YV YJ SEKBT TUSUYLU Q XKCQD YDJE RUBYULYDW JXQJ YJ MQI XKCQD";
    for(int i = 0; i < 26; ++i) {
        for_each(s.begin(), s.end(), [i](const char& c) {
            if(c == ' ') {
                cout << c;
            } else
                cout << char((c - 65 + i) % 26 + 65);
        });
        cout << "\n";
    }
    return 0;
}