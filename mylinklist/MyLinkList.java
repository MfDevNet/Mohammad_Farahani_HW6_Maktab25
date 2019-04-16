package mylinklist;

public class MyLinkList {
    static Node pointer;
    static Node prev;
    Node first;
    int size = 0;

    public void add(int o) {

        Node new_Node = new Node(o);
        new_Node.next = null;

        if (this.first == null) {
            this.first = new_Node;
            size++;
        } else {
            Node last = this.first;
            while (last.next != null) {
                last = last.next;

            }
            last.next = new_Node;
            size++;
        }


    }

    public void removeAll() {
        pointer = first;
        while (pointer.next != null) {
            first = null;

            prev = pointer;
            pointer = pointer.next;
            prev.next = null;
            size--;
        }
        size--;
    }


    public void addFirst(int o) {
        Node newNode = new Node(o);
        newNode.next = null;
        if (this.first == null) {
            this.first = newNode;
            size++;
        } else {
            newNode.next = first;
            this.first = newNode;
            size++;
        }

    }

    public void remove(int o) {
        if (this.find(o)) {
            if (pointer == first) {
                first = pointer.next;
                size--;
            } else if (pointer.next != first && pointer.next != null) {
                prev.next = pointer.next;
                size--;
            } else if (pointer.next == null) {
                pointer = null;
                size--;
            }

        }

    }

    public int getSize() {
        return this.size;
    }

    private Node last() {
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        return pointer;
    }

    public Node findByIndex(int index) {
        Node x = first;
        if (index > (size >> 1)) {
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        } else {

            x = last();
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    public boolean find(int o) {
        pointer = this.first;
        while (pointer != null) {
            if (pointer.value == o) {
                return true;
            } else {
                prev = pointer;
                pointer = pointer.next;
            }
        }
        return false;
    }


    public boolean isEmpty() {
        if (this.first == null) {
            System.out.println("List is Empty");
            return true;
        } else return false;

    }

    public void print() {

        pointer = this.first;
        System.out.print("{");
        while (pointer != null) {
            System.out.print(pointer.value + (pointer.next != null ? "," : ""));
            pointer = pointer.next;
        }
        System.out.print("}");
        System.out.println();

    }

    static class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {

            this.value = value;
            next = null;
            prev = null;

        }

        @Override
        public String toString() {
            return value + "";
        }
    }

}
