class MyLinkedList {
    class Node {
        int val;
        Node next;

        public Node(int v) {
            this.val = v;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index >= size) {
            return -1;
        }

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;

        if (head.next == null) {
            tail = head;
        }
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (tail != null) {
            tail.next = newNode;
        }

        if (tail == null || size == 0) {
            head = newNode;
        }

        tail = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            Node node = head;

            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }

            Node newNode = new Node(val);
            newNode.next = node.next;
            node.next = newNode;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (size == 0 || index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
            size--;

            if (size == 0) {
                tail = null;
            }

        } else {
            Node node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            node.next = node.next.next;
            size--;

            if (node.next == null) {
                tail = node;
            }
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */