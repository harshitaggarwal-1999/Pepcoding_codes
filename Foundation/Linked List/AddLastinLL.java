import java.io.*;
import java.util.*;

public class AddLastinLL {
  public static class Node {
    int data;
    Node next;
    
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size = 0;

    void addLast(int val) {
      // Write your code here
      Node currNode = new Node();
      currNode.data = val;
      if(size == 0){
        head = currNode;
        tail = currNode;
        head.next = tail;
    
      }

      else{
          Node temp;
          temp = currNode;
          tail.next = temp;
          tail = temp;

      }
      size++;
    }
  }

  public static void testList(LinkedList list) {
    for (Node temp = list.head; temp != null; temp = temp.next) {
      System.out.println(temp.data);
    }
    System.out.println(list.size);

    if (list.size > 0) {
      System.out.println(list.tail.data);
    } 
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } 
      str = br.readLine();
    }

    testList(list);
  }
}