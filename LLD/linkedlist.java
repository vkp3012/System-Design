

public class linkedlist {
    
    static class MyLinkedList{

        static class Node{
            int data;
            Node next;
        }

        Node head;
        Node tail;
        int size;

        void add(int data){
            Node node = new Node();
            node.data = data;
            node.next = null;

            if(size == 0){
                head = tail = node;
            }else{
                tail.next = node;
                tail = node;
            }
            size++;
        }

        int size(){
            return size;
        }
    }
    
    public static void main(String args[]){
        MyLinkedList list = new MyLinkedList();

        list.add(60);
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);

        for(int val : list){
            System.out.print(val + "->");
        }
        
        System.out.println(".");
    }
}
