package mylinklist;

public class MyLinkList {
    static Node pointer;
    static Node prev;
    Node first;

    public void add(int o) {

        Node new_Node = new Node(o);
        new_Node.next = null;

        if (this.first == null) {
            this.first = new_Node;
        } else {
            Node last = this.first;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_Node;
        }


    }

    public void removeAll(){
        pointer=first;
        while (pointer.next!=null){
            first=null;
            prev=pointer;
            pointer=pointer.next;
            prev.next=null;

        }
    }

    public void remove(int o) {
        if (this.find(o)) {
            if (pointer==first){
                first=pointer.next;
            }else if(pointer.next !=first && pointer.next!=null){
                prev.next=pointer.next;
            }else if(pointer.next==null){
                pointer=null;
            }

        }

    }

    public boolean find(int o) {
        pointer = this.first;
        while (pointer != null) {
            if (pointer.value == o) {
                return true;
            } else {
                prev=pointer;
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

    public void printLinkList(MyLinkList list) {

        pointer = list.first;
        System.out.print("{");
        while (pointer != null) {
            System.out.print(pointer.value + ",");
            pointer = pointer.next;
        }
        System.out.print("}");
        System.out.println();

    }

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            next = null;

        }

        @Override
        public String toString() {
            return value+"";
        }
    }

}
