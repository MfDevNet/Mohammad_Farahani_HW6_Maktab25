package mylinklist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkList list = new MyLinkList();
        System.out.println("Add :");
        list.add(7);
        list.add(7);
        list.add(5);
        list.add(5);
        list.add(10);
        list.add(7);
        list.add(3);
        list.add(4);
        list.add(20);
        list.print();
        System.out.print("Check for Empty : ");
        System.out.println(list.isEmpty());
        System.out.println("Remve : ");
        list.remove(5);
        list.remove(5);
        list.remove(4);
        list.remove(7);
        list.print();
        System.out.println("Find by containts : (3)");
        System.out.println(list.find(3));
        System.out.println("Remove All : ");
        list.removeAll();
        System.out.print("Get Size : ");
        System.out.println(list.getSize());

        list.print();
        System.out.println("Add :");
        list.add(7);
        list.add(3);
        list.add(4);
        list.add(20);
        list.print();
        System.out.println("Add First :");
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.print();
        System.out.println("Remove : ");
        list.remove(4);
        list.remove(5);
        list.print();
        System.out.println("Find by Index : ");
        System.out.println(list.findByIndex(5));
        System.out.println(list.findByIndex(4));
        list.print();
        System.out.print("Get Size : ");
        System.out.println(list.getSize());

    }
}
