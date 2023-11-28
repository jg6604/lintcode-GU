class Node{
    public int val;
    public Node next;
    public Node(int _val){
        val=_val;
        next=null;
    }
}

public class MyQueue {
    /*
     * @param item: An integer
     * @return: nothing
     */
    public Node first,last;

    public MyQueue(){
        first=last=null;
    }

    public void enqueue(int item) {
        // write your code here
        if(first==null){
            last=new Node(item);
            first=last;
        } else{
            last.next=new Node(item);
            last=last.next;
        }
    }

    /*
     * @return: An integer
     */
    public int dequeue() {
        // write your code here
        if(first!=null){
            int item = first.val;
            first=first.next;
            return item;
        }
        return -1;
    }
}