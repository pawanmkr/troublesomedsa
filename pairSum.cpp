#include <iostream>
using namespace std;

void printArray(int arr[], int size){
    for(int i=0; i < size; i++){
        cout << arr[i] << endl;
    }
}

void pairSum(int arr[], int size, int target)
{
    int first = 0;

    while(first < size){

        for(int i=first+1; i < size; i++){
            if(arr[first] + arr[i] == target){
                cout << arr[first] << " + " << arr[i]  << " = " << target << endl; 
            }
        }

        first++;
    }
}

int main()
{
    int arr[5] = {2, 5, 3, 1, 6};
    pairSum(arr, 5, 5);

}