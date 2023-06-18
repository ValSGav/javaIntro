package Seminar4;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;


public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        String inString = sc.nextLine();
        Deque<String> stack1 = new LinkedList<String>();
        
        while (!inString.equals("exit")) {

            if (inString.startsWith("print")) {
                while (!stack1.isEmpty()){
                System.out.println(stack1.pop());
            }
            }
            else{
                stack1.push(inString);
            }
            inString = sc.nextLine();        
        }
        sc.close();
    }    
}
