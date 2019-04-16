package demoturners;

public class DemoTurners {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        Page page = new Page();
        Pancake cake = new Pancake();
        leaf.turn();
        page.turn();
        cake.turn();
        System.out.println("===============");
        System.out.println("use Loop");
        Turner[] turners={leaf,page,cake,new Dog(),new Book()};
        for (Turner turner:turners){
            turner.turn();
        }



    }


}
