#include <iostream>
using namespace std;

void printArray(int arr[], int size){
    for(int i=0; i < size; i++){
        cout << arr[i] << " ";
    }
}

void reverseArray(int arr[], int size){
    int first = 0;
    int last = size - 1;

    while(first < last){
        swap(arr[first], arr[last]);
        first++;
        last--;
    }

    printArray(arr, 5);
}



int main()
{
    int arr[5] = {2, 5, 3, 1, 6};
    reverseArray(arr, 5);
}