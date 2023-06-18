package Seminar4;

import java.nio.charset.Charset;
import java.util.Deque;
import java.util.LinkedList;
import java.util.zip.Inflater;

public class HomeWork {

    public static void main(String[] args) {

        int firstNumb = 321;
        int secondNumb = -927;

        System.out.printf("Первое число: %d", firstNumb);
        System.out.println();
        System.out.printf("Второе число: %d", secondNumb);
        System.out.println();

        Deque<Character> dequeOfFirstNumb = getDequeFromNumber(firstNumb, true);
        Deque<Character> dequeOfSecondNumb = getDequeFromNumber(secondNumb, true);


        System.out.printf("Очередь цифр первого числа(в обратном порядке): %s", dequeOfFirstNumb);
        System.out.println();
        System.out.printf("Очередь цифр второго числа(в обратном порядке) : %s", dequeOfSecondNumb);
        System.out.println();
        System.out.println();

        System.out.printf("Очередь цифр числа, результата перемножения: %s", getMultOfTwoReverseDeque(dequeOfFirstNumb, dequeOfSecondNumb));
        System.out.println();
        
        dequeOfFirstNumb = getDequeFromNumber(firstNumb, true);
        dequeOfSecondNumb = getDequeFromNumber(secondNumb, true);

        System.out.printf("Очередь цифр числа, результата сложения: %s", getAddOfTwoReverseDeque(dequeOfFirstNumb, dequeOfSecondNumb));

    };

    public static Deque<Character> getMultOfTwoReverseDeque(Deque<Character> dequeNumb1, Deque<Character> dequeNumb2) {
        int result = getNumberFromReverceDeque(dequeNumb1) * getNumberFromReverceDeque(dequeNumb2);
        return getDequeFromNumber(result, false);
    }

    public static Deque<Character> getAddOfTwoReverseDeque(Deque<Character> dequeNumb1, Deque<Character> dequeNumb2) {
 
        int result = getNumberFromReverceDeque(dequeNumb1) + getNumberFromReverceDeque(dequeNumb2);
        return getDequeFromNumber(result, false);
    }

    public static Deque<Character> getDequeFromNumber(int number, boolean reverse) {
        Deque<Character> returnDeque = new LinkedList<Character>();
        boolean isNegative = false;

        if (number < 0) {
            isNegative = true;
            number = number * -1;
        }

        if (number == 0)
            returnDeque.push('0');

        while (number != 0) {
            int currDigit = number % 10;
            if (reverse)
                returnDeque.addLast(Integer.toString(currDigit).charAt(0));
            else
                returnDeque.addFirst(Integer.toString(currDigit).charAt(0));
            number = number / 10;
        }

        if (isNegative)
            if (reverse)
                returnDeque.addLast('-');
            else
                returnDeque.addFirst('-');
        return returnDeque;
    };

    public static int getNumberFromReverceDeque(Deque<Character> decueNumb) {
        int number = 0;
        boolean isNegative = false;
        int digit = 1;

        while (!decueNumb.isEmpty()) {
            Character currentChar = decueNumb.pop();
            if (currentChar == '-') {
                isNegative = true;
            } else {
                number = number + Character.digit(currentChar, 10) * digit;
                digit *= 10;
            }
        }
        ;

        if (isNegative)
            number *= -1;

        return number;
    }
}
