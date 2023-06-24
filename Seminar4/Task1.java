package Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            list1.add(i);
        }
        System.out.println(System.currentTimeMillis() - timeStart);


        long timeStart2 = System.currentTimeMillis();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            list2.add(i);
        }
        System.out.println(System.currentTimeMillis() - timeStart2);

    }
}
