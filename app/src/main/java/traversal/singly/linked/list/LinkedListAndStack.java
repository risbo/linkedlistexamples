package traversal.singly.linked.list;

import java.util.Stack;

public class LinkedListAndStack {

    static Node head;

    void reverse(){
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while(temp!=null){
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            temp.data = stack.pop();
            temp = temp.next;
        }
    }

    void push(int data){
        Node node = new Node(data);
        node.prev = null;
        node.next = head;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    void print(Node node){
        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }   
        System.out.println(" ");
    }

    public static void main(String[] args) {
        LinkedListAndStack list = new LinkedListAndStack();
        list.push(10);
        list.push(30);
        list.push(40);
        list.push(100);

        list.print(head);
        System.out.println(" ");
        list.reverse();
        list.print(head);

    }
}
