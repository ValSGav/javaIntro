package Seminar6;
//1. Напишите метод, который заполнит массив из 99 элементов случайным цифрами 0 до 50.
//2. Создайте метод, в кторый передайте заполненный выше массив и спомощью Set вычислите процент уникальных значений
// в данном массиве и верните его в виде числа с плавающей запятой.
//процент уникальных числел = количество уникальных числе *100/ общее количество числе в массиве

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        int countOfNumbersInArray = 99;
        int range = 50;
        Integer[] array = getRandomFillArray(countOfNumbersInArray, range);
        System.out.println(Arrays.toString(array));
        System.out.println(getPercentOfUnicalNumbers(array));
    }

    public static Integer[] getRandomFillArray(int countOfNumbersInArray, int range){
        Integer[] returnArray = new Integer[countOfNumbersInArray];
        Random rand = new Random();
        for (int i = 0; i < countOfNumbersInArray; i++) {
            returnArray[i] = rand.nextInt(range);
        }
        return returnArray;
    }

    public static float getPercentOfUnicalNumbers(Integer[] array){
        int sizeOfArray = array.length;
        Set<Integer> setOfElementsOfArray = new HashSet<Integer>(Arrays.asList(array));
        System.out.println(setOfElementsOfArray.toString());
        return (float) setOfElementsOfArray.size() / sizeOfArray * 100;

    }
}
