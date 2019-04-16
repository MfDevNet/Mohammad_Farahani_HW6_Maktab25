package demoturners;

public class Leaf implements ITurner {
    @Override
    public void turn() {
        System.out.println("Changing colors");
    }
}
