package CollectionsProgram.ArrayList;

import java.util.ArrayList;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        al1.add(18);
        al1.add(1);
        al1.add(4);
        al1.add(11);
        al1.add(2003);

        al2.add(9);
        al2.add(10);
        al2.add(14);
        al2.add(25);

        System.out.println(al1);
        System.out.println(al2);

        al1.addAll(3, al2);
        System.out.println("Collection al1 after adding al2 to 3rd index: " + al1);

        //using for loop
        for (int i = 0; i < al1.size(); i++) {
            System.out.print(al1.get(i) + " ");
        }
        System.out.println();
        System.out.println("*********************************************************");

        //using for-each loop
        for (Integer l : al1) {
            System.out.print(l + " ");
        }
        System.out.println();
        System.out.println("*********************************************************");

        //using Iterator
        Iterator<Integer> itr = al1.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + " ");
        System.out.println();
        System.out.println("*********************************************************");

        //using ListIterator
        ListIterator<Integer> litr = al1.listIterator();
        while (litr.hasNext())
            System.out.print(litr.next() + " ");
        System.out.println();
        while (litr.hasPrevious())
            System.out.print(litr.previous() + " ");
    }
}
