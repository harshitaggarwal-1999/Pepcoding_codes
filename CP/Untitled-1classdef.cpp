class student{
    public:
    int rollnumber;
    //char name[20];
    int rank;
    

    private:
    
    bool numberupdated;
    //char address[20];
    long long phonenumber;

    public:

    student(int rollnumber,int rank){
        this -> rollnumber = rollnumber;
        //this -> name = name;
        this -> rank = rank;
        this -> numberupdated = false;
        cout << "parametrized constructor called !" << endl;
    }
/*
    void getaddress(){
        cout << "address : " << address << endl;
    }

    void setaddress(char address,int password){
        if (password != 123){
            cout << "address access denied !" << endl;
            return;
        }
        this -> address =  address;
        cout << "address updated" << endl; 
    }
*/
    void print(){
        cout << this -> rollnumber << endl;
        //cout << this -> name << endl;
        cout << this -> rank << endl;
    }

    void setphonenumber(long long phonenumber,int password){
        if (password != 123){
            cout << "phonenumber access denied !!" << endl;
            return;
        }
        this -> numberupdated = true; 
        this -> phonenumber = phonenumber;
        cout << "phonenumber updated !" << endl;
    }

    void getphonenumber(int password){
        if (password != 123){
            cout << "access denied !" << endl;
            return;
        }
        if (numberupdated == false){
            cout << "number not updated even once" << endl;
            return;
        }
        cout << "phonenumber : " << this -> phonenumber << endl;
    }
};