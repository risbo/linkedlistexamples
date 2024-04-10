package traversal.singly.linked.list;


public class NodeApp {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Print All elements of the singly linked list
        Node ptr = head;
        while (ptr != null) {
            System.out.println(ptr.data + "");
            ptr = ptr.next;
        }
        System.out.println();
    }
    
}
