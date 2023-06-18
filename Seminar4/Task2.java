package Seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        String inString = sc.nextLine().toString();
        LinkedList<String> myList = new LinkedList<String>();
        while (!inString.equals("exit")) {

            if (inString.startsWith("print~")) {
                int indexOfElement = Integer.parseInt(inString.split("~")[1]);
                System.out.println(myList.get(indexOfElement));
                myList.remove(indexOfElement);
            }
            else{
                myList.add(inString);
            }
            inString = sc.nextLine();
        }
        sc.close();
    }

}
