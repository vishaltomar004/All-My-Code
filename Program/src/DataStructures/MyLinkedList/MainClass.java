package DataStructures.MyLinkedList;




public class MainClass {
    public static void main(String[] args) {
        LinkedList myLL = new LinkedList();
        myLL.add(12);
        myLL.add(15);
        myLL.add(45);
        myLL.add(14);
        myLL.add(35);
        myLL.add(89);
        myLL.add(42);
        myLL.add(0);
        myLL.remove(0);
        myLL.print();

        System.out.println(myLL.get(0) +" "+ myLL.get(1));
    }
}
