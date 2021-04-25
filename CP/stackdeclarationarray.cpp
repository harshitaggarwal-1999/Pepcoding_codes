#include<climits>
class stack{
    int *data;
    int nextindex;
    int capacity;

    public:

    stack(int totalsize) {
        data = new int[totalsize];
        capacity = totalsize;
        nextindex=0;
    }

    //size
    int size () {
        return nextindex;
    }

    // is empty
    bool isempty(){
        return nextindex == 0;
    }

    //push
    void push(int num) {
        if (nextindex == capacity){
            cout << "stack is full" << endl;
            return;
        }
        data[nextindex] = num;
        nextindex++;
    }

    //pop
    int pop() {
        if (isempty()){
            cout << "stack is empty" << endl;
            return INT_MIN;
        }
        nextindex--;
        return data[nextindex];
    }

    //top
    int top(){
        if(isempty()){
            cout << "stack is empty"<< endl;
            return INT_MIN;
        }
        return data[nextindex-1];
    }
};