#include <iostream>
using namespace std;

int reverseInteger(int num){

    int m = num;
    int ans = 0;

    while(m != 0){
        int digit = m % 10;
        ans = (ans * 10) + digit;
        m = m / 10;
    }


    return ans;

}

int main()
{
    int num = 123;
    int result = reverseInteger(num);

    cout << result << endl;

}