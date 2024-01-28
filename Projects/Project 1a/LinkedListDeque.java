public class LinkedListDeque <PlaceHolderType>{
    private class ListNode {
        public PlaceHolderType item;
        public ListNode next;
        public ListNode prev;

        public ListNode(ListNode p, PlaceHolderType i, ListNode n) {
            item = i;
            next = n;
            prev = p;
        }
    }

    /* The first item (if it exists) is at sentinel.next. */
    private ListNode sentinel;
    private int size;

    /** Creates an empty DLList. */
    public LinkedListDeque() {
        sentinel = new ListNode(null, null,null);
        sentinel.next = new ListNode(null, null, null);
        sentinel.prev = new ListNode(null, null, null);
        size = 0;
    }
    public LinkedListDeque(PlaceHolderType x) {
        sentinel = new StuffNode(null, null,null);
        sentinel.next = sentinel.next.next.prev;
        sentinel.prev = sentinel.prev.next;
        size = 1;
    }


    /** Adds x to the front of the list. */
    public void addFirst(PlaceHolderType x) {
        sentinel.next = new StuffNode(sentinel, x, sentinel.next);
        sentinel.next.next.prev = sentinel.next;
        size = size + 1;
    }

    /** Adds x to the end of the list. */
    public void addLast(PlaceHolderType x) {
        size = size + 1;

        ListNode p = sentinel;

        /* Advance p to the end of the list. */
        while (p.next != null) {
            p = p.next;
        }

        p.next = new StuffNode(sentinel, x, null);
    }

    /** Returns the first item in the list. */
    public PlaceHolderType getFirst() {
        return sentinel.next.item;
    }

    /** Returns the size of the list. */
    public int size() {
        return size;
    }
}
