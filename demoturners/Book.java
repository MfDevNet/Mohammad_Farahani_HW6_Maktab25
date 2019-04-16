package demoturners;

public class Book implements Turner {

    @Override
    public void turn() {
        System.out.println("Book is Best Friend");
    }
}
