package ArrayListCheck;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //random create list
        Random rnd = new Random();
        int randNumebr=rnd.nextInt((5 + 5) - 1 ) + 5;
        for (int i = 0; i <randNumebr; i++) {
            list.add(rnd.nextInt((50 - (-50)) + 1) + (-50));
        }

        // print and send list for check by ArraylistCheck
        System.out.println(list);
        ArrayListCheck.arrayListCheck(list);
        System.out.println(list);
    }
}
