package traversal.singly.linked.list;



public class NodeTraverseRecursion {

    public class Node {
        int data;
        Node next;
    
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void traverseLinkedList(Node ptr) {
        if(ptr == null) {
            System.out.println();
            return;
        }
        System.out.println(ptr.data + " ");
        traverseLinkedList(ptr.next);
    }

    public static void main(String[] args) {
        Node head = new NodeTraverseRecursion().new Node(10);
        head.next = new NodeTraverseRecursion().new Node(20);
        head.next.next = new NodeTraverseRecursion().new Node(30);
        head.next.next.next = new NodeTraverseRecursion().new Node(40);
        traverseLinkedList(head);
    }
}
