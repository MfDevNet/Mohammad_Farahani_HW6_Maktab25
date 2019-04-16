package mylinklist;

public class MyLinkList {
    Node first;

    public void add(int o) {

        Node new_Node=new Node(o);
        new_Node.next=null;

        if(this.first==null){
            this.first=new_Node;
        }else{
            Node last=this.first;
            while (last.next!=null){
                last=last.next;
            }
            last.next=new_Node;
        }



    }
    public void remove(int o){

    }
    public  void isEmpty(int o){

    }

    public void printLinkList(MyLinkList list){

        Node pointer=list.first;
        while (pointer !=null){
            System.out.print(pointer.value+" ");
            pointer=pointer.next;
        }

    }

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            next = null;

        }

    }

}
