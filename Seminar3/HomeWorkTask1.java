// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее ариф. значение
package Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class HomeWorkTask1 {
    public static void main(String[] args) {

        int numberOfElements = 20;
        List<Integer> arr = createRanomArrayLists(numberOfElements);
        System.out.println("Произвольный список целых числел:");
        printList(arr);

        deleteEvenNumbersFromArrayList(arr);
        System.out.println("Список после удаления: ");
        printList(arr);

        System.out.printf("Максимальное число: %d", getMaximumValue(arr));
        System.out.println();

        System.out.printf("Минимальне число: %d", getMinimumValue(arr));
        System.out.println();

        System.out.printf("Среднеарифмитическое по списку: %f", getArithmeticMeanValue(arr));
        System.out.println();

    }

    public static List<Integer> createRanomArrayLists(int numberOfElements) {
        List<Integer> returnArray = new ArrayList<Integer>();
        Random randomizer = new Random();
        for (int i = 0; i < numberOfElements; i++) {
            returnArray.add(randomizer.nextInt(10000));
        }
        return returnArray;
    }

    public static void deleteEvenNumbersFromArrayList(List<Integer> arr) {
        System.out.println("Удаляем все четные числа из списка:");
        Iterator<Integer> iterArray = arr.iterator();
        while (iterArray.hasNext()) {
            if ((Integer) iterArray.next() % 2 == 0)
                iterArray.remove();

        }
    }

    public static void printList(List<Integer> arr) {

        for (int i = 0; i < arr.size(); i++) {
            if (i != 0)
                System.out.print(" ");
            System.out.print(arr.get(i));
        }
        System.out.println();
    }

    public static int getMaximumValue(List<Integer> arr) {
        int maxValue = arr.get(0);
        int currentValue = maxValue;
        for (int i = 0; i < arr.size(); i++) {
            currentValue = arr.get(i);
            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
        }
        return maxValue;
    }

    public static int getMinimumValue(List<Integer> arr) {
        int minValue = arr.get(0);
        int currentValue = minValue;
        for (int i = 0; i < arr.size(); i++) {
            currentValue = arr.get(i);
            if (currentValue < minValue) {
                minValue = currentValue;
            }
        }
        return minValue;
    }

    public static float getArithmeticMeanValue(List<Integer> arr) {
        int sizeOfArr = arr.size();
        float mean = 0;
        for (int i = 0; i < sizeOfArr; i++) {
            mean += arr.get(i);
        }
        return mean / sizeOfArr;
    }

}
