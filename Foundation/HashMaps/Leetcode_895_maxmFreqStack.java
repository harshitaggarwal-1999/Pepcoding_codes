import java.util.HashMap;

class FreqStack {
    //     HashMap<Integer,Stack<Integer>> st = new HashMap<>();
    //     HashMap<Integer,Integer> fmap = new HashMap<>();

    //     int maxfreq = 0;

        HashMap<Integer,Stack<Integer>> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

    public FreqStack() {
        


        
    }
    
    public void push(int val) {
        // --------SELF CODE----------
        if(map2.containsKey(val) == false){
            map2.put(val,1);
        }else{
            map2.put(val,map2.get(val)+1);
        }

        Stack<Integer> tempst = map1.get(map2.get(val));
        tempst.push(val);
        map1.put(map2.get(val),tempst);

        // -----------BHAIYA CODE-------

        // int freq = fmap.getOrDefault(val, 0);
        // freq++;

        // fmap.put(val,freq);

        // if(st.containsKey(freq) == false){
        //     st.put(freq, new Stack<Integer>());
        // }

        // st.get(freq).add(val);
        // maxfreq = Math.max(maxfreq,freq);
    }
    
    public int pop() {
        // -----BHAIYA CODE---------
        // int ans = st.get(maxfreq).pop();

        // int freq = fmap.get(ans);
        // freq--;

        // fmap.put(ans,freq);

        // if(st.get(maxfreq).size() == 0){
        //     maxfreq--;
        // }

        // -------SELF CODED--------

        int ans = 

        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */