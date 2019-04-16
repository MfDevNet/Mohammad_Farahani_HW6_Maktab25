/*
Create class by Mohmmad Marahani
Author MfDevNet
this class use of model recessive
for remove bad element
*/
package ArrayListCheck;

import java.util.ArrayList;

public class ArrayListCheck {
    public static void arrayListCheck(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("List is Empty");
            return;
        } else if (list.size() % 2 != 0) {
            list.remove(list.size() - 1);
            arrayListCheck(list);
        } else {
            for (int i = list.size() - 1; i >= 0; i -= 2) {
                if (list.get(i) < list.get(i - 1)) {
                    list.remove(i);
                    list.remove(i - 1);
                }
            }
        }//end of if_esleif_else

    }// end of Method ArrayListCheck
}//end of  class ArrayListCheck
