public class DetectCycle {
    boolean hascycle(Node head)
    {
        if(head==null)
            return false;
        Node fast=head;
        Node slow=head;
        while(fast!=null fast.next!=null && slow!=null &&slow.next!=null){
            if(fast==slow){
                return true;
            }
            fast=fast.next.next;
            slow=slow.next;


        }
        return false;
    }

   /* private class Node {
        int data;
        Node next;
    }*/
}
