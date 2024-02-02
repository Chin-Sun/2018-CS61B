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

    /** Declare variables. */
    private ListNode sentinel;
    private int size;

    /** Constructor:
     * Creates an empty DLList. */
    public LinkedListDeque() {
        sentinel = new ListNode(null, null,null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }


    /**  Adds an item of type <PlaceholderType> x to the front of the deque.
     *
     *   Args:
     *       item (PlaceholderType): new first item.
     *
     *   Returns:
     *       Nothing to return.
     * */
    public void addFirst(PlaceHolderType x) {
        sentinel.next = new ListNode(sentinel, x, sentinel.next);
        sentinel.next.next.prev = sentinel.next;
        size = size + 1;
    }

    /**  Adds an item of type <PlaceholderType> to the back of the deque.
     *
     *   Args:
     *       item (PlaceholderType): new first item.
     *
     *   Returns:
     *       Nothing to return.
     * */
    public void addLast(PlaceHolderType x) {
        sentinel.prev = new ListNode(sentinel.prev, x, sentinel);
        sentinel.prev.prev.next = sentinel.prev;
        size = size + 1;
    }
    /**  Returns true if deque is empty, false otherwise.*/
    public boolean isEmpty(){
        return (this.size == 0);
    }
    /**  Returns the number of items in the deque in constant time. */
    public int size(){
        return size;
    }

    /**  Prints the items in the deque from first to last, separated by a space. */
    public void printDeque(){
        ListNode node = sentinel;
        while(node != sentinel){
            System.out.print(node.next.item+" ");
            node = node.next;
        }
    }
    /**  Removes and returns the item at the front of the deque.
     *   If no such item exists, returns null.
     *
     *   Args:
     *       None
     *
     *   Returns:
     *       First item in Linked-List-Deque or null
     * */
    public PlaceHolderType removeFirst(){
        if(size == 0){
            return null;
        }
        else {PlaceHolderType firstElement = sentinel.next.item;
        sentinel.next = sentinel.next.next;
        sentinel.next.next.prev = sentinel;
        size = size-1;
        return firstElement;
        }
    }
    /**  Removes and returns the item at the back of the deque.
     *   If no such item exists, returns null.
     *
     *   Args:
     *       None
     *
     *   Returns:
     *       First item in Linked-List-Deque or null
     * */
    public PlaceHolderType removeLast(){
        if(size == 0){
            return null;
        } else{
            PlaceHolderType lastElement = sentinel.prev.item;
            sentinel.prev.prev.next = sentinel;
            sentinel.prev = sentinel.prev.prev;
            size -= 1;
            return lastElement;
        }
    }

    /** Returns the first item in the list. */
    public PlaceHolderType getFirst() {
        return sentinel.next.item;
    }

    /**  Gets the item at the given index using <iteration>
     *   where 0 is the front, 1 is the next item, and so forth.
     *   If no such item exists, returns null.
     *
     *   <Must not alter the deque!>
     *
     *   Args:
     *       i (int): index.
     *
     *   Returns:
     *       index^{th} item in the deque.
     * */
    public PlaceHolderType getIterative(int index){
        int length = size;
        ListNode target = sentinel.next;

        if(index > length - 1){
            return null;
        }else{
            for (int i = 0; i < index; i++){
                target = target.next;
            }
            return target.item;
        }
    }
    /**  Gets the item at the given index using <recursion>
     *   where 0 is the front, 1 is the next item, and so forth.
     *   If no such item exists, returns null.
     *
     *   <Must not alter the deque!>
     *
     *   Args:
     *       i (int): index.
     *
     *   Returns:
     *       index^{th} item in the deque.
     * */
    public PlaceHolderType getRecursive(int index){
        if (index > size-1){
            return null;
        }else{
            return recursive(sentinel.next, index);
        }
    }
    /**  getRecursive helper function.
     *
     *   Args:
     *       n (ListNode): current pointer.
     *       i (int): index.
     *
     *   Returns:
     *       target item (PlaceholderType).
     * */
    public PlaceHolderType recursive(ListNode n, int i){
        if(i==0) {
            return n.item;
        }else{
            return recursive(n.next, i-1);
        }
    }
    /**  Dummy main function for test.
     *
     * */
    public static void main(String[] args) {
        LinkedListDeque<Integer> Dllist = new LinkedListDeque<>();
        Dllist.addFirst(666);
        Dllist.addLast(6666);
        Dllist.addLast(66666);
        Dllist.printDeque();                        // expected (666 6666 66666)
        System.out.println("Test getIterative #1");
        System.out.println(Dllist.getIterative(0)); // expected 666
        System.out.println(Dllist.getIterative(1)); // expected 6666
        System.out.println(Dllist.getIterative(5)); // expected null
        System.out.println("Test getIterative #1");
        System.out.println(Dllist.getRecursive(0)); // expected 666
        System.out.println(Dllist.getRecursive(1)); // expected 6666
        System.out.println("Test done!");

        Dllist.removeFirst();
        Dllist.printDeque();                        // expected (6666 66666)
        System.out.println("Test getIterative #2 removeFirst");
        System.out.println(Dllist.getIterative(0)); // expected 6666
        System.out.println(Dllist.getIterative(1)); // expected 66666
        System.out.println("Test getRecursive #2 removeFirst");
        System.out.println(Dllist.getRecursive(0)); // expected 6666
        System.out.println(Dllist.getRecursive(1)); // expected 66666

        Dllist.removeLast();
        Dllist.printDeque();                        // expected 6666
        System.out.println("Test getIterative #3 removeLast");
        System.out.println(Dllist.getIterative(0)); // expected 6666
        System.out.println(Dllist.getIterative(1)); // expected null
        System.out.println("Test getRecursive #3 removeFirst");
        System.out.println(Dllist.getRecursive(0)); // expected 6666
        System.out.println(Dllist.getRecursive(1)); // expected null
    }

}