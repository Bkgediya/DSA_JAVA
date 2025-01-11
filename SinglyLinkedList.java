
public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private final int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public void printData () {
        ListNode itr = head;
        while (itr != null) {
            System.err.print(itr.data + "->");
            itr = itr.next;
        }
        System.err.println("");
    }

    // insert value at particular index
    public void insert(int value, int index) {
        ListNode node = new ListNode(value);

        if (index == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode currNode = head;
            int count = 1;
            while(count < index - 1) {
                currNode = currNode.next;
            }
            node.next = currNode.next;
            currNode.next = node;
        }
    }

    // add value to the begining of the list
    public void addBeginingNode (int value) {
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
    }

    // add to the last of the list
    public void inserLastNode(int value) {
        ListNode node = new ListNode(value);
        if (null == head) {
            head = node;
            return;
        }

        ListNode current = head;

        while (null != current.next) {
            current = current.next;
        }
        current.next = node;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        // create node and assign head
        sll.head = new ListNode(10);
        ListNode second = new ListNode(12);
        ListNode third = new ListNode(90);
        ListNode fourth = new ListNode(100);
        // connect to create chain
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.printData();

        sll.addBeginingNode(50);

        sll.printData();

        sll.inserLastNode(600);
        // print element from singly linked list in java
        sll.printData();

        sll.insert(102, 2);
        sll.printData();

    }

}