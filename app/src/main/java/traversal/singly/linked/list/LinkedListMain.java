package traversal.singly.linked.list;

public class LinkedListMain {

    class Node {
        int data;
        Node prev;
        Node next;
    }

    static void reverse(Node[] nodes){

        Node current = nodes[0];
        Node temp = null;
        while(current!=null){
            // save the reference
            temp = current.prev;

            // start adjust model
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
            // end adjust model

            
        }

        if(temp !=null){
            nodes[0] = temp.prev;
        }
    }

    static void print(Node node){
        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new LinkedListMain().new Node();
        Node second = new LinkedListMain().new Node();
        Node third = new LinkedListMain().new Node();;

        head.data = 1;
        head.prev = null;
        head.next = second;

        second.data = 2;
        second.prev = head;
        second.next = third;

        third.data = 3;
        third.prev = second;
        third.next = null;

        Node[] nodes =new Node[1];
        nodes[0] = head;


        System.out.print("Original List: ");
        print(head);
        reverse(nodes);
        head = nodes[0];

        System.out.print("Print reverse List: ");
        print(head);
    }
}
