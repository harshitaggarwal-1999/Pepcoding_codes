#include<iostream>
#include<bits/stdc++.h>
#include<queue>
using namespace std;
#include "practice_treenode.h"

// take input
treenode<int>* takeinput(){
    int rootdata;
    cout << "enter the data : ";
    cin >> rootdata;
    treenode<int>* root = new treenode<int>(rootdata);
    int numchild ;
    cout << "enter the num. of children of " << rootdata << ": ";
    cin >> numchild;
    for(int i = 0; i < numchild; i++) {
        treenode<int>* child = takeinput();
        root->children.push_back(child);
    }
    return root;
}

// print
void printtree(treenode<int>* root){
    cout << root->data << ":";
    int size = root->children.size();
    for(int i = 0; i < size; i++){
        if( i == size-1){
            cout << root->children[i]->data;    
        }
        else cout << root->children[i]->data <<", ";
    }
    cout << endl;
    for(int i = 0; i < size; i++){
        printtree(root->children[i]);
    }
}
// take input levelwise
treenode<int>* takeinputlevelwise(){
    queue<treenode<int>*> pendingnodes;
    int rootdata;
    cout << "enter the root data: ";
    cin >> rootdata;
    treenode<int>* root = new treenode<int>(rootdata);
    pendingnodes.push(root);
    while(pendingnodes.size() != 0){
        treenode<int>* front = pendingnodes.front();
        pendingnodes.pop();
        cout << "enter the no. of children of " << front->data <<": ";
        int numchild;
        cin >> numchild;
        for(int i = 0; i < numchild; i++){
            int childdata;
            cout << "enter the " <<i+1<< "th child's data of " << front->data << ": ";
            cin >> childdata;
            treenode<int>* child = new treenode<int>(childdata);
            front->children.push_back(child);
            pendingnodes.push(child);
        }
        
    }
    return root;
}
// printlevelwise
void printlevelwise(treenode<int>* root){
    queue<treenode<int>*> pendingnodes;
    pendingnodes.push(root);
    while(!pendingnodes.empty()){
        treenode<int>* front = pendingnodes.front();
        pendingnodes.pop();
        cout << front->data << " :";
        int numchild = front->children.size();
        for(int i = 0; i < numchild; i++){
            if(i < numchild-1)cout << front->children[i]->data << ",";
            else cout << front->children[i]->data;
            pendingnodes.push(front->children[i]);
            
        }
        cout << endl;
    }
}
// count no. of nodes
int countnodes(treenode<int>* root){
    int count = 1;
    for(int i  = 0; i < root->children.size(); i++){
        count += countnodes(root->children[i]);
        
    }
    return count;
}
// sum of all nodes
int sumofnodes(treenode<int>* root){
    int sum = root->data;
    for(int i = 0; i < root->children.size(); i++){
        sum += sumofnodes(root->children[i]);
    }
    return sum;
}
// maximum data node
treenode<int>* maxnode(treenode<int>* root){
    // int max = root->data;
    // for(int i = 0; i < root->children.size(); i++){
    //     int smallmax = maxnode(root->children[i]);
    //     if(smallmax > max){
    //         max = smallmax;
    //     }
    // }
    // return max;
    // another way
    if (root == NULL)return NULL;
    treenode<int>* max = root;
    for(int i = 0; i < root->children.size(); i++){
        treenode<int>* temp = maxnode(root->children[i]);
        if(temp->data > max->data)max = temp;
    }
    return max;
}
// height
int heightoftree(treenode<int>* root){
    int maxheight = 0;
    for(int i = 0; i < root->children.size(); i++){
        int tempheight = heightoftree(root->children[i]);
        if(tempheight > maxheight)maxheight = tempheight;
    }
    return maxheight+1;
}

// count at nodes at k level
void printallnodesatlevelK(treenode<int>* root, int k){
    if(k == 0){
        cout << root->data << ", ";
        return;
    }
    for(int i = 0; i < root->children.size(); i++){
        printallnodesatlevelK(root->children[i], k-1);
    }
}
// find element in generic tree
bool find(treenode<int>* root, int data){
    
    if(data == root->data){
        return true;
    }
    for(int i = 0; i < root->children.size(); i++){
        bool isfound = find(root->children[i],data);
        if(isfound){
            return true;
        }
    }
    return false;
}

// count no. of leaf nodes
int leafnodes(treenode<int>* root){
    int nodes = 0;
    if(root == NULL){
        return 0;
    }
    if(root->children.size() == 0){
        return 1;
    }

    for(int i = 0; i < root->children.size(); i++){
        nodes += leafnodes(root->children[i]);
    }
    return nodes;
}

void preorder(treenode<int>* root){
    if(root == nullptr)return;
    cout << root->data << " ";
    for(int i = 0; i < root->children.size(); i++){
        preorder(root->children[i]);
    }
}

void postorder(treenode<int>* root){
    if(root == nullptr)return;
    for (int i =0; i < root->children.size(); i++){
        postorder(root->children[i]);
    }
    cout << root->data << " ";
}
pair<treenode<int>*, int> maxmchildsumnodehelper(treenode<int>* root){
    if(root==nullptr){
        pair<treenode<int>*, int> maxnodepair;
        maxnodepair.first = nullptr;
        maxnodepair.second = INT_MIN;
        return maxnodepair;
    }

    pair<treenode<int>*, int> maxnodepair;
    maxnodepair.first = root;
    maxnodepair.second = root->data;
    for(int i = 0; i < root->children.size(); i++){
        maxnodepair.second+= root->children[i]->data;
    }

    for(int i = 0; i < root->children.size(); i++){
        pair<treenode<int>*, int> childans = maxmchildsumnodehelper(root->children[i]);
        if(childans.second>maxnodepair.second){
            maxnodepair=childans;
        }
    }
    return maxnodepair;



    
}

treenode<int>* maxmchildsumnode(treenode<int>* root){
    return maxmchildsumnodehelper(root).first;
}


int main() {
    // treenode<int>* root = takeinput();
    treenode<int>* root = takeinputlevelwise();
    cout << "our tree is: " << endl;
    printlevelwise(root);
    cout << "preorder traversal of given generic tree : "; 
    preorder(root);
    cout << endl;
    cout << "postorder traversal of given generic tree : "; 
    postorder(root);
    cout << endl;
    int count = countnodes(root);
    cout << "enter the no. of nodes: "<< count << endl;
    int sum = sumofnodes(root);
    cout << "enter the sum of all nodes: " << sum << endl;
    int max = maxnode(root)->data;
    cout << "maximum node data is : " << max << endl;
    cout << "height of the tree is: " << heightoftree(root) << endl;
    cout << "all nodes at level " << 1 << ": ";
    printallnodesatlevelK(root, 1);
    cout << endl;
    int element;
    cout << "enter the element to be found : ";
    cin >> element;
    bool found = find(root, element);
    cout << element << " is found: " << found << endl;
    cout << "number of leaf nodes : " << leafnodes(root) << endl;

    treenode<int>* maxsumnode = maxmchildsumnode(root);
    cout << "max child sum node is : " << maxsumnode->data << endl;



}