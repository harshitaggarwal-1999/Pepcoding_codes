#include<iostream>
using namespace std;
#include "nodepractice.cpp"
/*
node* takeinput() {
    int data;
    cin >> data;
    node* head = NULL;
    while (data != -1) {
        node* newnode = new node(data);
        if (head == NULL) {
            head = newnode;
        }
        else {
            node* temp = head;
            while (temp -> next != NULL) {
                temp = temp -> next;
            }
            temp -> next = newnode;
        }
        cin >> data;
    }
    return head;
}
*/

void insertnode (node* head, int data , int i){
    node* n = new node(data);
    node* curr = head;
    int index = 0;
    while (index < i-1) {
        curr = curr -> next;
        index++;
    }
    //node * temp = curr -> next;
    n -> next = curr -> next;
    curr -> next = n;
    
}

node* takeinput_better(){
    int data;
    cin >> data;
    node* head = NULL;
    node* tail = NULL;
    while (data != -1) {
        node* newnode = new node(data);
        if (head == NULL){
            head = newnode;
            tail = newnode;
        }else{
            tail -> next = newnode;
            tail = tail -> next;
        }
        cin >> data;
        

    }
    return head;
}
void print(node* head) {
    while (head != NULL) {
        cout << head -> data << " ";
        head = head -> next;
    }
    cout << endl;
}

int main() {

    node* head = takeinput_better();
    print (head);
    cout << endl;
    /*
    insertnode(head,300,3);
    print(head);
    
    insertnode(head,420,1);
    print(head);
    */

}