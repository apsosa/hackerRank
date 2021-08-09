
#include <bits/stdc++.h>
using namespace std;

long repeatedString(string s, long n) {
    
    long numberOfa = 0;
    for (int i = 0; i < s.size(); i++){
        if(s[i] == 'a'){
            numberOfa++;
        }
    }
    long counter = n / s.size();
    cout << counter<< endl;
    numberOfa = numberOfa*counter;
    if(n != counter*s.size()){
        int diff = (int)(n - counter*s.size());
        int index = 0;
        while (index < diff){
            if(s[index] == 'a'){
                numberOfa++;
            }
            index++;
        }
    }
    return numberOfa;
}

int main(int argc, char const *argv[])
{  
    string s = "aba";
    long n = 10;
    long result = repeatedString(s,n);
    cout << result<<endl;
    return 0;
}
