/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp=head;
        Map<Node,Node> a= new HashMap<>();
        while(temp!=null){
           Node newNode=new Node(temp.val);
           a.put(temp,new Node(temp.val));
           temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            Node copyNode =a.get(temp);
            copyNode.next=a.get(temp.next);
            copyNode.random=a.get(temp.random);
            temp=temp.next;
        }
        return a.get(head);
    }
}