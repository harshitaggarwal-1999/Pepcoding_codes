public class HackerEarth {
    // private static int hack;

    // public HackerEarth(){
    //     hack++;
    // }

    // protected static int hack_method() {
    //     return hack;
    // }

    // public static void main(String[] args) {
    //     HackerEarth h1 = new HackerEarth();
    //     HackerEarth h2 = new HackerEarth();
    //     HackerEarth h3 = new HackerEarth();
    //     HackerEarth h4 = new HackerEarth();
    //     HackerEarth h5 = new HackerEarth();
    //     HackerEarth h6 = new HackerEarth();
    //     h6.hack++;
    //     System.out.println(hack_method());
    // }

    public static void main(String[] args) {
        Hacker obj = new Hacker(3);
        for(int i = 0; i < 4; i++){
            obj.ins(i);
        }
        for(int i = 0; i <= 3; i++){
            System.out.println(obj.delt());
        }
    }
    
}

interface IntNumber{
    void ins(int item);
    int delt();
}

class Hacker implements IntNumber{
    private int stck[];
    private int pos;

    Hacker(int size){
        stck = new int[size];
        pos = -1;
    }

    public void ins(int item){
        if(pos == stck.length-1){
            System.out.println("Overflow");
        }else {
            stck[++pos] = item;
        }
    }

    public int delt(){
        if(pos < 0){
            System.out.println("Underflow");
            return 0;
        }else{
            return stck[pos--];
        }
    }
}


