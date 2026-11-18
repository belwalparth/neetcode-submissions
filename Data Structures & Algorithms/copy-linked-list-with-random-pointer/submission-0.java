class Solution {
    public Node copyRandomList(Node head) {

        Map<Node, Node> map = new HashMap<>();

        Node curr = head;

        // Pass 1: Create copies
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // Pass 2: Connect next and random
        curr = head;

        while (curr != null) {
            Node copy = map.get(curr);
            Node next= map.get(curr.next);
            Node random=map.get(curr.random);
            copy.next=next;
            copy.random=random;

            curr = curr.next;

        }

        return map.get(head);
    }
}