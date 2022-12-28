package DataStructures.MyLinkedList;

public class LinkedList {

    Node head;
    void add(int data) {
        Node toAdd = new Node(data);
      if(isEmpty()) {
          head = toAdd;
          return;
      }

        Node temp = head;

        while ((temp.next != null)) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }
    boolean isEmpty() {
        return head == null;
    }
    void print() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
     public int get(int data) {
        Node temp = head;
        while(data-- >0) {
            temp = temp.next;
        }
        return temp.data;
    }

     void set(int position , int data) {

        Node temp = head;
        while(position-- >0) {
            temp = temp.next;
        }
        temp.data = data;
        return;
    }

    void remove(int position) {
        Node temp = head;
        if(position == 0) {
           head = temp.next;
            return ;
        } else {
            while (position-- > 1) {
                temp = temp.next;

            }
            temp.next = temp.next.next;
        }

        return;
    }

    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
