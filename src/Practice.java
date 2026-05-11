import java.util.List;

public class Practice {
    public static void main(String[] args) {
        ListNode myNode = new ListNode();
        myNode.data = 'x';

        ListNode anotherNode = new ListNode();
        anotherNode.data = 't';

        myNode.next = anotherNode;

        ListNode moreNode = new ListNode();
        moreNode.data = 'r';

        anotherNode.next = moreNode;

        ListNode coolNode = new ListNode();
        coolNode.data = 'w';
        coolNode.next = myNode;

        ListNode extra = moreNode;
        moreNode.data = 'e';

        ListNode hello = new ListNode();
        hello.data = 'x';
        extra.next = hello;
        printList(coolNode);

        int xCount = countX(coolNode);
        System.out.println(xCount);

        //System.out.println(extra.data);
        
        //System.out.println(myNode.next.next.data);
        //System.out.println(myNode.data);
        //System.out.println(anotherNode.data);
    }

    public static void printList(ListNode head) {
        // starting from head
        // print all data in list in order

        
        // keep track of current, starting at head
        ListNode current = head;

        // until end of list
        while(current != null) {
            // print out data at current
            System.out.println(current.data);
            // move current to the next node
            current = current.next;

        }
    }

    // count how many nodes hold an x
    public static int countX(ListNode head) {
        int count = 0;

        ListNode current = head;
        while(current != null) {
            if(current.data == 'x') {
                count++;
            }
            current = current.next;
        }

        return count;
    }
}
