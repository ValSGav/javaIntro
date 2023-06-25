// Написать программу, определяющую правильность расстановки скобок в выражении.

// Пример 1: a+(d*3) - истина

// Пример 2: [a+(1*3) - ложь

// Пример 3: [6+(3*3)] - истина

// Пример 4: {a}[+]{(d*3)} - истина

// Пример 5: <{a}+{(d*3)}> - истина

// Пример 6: {a+]}{(d*3)} - ложь

// <({[]})> --- истина

package Seminar5;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        //String inputString = "a+(d*3)";
        //String inputString = "[a+(1*3)";
        //String inputString = "[6+(3*3)]";
        //String inputString = "{a}[+]{(d*3)}";
        //String inputString = "<{a}+{(d*3)}>";
        String inputString = "{a+]}{(d*3)}";
        
        System.out.println(isValidExpression(inputString));        
    }

    public static boolean isValidExpression(String inputString){

        System.out.printf("Входная строка: %s \n", inputString);

        Character currentChar = ' ';

        Map<Character, Character> openClosingPair = new TreeMap<Character, Character>();
        
        openClosingPair.put('}', '{');
        openClosingPair.put('>', '<');
        openClosingPair.put(')', '(');
        openClosingPair.put(']', '[');
        
        Stack<Character> stack = new Stack<Character>();        

        for (int i = 0; i < inputString.length(); i++) {
            currentChar = inputString.charAt(i);            

            if(openClosingPair.containsValue(currentChar)){
                stack.push(currentChar);
            };
            if(openClosingPair.containsKey(currentChar)){
                if(stack.isEmpty() || !stack.pop().equals(openClosingPair.get(currentChar))){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    
}
