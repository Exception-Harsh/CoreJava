package CollectionsProgram.LinkedList;

import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
            LinkedList<Integer> ll1=new LinkedList<>();

            ll1.add(100);
            ll1.add(200);
            ll1.add(300);
            ll1.add(300);

            System.out.println(ll1);


            System.out.println(ll1.get(1));

            System.out.println(ll1.indexOf(300));
            System.out.println(ll1.lastIndexOf(300));
            System.out.println(ll1.getFirst());
            System.out.println(ll1.getLast());

            ll1.push(10);
            System.out.println(ll1);

            System.out.println(ll1.pop());

            ListIterator<Integer> litr = ll1.listIterator();
            while(litr.hasNext())
                System.out.print(litr.next() + " ");
            System.out.println();
    }
}