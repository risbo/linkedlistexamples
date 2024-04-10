package traversal.singly.linked.list;

public class ReserseDoubleLinkedList {

    static Node head;

    void push(int data){
        Node node = new Node(data);
        node.prev = null;
        node.next = head;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    void reverse(){
        Node temp = null;
        Node current = head;
        while(current!=null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if(temp!=null){
            head = temp.prev;
        }
    }

    void printList(Node node){
        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        ReserseDoubleLinkedList listNode = new ReserseDoubleLinkedList();
        listNode.reverse();
        
        listNode.push(2);
        listNode.push(4);
        listNode.push(8);
        listNode.push(10);

        System.out.println("Original double linked list: ");
        listNode.printList(head);
        listNode.reverse();

        System.out.println();
        System.out.println("The reversed double linked list is: ");
        listNode.printList(head);

    }
}
