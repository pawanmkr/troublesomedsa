#include <iostream>
#include <limits.h>
using namespace std;

void printArray(int arr[], int size){
    for(int i=0; i < size; i++){
        cout << arr[i] << endl;
    }
}

int max(int arr[], int size){

    int num = INT_MIN;
    for(int i=0; i<size; i++){
        if(arr[i] > num){
            num = arr[i];
        }
    }

    return num;
}
int min(int arr[], int size){

    int num = INT_MAX; 
    for(int i=0; i<size; i++){
        if(arr[i] < num){
            num = arr[i];
        }
    }

    return num;
}

int main()
{
    int arr[5] = {2, 5, 3, 1, 6};
    cout << "Max: " << max(arr, 5) << " Min: " << min(arr, 5) << endl;
}